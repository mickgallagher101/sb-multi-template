/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.micks.pmadmin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.micks.pmlib.Library;

@Slf4j
@RestController
@SpringBootApplication(scanBasePackages = "com.micks")
public class MainApp implements CommandLineRunner {

    private final Library library;

    public MainApp(Library library) {
        this.library = library;
    }

    /**
     * Entry point for the Spring-boot container
     *
     * @param args command line args
     */
    public static void main(String[] args) {

        SpringApplication.run(MainApp.class, args);
    }

    @GetMapping("/")
    public String home() {

        String str = "Hello kitty from Mick on sb-web-app #1";
        log.info("Controller returning message = {}", str);

        return str;
    }

    @Override
    public void run(String... args) throws Exception {

        library.someLibraryMethod();

    }
}