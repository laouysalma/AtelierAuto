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
public class Vehicule {
    private String marque;
    private String modele;
    private String immatricule;
    private int idClient;

    public Vehicule() {}


    public Vehicule(String immatricule, String marque, String modele, int idClient) {
        this.immatricule = immatricule;
        this.marque = marque;
        this.modele = modele;
        this.idClient = idClient;
    }

    public Vehicule(String immatricule, String marque, String modele) {
        this.immatricule = immatricule;
        this.marque = marque;
        this.modele = modele;
    }

    public String getMarque() { return marque; }
    public String getModele() { return modele; }
    public String getImmatricule() { return immatricule; }

     public int getIdClient() { return idClient; }
    public void setIdClient(int idClient) { this.idClient = idClient; }

    public void setMarque(String marque) { this.marque = marque; }
    public void setModele(String modele) { this.modele = modele; }
    public void setImmatricule(String immatricule) { this.immatricule = immatricule; }

    @Override
    public String toString() {
        return "Vehicule{" + "immatricule=" + immatricule + ", marque=" + marque + ", modele=" + modele + ", idClient=" + idClient + '}';
    }
}