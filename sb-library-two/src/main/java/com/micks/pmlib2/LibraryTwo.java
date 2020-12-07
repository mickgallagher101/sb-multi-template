package com.micks.pmlib2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * sb-multi-template - Class description
 *
 * @author mick
 * @version 1.0
 * @since Dec 06, 2020
 */
@Slf4j
@Service
public class LibraryTwo {

    public boolean someLibraryTwoMethod() {

        LombokTwoTest lombokTest = new LombokTwoTest();

        log.info("Just ran someLibraryTwoMethod()...");

        return true;
    }
}
