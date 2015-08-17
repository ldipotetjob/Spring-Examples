#para funcionar que necesitamos :

- maven 3+
- jdk 1.6+
- descargar el proyecto en un directorio y en el ejecutar lo siguiente :
  - mvn clean install
  - mvn tomcat:run 

# así ha de estar formada la petición
http://localhost:8080/RESTfulJson/rest/json/music/get

# el puerto puede ser cambiado en el pom.xml al igual que el Contentroot (RESTfulJson) 

Estos son ejemplos muy simples,tomados de cualquier site y con una refactorización puede incluir:

- modificación en los pom para cambiar el tipo y/o modo de despliegue 
- modificación de alguna cabecera de xml para que funcionara
- modificación de  un web xml cuyo unico objetivo para la modificacion de algún parámetro

El cambio de los paquetes se debe a que exista una uniformidad con los ppaquetes ya creados en nuestro site.


Somos: http://mojitoverde.blogspot.com visitanos

