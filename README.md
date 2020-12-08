# Spring-boot multi-project gradle build file

- Demonstrates a gradle multi-project spring-boot app using Java 15 and modules. Creates two apps, a web app and an api
  app (sample apps only) that pull in two sample libraries, to build two separate executable jars (bootjar's).

---

- Date: 12/6/2020
- Compiles a web-app component with spring-boot & lombok usage
- Compiles an api-app component with spring-boot & lombok usage
- Compiles two library components (libraryOne and libraryTwo) with spring-boot & lombok usage
- The web-app injects the library services to retrieve data
- The web app listens on port 8085 and displays a message
- The api-app injects the library services to retrieve data
- The api app listens on port 8086 and displays a message
- Used Java 15, Spring-boot 2.4.0, Gradle 5, and Java modules

- The libraries are built automatically and added to the final build
- This example took several days to get working.
- I was assisted by the gs-multi-module Github spring.io sample project, which used an older version of java, and was
  not modular.

## SB-WEB-APP - first application
### Gradle notes - sb-web-app:

- includes sb-library-one
- includes sb-library-two
- Run the app from the root folder but referencing only the web-app

```
./gradlew clean sb-web-app:bootrun

Open your browser to:  http://localhost:8085/
```

- Or build a runnable jar (bootjar) and run from the command line

```
./gradlew clean sb-web-app:bootjar
java -jar sb-web-app/build/libs/sb-web-app-0.0.1-SNAPSHOT.jar

Open your browser to:  http://localhost:8085/
```    

## SB-API-APP - second application
### Gradle notes - sb-api-app:

- includes sb-library-one
- includes sb-library-two
- Run the app from the root folder but referencing only the api-app

```
./gradlew clean sb-api-app:bootrun

Open your browser to: http://localhost:8086/
```

- Or build a runnable jar (bootjar) and run from the command line

```
./gradlew clean sb-api-app:bootjar
java -jar sb-api-app/build/libs/sb-api-app-0.0.1-SNAPSHOT.jar

Open your browser to: http://localhost:8086/
```    

### Other notes
- bootjar is a Spring executable jar. You only build one bootjar for the main app.
- Libraries will get built as Jar files but will include spring dependencies.
- Libraies should be told in the build file to not build a bootjar (enabled = false)
- The gradle build and bootrun commands above work from the command line but not from Intellij
- Intellij seems to complain about several things to do with this project
    - None of the gradle tasks run to completion from intellij.
    - Package declared in the unnamed module but sb-web-app doesn't read it - can't figure out why
    - Could not find method implementation() when running the Intellij bootjar gradle task


