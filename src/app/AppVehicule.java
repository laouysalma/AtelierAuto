/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import java.util.Date;
import entities.Vehicule;
import java.util.ArrayList;
import java.util.List;
import services.VehiculeService;
/**
 *
 * @author X1 YOGA
 */


public class AppVehicule {
    public static void main(String[] args) {
        List<Vehicule> list= new ArrayList();
        VehiculeService veh= new VehiculeService() ;


        //boolean rs= veh.delete(veh.findById("AAB217")); // Assuming 'jkk' is an existing or old test immat
        //System.out.println("Résultat de la suppression: " + rs);
        Vehicule veh1 = new Vehicule(
                "yY-456-ZA",
                "Mercedes",
                "C220",
                1 
        );
        boolean creationReussie = veh.create(veh1);
        System.out.println("Résultat de la création de yY-456-ZA : " + (creationReussie ? "RÉUSSIE" : "ÉCHOUÉE")); 
        list=veh.findAll();
        System.out.println("Liste des véhicules: " + list);

        System.out.println("Véhicule 22/AB/7890: " + veh.findById("22/AB/7890"));
    }
}