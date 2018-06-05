Run as / maven install depuis le projet principal
déclenche la reconstruction de tous les modules
et l'ear pret à être déployé est dans m2idef_jee_ear/target


sans eclipse , l'ear construit par maven doit 
être recopié dans JBOSS_WILDFLY/standalone/deployments

et JBoss_AS doit être démarré via JBOSS_WILDFLY/bin/standalone

La configuration de JBOSS_WILDFLY/standalone/configuration/standalone.xml
est nécessaire qu'en cas d'accès à une base de données H2 ou MySQL ou ...

URL de test:
http://localhost:8080/m2idef_jee_web/   index.html
http://localhost:8080/m2idef_jee_web/conversion.html

où m2idef_jee_web est le context-root de META-INF/application.xml
coincidant souvent avec le nom du sous module web