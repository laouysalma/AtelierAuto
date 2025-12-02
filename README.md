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
[Regarder la démonstration vidéo](https://drive.google.com/file/d/1eg_nTmogGUYd0QM080zinNWPlYfWTCBo/view?usp=sharing)


## Base de donnees 
``` SQL
#Créer la base de données
CREATE DATABASE IF NOT EXISTS atelier_reparation;
USE atelier_reparation;

#Table: client
CREATE TABLE IF NOT EXISTS client (
  id_client INT(11) NOT NULL AUTO_INCREMENT,
  nom VARCHAR(50) NOT NULL,
  prenom VARCHAR(50) NOT NULL,
  telephone VARCHAR(50) NOT NULL,
  PRIMARY KEY (id_client)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

#Table: utilisateur
CREATE TABLE IF NOT EXISTS utilisateur (
  id INT(11) NOT NULL AUTO_INCREMENT,
  nom VARCHAR(50) DEFAULT NULL,
  prenom VARCHAR(50) DEFAULT NULL,
  email VARCHAR(100) NOT NULL,
  password VARCHAR(255) NOT NULL,
  date_creation TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id),
  UNIQUE KEY email (email)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

#Table: vehicule
CREATE TABLE IF NOT EXISTS vehicule (
  immatricule VARCHAR(50) NOT NULL,
  marque VARCHAR(50) NOT NULL,
  modele VARCHAR(50) NOT NULL,
  id_client INT(11) NOT NULL,
  PRIMARY KEY (immatricule),
  KEY fk_client_owner (id_client),
  CONSTRAINT fk_client_owner FOREIGN KEY (id_client) 
    REFERENCES client (id_client) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

#Table: reparation
CREATE TABLE IF NOT EXISTS reparation (
  id_reparation INT(11) NOT NULL AUTO_INCREMENT,
  immatricule VARCHAR(50) NOT NULL,
  date DATE NOT NULL,
  type VARCHAR(60) NOT NULL,
  cout FLOAT NOT NULL,
  PRIMARY KEY (id_reparation),
  KEY fk_vehicule_repare (immatricule),
  CONSTRAINT fk_vehicule_repare FOREIGN KEY (immatricule) 
    REFERENCES vehicule (immatricule) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
```

## Développeur
Salma Laouy – ENS Marrakech, 3ᵉ année Informatique
Projet académique : gestion de réparations de véhicules

## Encadrant
Pr. Mohamed LACHGAR – Professeur en informatique
