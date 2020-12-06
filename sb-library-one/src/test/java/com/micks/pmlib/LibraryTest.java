/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.micks.pmlib;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.springframework.test.util.AssertionErrors.assertTrue;

@AutoConfigureWebTestClient(timeout = "36000")
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {Library.class})
@SpringBootTest
public class LibraryTest {

    @Autowired
    private ApplicationContext context;

    @Autowired
    Library library;

    @Test
    public void testSomeLibraryMethod() {
        assertTrue("someLibraryMethod should return 'true'",
                library.someLibraryMethod());
    }

}
