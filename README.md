# Getting Started

### Reference Documentation
* Update application.yml with database configuration
* Run Spring Boot application from console/terminal or from an IDE (Intellij, Eclipse etc.)
    ```
    mvn spring-boot:run
    ```
* The application by default starts on port 9000. 
* By default, application exposes GraphQL Service on the /graphql
 endpoint and will accept POST requests
    ```
    http://localhost:9000/graphql-demo/graphql
    ```    
* postman scripts were saved under resources/postman directory
    ```
    graphql.postman_collection.json
    ```
  
### Reference
Thanks to [Eugene](https://github.com/eugenp/tutorials/tree/master/spring-boot-modules/spring-boot)
