/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;
import connexion.Connexion;
import dao.IDao;
import entities.Vehicule;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author X1 YOGA
 */

public class VehiculeService implements IDao<Vehicule> {

    @Override
    public boolean create(Vehicule vehicule) {
        try {
            String req="insert into `vehicule` (`immatricule`,`marque`,`modele`, `id_client`) VALUES(?,?,?,?)";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, vehicule.getImmatricule());
            ps.setString(2, vehicule.getMarque());
            ps.setString(3, vehicule.getModele());
            ps.setInt(4, vehicule.getIdClient());  
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            Logger.getLogger(VehiculeService.class.getName()).log(Level.SEVERE, null,e);
            return false;
        }
    }

    @Override
    public boolean update(Vehicule vehicule) {
        try {
            String req = "UPDATE `vehicule` SET `marque` = ?, `modele` = ?, `id_client` = ? WHERE `immatricule` = ?";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, vehicule.getMarque());
            ps.setString(2, vehicule.getModele());
            ps.setInt(3, vehicule.getIdClient());  
            ps.setString(4, vehicule.getImmatricule());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(VehiculeService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean delete(Vehicule vehicule) {
        try {
            String req = "DELETE FROM vehicule WHERE immatricule = ?";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, vehicule.getImmatricule());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(VehiculeService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public Vehicule findById(int id) {
        throw new UnsupportedOperationException("findById(int) non applicable pour cette classe. Utiliser findById(String).");
    }

    public Vehicule findById(String immat){
        Vehicule veh=null;
        try{
            String req = " select * FROM vehicule WHERE `immatricule` = ?";
            PreparedStatement ps= Connexion.getConnection().prepareStatement(req);
            ps.setString(1,immat);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                 veh = new Vehicule (rs.getString("immatricule"), rs.getString("marque"), rs.getString("modele"), rs.getInt("id_client"));
            }
        }catch(Exception ex){
            Logger.getLogger(VehiculeService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return veh;
    }

    @Override
    public List<Vehicule> findAll() {
        List <Vehicule> vehicules=new ArrayList<>();
        try {
            String req = " select * FROM vehicule  ";
            PreparedStatement ps= Connexion.getConnection().prepareStatement(req);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                vehicules.add ( new Vehicule (rs.getString("immatricule"), rs.getString("marque"), rs.getString("modele"), rs.getInt("id_client")));
            }
        }catch (Exception ex) {
            Logger.getLogger(VehiculeService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vehicules;
    }
    public List<Vehicule> findByMarque(String marque) {
    List<Vehicule> vehicules = new ArrayList<>();
    try {
        String req = "SELECT * FROM vehicule WHERE marque LIKE ?";
        PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
        ps.setString(1, "%" + marque + "%");  
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            vehicules.add(new Vehicule(
                rs.getString("immatricule"),
                rs.getString("marque"),
                rs.getString("modele"),
                rs.getInt("id_client")
            ));
        }

    } catch (Exception ex) {
        Logger.getLogger(VehiculeService.class.getName()).log(Level.SEVERE, null, ex);
    }

    return vehicules;
}

}