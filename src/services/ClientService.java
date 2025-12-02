/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import connexion.Connexion;
import dao.IDao;
import entities.Client;
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
public class ClientService implements IDao<Client> {
    
    @Override
    public boolean create(Client client) {
        try {
            String req = "INSERT INTO `client` (`id_client`, `nom`, `prenom`, `telephone`) VALUES (NULL, ?, ?, ?)";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, client.getNom());
            ps.setString(2, client.getPrenom());
            ps.setString(3, client.getTelephone());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ClientService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }   
    }

    @Override
    public boolean update(Client client) {
        try {
            String req = "UPDATE `client` SET `nom` = ?, `prenom` = ?, `telephone` = ? WHERE `client`.`id_client` = ?";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setString(1, client.getNom());
            ps.setString(2, client.getPrenom());
            ps.setString(3, client.getTelephone());
            ps.setInt(4,client.getId_client());

            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ClientService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }  
    }   

    @Override
    public boolean delete(Client client) {
        try {
            String req = " DELETE FROM client WHERE `id_client` = ?";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setInt(1,client.getId_client());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ClientService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }    
    }
    
    @Override
    public  Client findById(int id) {
             try {
            String req = " select * from client where `id_client`= ? ";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Client (rs.getInt("id_client"), rs.getString("nom"), rs.getString("prenom"), rs.getString("telephone"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClientService.class.getName()).log(Level.SEVERE, null, ex);
            
        }   
        return null;
    }

    @Override
    public List<Client> findAll() {
        List<Client> clients=new ArrayList();
        try {
            String req = " select * from client ";
            PreparedStatement ps = Connexion.getConnection().prepareStatement(req);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                clients.add ( new Client (rs.getInt("id_client"), rs.getString("nom"), rs.getString("prenom"), rs.getString("telephone")));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClientService.class.getName()).log(Level.SEVERE, null, ex);
            
        }   
       return clients;
    }

}
