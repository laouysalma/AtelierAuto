## Atelier_auto – Gestion des réparations (Java)

Atelier_auto est une application Java Desktop développée avec NetBeans et Swing, permettant la gestion complète des réparations de véhicules.
Le projet suit une architecture proche du MVC, utilise des services pour la logique métier et est connecté à une base de données JDBC

## Architecture du projet

Le projet est organisé en plusieurs couches :

- **app/** : Contient les tests utilitaires de l’application.  
- **connexion/** : Gestion de la connexion à la base de données (JDBC).  
- **dao/** : Accès aux données (CRUD).  
- **entities/** : Classes entités (`Reparation`, `Vehicule`, `Client`).  
- **services/** : Logique métier.  
- **ui/** : Interfaces graphiques Swing et point d’entrée `Main.java`.  
- **images/** : Ressources graphiques (icônes, logos…).

## Fonctionnalités principales

Gestion des clients et de leurs véhicules.

Ajout, modification et suppression de réparations.

Visualisation des réparations en cours et terminées.

Gestion centralisée via une interface graphique intuitive.

Connexion à la base de données pour persistances des données.
## MCD (Modèle Conceptuel de Données)
![image alt](https://github.com/laouysalma/AtelierAuto/blob/main/mcd.jpg?raw=true)
## Démonstration vidéo

Une vidéo montrant l’utilisation de l’application peut être incluse ici :
[Regarder la vidéo](https://github.com/ton_utilisateur/ton_projet/blob/main/demo.mp4?raw=true)
https://drive.google.com/file/d/1eg_nTmogGUYd0QM080zinNWPlYfWTCBo/view?usp=sharing


## Développeur
Salma Laouy – ENS Marrakech, 3ᵉ année Informatique
Projet académique : gestion de réparations de véhicules

## Encadrant
Pr. Mohamed LACHGAR – Professeur en informatique
