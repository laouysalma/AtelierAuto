/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author X1 YOGA
 */
public class Client {
    private int id_client;
    private String nom;
    private String prenom;
    private String telephone;

    public Client() {
    }

    public Client(int id_client, String nom, String prenom, String telephone) {
        this.id_client = id_client;
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }
    
    public Client(String nom, String prenom, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
    }

    public int getId_client() {
        return id_client;
    }
    
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Client{" + "id_client=" + id_client + ", nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + '}';
    }


    

   
   
   
}
