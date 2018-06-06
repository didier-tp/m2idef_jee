run as / run on server depuis le projet web (ou depuis une page html)
-----------
La première fois , windows / preférences / servers / Runtime env.
+ add Jboss .... (installation plugin eclipse pour Jboss Wilfly & EAP)
-----
redémarrage eclipse 
windows / preférences / servers / Runtime env.
Add 
Jboss Comunity / Wildlfy 10
preciser le chemin menant à l'installation de JBoss (ex: C:\Servers\wildfly-10.1.0.Final)

-----
Run As Run on server 
--> la première fois : manually configure new server (Jboss WildFly)
--> ensuite : choose existing server

---
Pour rafraichir le code à tester (et déployé sous Jboss)
Dans onglet "server" , sélectionner ligne ...ear (sous jboss wildfly)
et menu contextuel "FULL PUBLISH"