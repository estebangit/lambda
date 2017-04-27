package com.esteban.lambda;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 * Created by esteban on 30.03.17.
 */
public final class LambdaTest {

    private static final Logger log = LoggerFactory.getLogger(LambdaTest.class);

    private final List<String> names = Arrays.asList("Zero", "Un", "Deux", "Trois", "Quatre", "Cinq", "Six", "Sept", "Huit", "Neuf");

    @Test
    public void testFilterList() {
        final List<String> result = names.stream()
                .filter(s -> s.startsWith("S"))
                .collect(Collectors.toList());

        log.info("-> {}", result);
        assertEquals(2, result.size());
        assertTrue(result.contains("Six"));
        assertTrue(result.contains("Sept"));
    }

    @Test
    public void testToUpperCase() {
        final List<String> result = names.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        log.info("-> {}", result);
        assertEquals(10, result.size());
        assertTrue(result.contains("SIX"));
        assertTrue(result.contains("SEPT"));
    }

}
