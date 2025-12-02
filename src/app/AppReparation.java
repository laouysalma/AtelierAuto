/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author X1 YOGA
 */

import entities.*;
import java.util.ArrayList;
import services.*;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class AppReparation {

    public static void main(String[] args) {
        // ...
        ReparationService rs = new ReparationService();

        Reparation reparation = new Reparation("Vidange", 370.00,new Date(), "AAB217");
        boolean creation = rs.create(reparation);
        Map<String, Double> couts;
        couts = rs.getCoutParMois("AAB217");
        couts.forEach((mois, total) ->
                System.out.println("Mois : " + mois + " → Total : " + total + " DH")
        );

        System.out.println("\nHistorique complet de 22/AB/7890:");
        List<Reparation> historique = rs.findByVehicule("22/AB/7890");
        historique.forEach(System.out::println);
    }
}