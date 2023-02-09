* ejecutar el siguiente comando para levantar el servidor keycloak
docker-compose up -d --force-recreate --build keycloak

* ir a http://localhost:8080/  , crear usuarios y asignarles roles

* copiar el realm id de tipo RS256 RSA Public y pegar en el
aplication.properties del microservicio KeycloakAdapter

* ejecutar los microservicios en el siguiente orden
-Eureka
-config server
-apigateway
-keycloakAdapter
-login-microservice
-person-microservice
