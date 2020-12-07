package com.micks.pmlib2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.springframework.test.util.AssertionErrors.assertTrue;

/**
 * sb-multi-template - Class description
 *
 * @author mick
 * @version 1.0
 * @since Dec 06, 2020
 */
@AutoConfigureWebTestClient(timeout = "36000")
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {LibraryTwo.class})
@SpringBootTest
class LibraryTwoTest {

    @Autowired
    private ApplicationContext context;

    @Autowired
    LibraryTwo libraryTwo;

    @Test
    public void testSomeLibraryTwoMethod() {
        assertTrue("someLibraryTwoMethod should return 'true'",
                libraryTwo.someLibraryTwoMethod());
    }
}