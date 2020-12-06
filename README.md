# Spring-boot multi-project gradle build file
- Date: 12/6/2020
- Compiles a web-app component with spring-boot & lombok usage
- Compiles a library component with spring-boot & lombok usage
- The web-app injects the library service to retrieve data
- The web app listens on port 8080 and displays a message

- The library will be built automatically and added to the final build
- This example took several days to get working.
- I was assisted by the gs-multi-module Github spring.io sample project.

## SB-WEB-APP - first application
### Gradle notes - sb-web-app:
- includes sb-library-one
- Run the app from the root folder but referencing only the web-app

```
./gradlew clean sb-web-app:bootrun
http://localhost:8085/
```

- Or build a runnable jar (bootjar) and run from the command line

```
./gradlew clean sb-web-app:bootjar
java -jar sb-web-app/build/libs/sb-web-app-0.0.1-SNAPSHOT.jar
http://localhost:8085/
```    

## SB-API-APP - second application
### Gradle notes - sb-api-app:
- includes sb-library-two
- Run the app from the root folder but referencing only the web-app

```
./gradlew clean sb-api-app:bootrun
http://localhost:8086/
```

- Or build a runnable jar (bootjar) and run from the command line

```
./gradlew clean sb-api-app:bootjar
java -jar sb-api-app/build/libs/sb-api-app-0.0.1-SNAPSHOT.jar
http://localhost:8086/
```    

### Other notes
- bootjar is a Spring executable jar. You only build one bootjar for the main app.
- Libraries will get built as Jar files but will include spring dependencies.
- Libraies should be told in the build file to not build a bootjar (enabled = false)



