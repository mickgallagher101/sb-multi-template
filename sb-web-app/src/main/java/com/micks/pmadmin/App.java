/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.micks.pmadmin;

@SpringBootApplication
public class MainApp implements CommandLineRunner {

    @Autowired
    DbInitializationService dbInitializationService;

    /**
     * Entry point for the Spring-boot container
     *
     * @param args command line args
     */
    public static void main(String[] args) {

        SpringApplication.run(MainApp.class, args);
    }



}
