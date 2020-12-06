/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.micks.pmadmin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sb.library.one.Library;

@SpringBootApplication
public class MainApp implements CommandLineRunner {

    @Autowired
    private Library library;

    /**
     * Entry point for the Spring-boot container
     *
     * @param args command line args
     */
    public static void main(String[] args) {

        SpringApplication.run(MainApp.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

        library.someLibraryMethod();

    }
}
