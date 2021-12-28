
//////////////////////////////////////Etape5//////////////////////////////////////////////////

— Web : La dépendance spring-web contient des utilitaires Web partagés pour les environnements Servlet et Portlet.
Cette dépendance est obligatoire pour toutes les applications web qui utilisent Spring MVC

— JPA :
Spring Boot JPA est une spécification Java pour la gestion des données relationnelles dans les applications Java. 
Il nous permet d'accéder et de conserver les données entre l'objet / classe Java et la base de données relationnelle. 

— Hibernate :
Hibernate est un framework open source gérant la persistance des objets en base de données relationnelle.
Il comprend les mappages que nous ajoutons entre les objets et les tables. 
Il garantit que les données sont stockées / extraites de la base de données en fonction des mappages. 
Hibernate fournit également des fonctionnalités supplémentaires en plus de JPA. 

— H2 :
H2 est un système de gestion de base de données relationnelle open source créé entièrement en Java. 
Il peut être intégré dans des applications Java ou s'exécuter en mode client-serveur.

— DevTools :
DevTools signifie Developer Tool. 
Le but du module est d'essayer d'améliorer le temps de développement tout en travaillant avec l'application Spring Boot. 
Spring Boot DevTools récupère les modifications et redémarre l'application.

— Thymeleaf :
Thymeleaf est une bibliothèque Java. 
Il s'agit d'un moteur de template XML / XHTML / HTML5 capable d'appliquer un ensemble de transformations aux fichiers 
de template afin d'afficher les données et / ou le texte produit par vos applications. 
Permet de créer une application Web simple à l'aide de Spring Boot, de Tomcat intégré, du moteur de modèle Thymeleaf et de JPA.

//////////////////////////////////////Etape13//////////////////////////////////////////////////
1- @GetMapping("/greeting")
2- return "greeting";
3- on le récupere avec : @RequestParam(name="name",required=false, defaultValue="World") 
   et on l'envoie avec : model.addAttribute("nomTemplate", nameGET);

//////////////////////////////////////Etape17//////////////////////////////////////////////////
La table Address a été créée

//////////////////////////////////////Etape18//////////////////////////////////////////////////
Grâce aux annotation ajoutées à la classe Address, Hibernate accéde à la base de donnée et crée la table Address. 

//////////////////////////////////////Etape20//////////////////////////////////////////////////
Oui on voit le contenu de la table address.

//////////////////////////////////////Etape23//////////////////////////////////////////////////
@Autowire permet de faire l’injection de dépendances entre les beans de l’application. 

//////////////////////////////////////Etape30//////////////////////////////////////////////////
J'ai ajouté le lien de bootstrap dans les pages html.


//////////////////////////////////////Etape6_DM//////////////////////////////////////////////////

   - Oui, il faut une clé pour appeler Meteo concept

   - URL = https://api.meteo-concept.com/api/forecast/daily?token={MON_TOKEN}&latlng={lat},{lon}

   - Méthode HTTP = GET

   - On passe les paramètres d'appel dans l'url

   - Pour afficher la temperature du lieu visé par les coordonnées GPS = t_min et t_max

   - Pour afficher la prevision de meteo du lieu visé par les coordonnees GPS = weather


//////////////////// LIEN GITHUB ////////////////////////////
