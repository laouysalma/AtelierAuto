
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.IDao;
import entities.Reparation;
import connexion.Connexion;
import java.sql.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ReparationService implements IDao<Reparation> {

    @Override
    public boolean create(Reparation r) {
        try {
            String req = "INSERT INTO reparation (type, cout, date, immatricule) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);

            ps.setString(1, r.getType());
            ps.setDouble(2, r.getCout());
            ps.setDate(3, new java.sql.Date(r.getDate().getTime()));
            ps.setString(4, r.getImmatricule());

            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Reparation r) {
        try {
            String req = "UPDATE `reparation` SET `type` = ?, `cout` = ?, `date` = ?, `immatricule` = ? WHERE `id_reparation` = ?";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, r.getType());
            ps.setDouble(2, r.getCout());
            ps.setDate(3, new java.sql.Date(r.getDate().getTime()));
            ps.setString(4, r.getImmatricule());
            ps.setInt(5, r.getId_reparation());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Reparation r) {
        try {
            String req = "DELETE FROM reparation WHERE id_reparation = ?";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setInt(1, r.getId_reparation());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }

    @Override
    public Reparation findById(int id) {
        try {
            String req = "SELECT * FROM reparation WHERE id_reparation = ?";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Reparation(
                        rs.getInt("id_reparation"),
                        rs.getString("immatricule"),
                        rs.getDate("date"),
                        rs.getString("type"),
                        rs.getDouble("cout")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Reparation> findAll() {
        List<Reparation> list = new ArrayList<>();
        try {
            String req = "SELECT * FROM reparation";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Reparation(
                        rs.getInt("id_reparation"),
                        rs.getString("immatricule"),
                        rs.getDate("date"),
                        rs.getString("type"),
                        rs.getDouble("cout")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Reparation> findByVehicule(String imat) {
        List<Reparation> list = new ArrayList();
        try {
            String req = "SELECT * FROM reparation WHERE immatricule =?";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, imat);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Reparation(
                        rs.getInt("id_reparation"),
                        rs.getString("immatricule"),
                        rs.getDate("date"),
                        rs.getString("type"),
                        rs.getDouble("cout")
                ));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Map<String, Double> getCoutParMois(String imat) {
        List<Reparation> reparations = findByVehicule(imat);
        Map<String, Double> coutParMois = new TreeMap<>();
        for (Reparation r : reparations) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(r.getDate());
            int annee = cal.get(Calendar.YEAR);
            int mois = cal.get(Calendar.MONTH) + 1;

            String key = annee + "-" + (mois < 10 ? "0" + mois : mois);

            coutParMois.put(key, coutParMois.getOrDefault(key, 0.0) + r.getCout());
        }
        return coutParMois;
    }

    public List<Reparation> findByType(String type) {
        List<Reparation> list = new ArrayList<>();
        try {
            String req = "SELECT * FROM reparation WHERE type = ?";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, type);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Reparation(
                        rs.getInt("id_reparation"),
                        rs.getString("immatricule"),
                        rs.getDate("date"),
                        rs.getString("type"),
                        rs.getDouble("cout")
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Map<String, Double> getCoutMensuelGlobal() {
        Map<String, Double> coutParMois = new TreeMap<>();
        try {
            String req = "SELECT * FROM reparation ORDER BY date";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                java.util.Date date = rs.getDate("date");
                double cout = rs.getDouble("cout");

                Calendar cal = Calendar.getInstance();
                cal.setTime(date);
                int annee = cal.get(Calendar.YEAR);
                int mois = cal.get(Calendar.MONTH) + 1;

                String key = annee + "-" + (mois < 10 ? "0" + mois : mois);
                coutParMois.put(key, coutParMois.getOrDefault(key, 0.0) + cout);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return coutParMois;
    }

    public List<String> getAllTypes() {
        List<String> types = new ArrayList<>();
        try {
            String req = "SELECT DISTINCT type FROM reparation ORDER BY type";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                types.add(rs.getString("type"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return types;
    }

}
