# TPsHibernate
#Description génerale sur le tp d'Hibernate :

En intégrant Hibernate dans ce TP, nous optimisons la persistance des données en les reliant de manière efficace à la base de données. Les sessions Hibernate permettent de simplifier les opérations CRUD (Create, Read, Update, Delete) et d'améliorer la gestion des relations entre les entités, renforçant ainsi la cohérence et la performance des applications. Il est impératif de bien maîtriser les concepts d'Hibernate pour tirer pleinement parti de ses avantages dans chacun de ces contextes de TP.
# Exercice 1: Gestion de Produit

1. Intégration d'Hibernate pour la Gestion de Produit :
   - Configuration Hibernate :  On configure Hibernate via "hibernate.cfg.xml", en spécifiant les détails de la connexion à la base de données MySQL.
   - Mapping de la Classe Produit : On utilise les annotations Hibernate pour mapper la classe "Produit" à une table de la base de données, définissant ainsi la correspondance entre les attributs de la classe et les colonnes de la table.
   - Utilisation dans le Projet :  On intégre Hibernate pour gérer la persistance des objets "Produit" dans la base de données, facilitant ainsi les opérations courantes telles que l'ajout, la mise à jour, la suppression et la récupération des données relatives aux produits à travers les classes services .

# Exercice 3: Gestion des Projets

1. Intégration d'Hibernate pour la Gestion de Projet :
   - Configuration Hibernate : Configurez Hibernate pour le projet en définissant les paramètres de connexion dans "hibernate.cfg.xml".
   - Mapping des Classes :  On utilise les annotations Hibernate pour mapper les classes persistantes telles que "Tache", "Projet", "Employe", et "EmployeTache" aux tables correspondantes dans la base de données.
   - Utilisation dans le Projet : On appliquee Hibernate pour la gestion efficace des données liées aux tâches, projets, employés, et leurs relations à travers les classes services. Les sessions Hibernate facilitent la persistance et la récupération de ces données dans la base de données.

# Gestion de Mariage

1. Intégration d'Hibernate pour la Gestion de Mariage :
   - Configuration Hibernate : Initialisez Hibernate en configurant les paramètres de connexion dans "hibernate.cfg.xml".
   - Mapping des Classes liées au Mariage : On utilise les annotations Hibernate pour mapper les classes persistantes comme "Personne", "Homme", "Femme"`, et "Mariage" aux tables appropriées dans la base de données.
   - Utilisation dans le Projet : On met en œuvre Hibernate pour gérer les données relatives aux personnes et aux mariages à travers les classes services. Les sessions Hibernate facilitent l'interaction et la persistance cohérente de ces données dans la base de données.

Voici les shémas de bases de données & les shémas de projets de ce tP:

# Ex1TPHibernate:
![imag](https://github.com/salmachtioui/TPsHibernate/assets/147477621/8bc233da-662a-49ae-a799-8d29b5d9c589)
![imag1](https://github.com/salmachtioui/TPsHibernate/assets/147477621/53f65ebe-2062-4b6e-8bfe-9d62e1539d59)

# Ex2TPHibernate:
![ima1](https://github.com/salmachtioui/TPsHibernate/assets/147477621/8acd2eee-a703-4ce8-b5b5-fc162bda7fc7)
![imag3](https://github.com/salmachtioui/TPsHibernate/assets/147477621/63594c81-843e-4039-b78b-72171617814f)

# Ex3TPHibernate:
![ima2](https://github.com/salmachtioui/TPsHibernate/assets/147477621/766dbbcc-7ffb-4b86-b772-50f9e693c8a3)
![imag2](https://github.com/salmachtioui/TPsHibernate/assets/147477621/bedb2898-6fbc-41ac-a873-5265828a52d9)
