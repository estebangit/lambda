package com.esteban.lambda;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by esteban on 27.04.17.
 */
public class LambdaTestIT {

    @Test
    public void test() {
        Person person = new Person("Jean", "Dupond");
        assertEquals("Jean", person.getFirstName());
        assertEquals("Dupond", person.getLastName());
    }

}
