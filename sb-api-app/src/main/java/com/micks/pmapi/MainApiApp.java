package com.micks.pmapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.micks.pmlib1.LibraryOne;
import com.micks.pmlib2.LibraryTwo;

/**
 * sb-multi-template - Class description
 *
 * @author mick
 * @version 1.0
 * @since Dec 06, 2020
 */
@Slf4j
@RestController
@SpringBootApplication(scanBasePackages = {"com.micks"})
public class MainApiApp implements CommandLineRunner {

    private final LibraryOne libraryOne;
    private final LibraryTwo libraryTwo;

    public MainApiApp(LibraryOne libraryOne, LibraryTwo libraryTwo) {
        this.libraryOne = libraryOne;
        this.libraryTwo = libraryTwo;
    }

    /**
     * Entry point for the Spring-boot container
     *
     * @param args command line args
     */
    public static void main(String[] args) {

        SpringApplication.run(MainApiApp.class, args);
    }

    @GetMapping("/")
    public String home() {

        String str = "Hello kitty from Mick on sb-api-app #1";
        log.info("Controller returning message = {}", str);

        return str;
    }

    @Override
    public void run(String... args) throws Exception {

        libraryOne.someLibraryOneMethod();
        libraryTwo.someLibraryTwoMethod();

    }
}