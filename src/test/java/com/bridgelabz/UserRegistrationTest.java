package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenValidFirstName_ShouldReturnTrue_Test() {

        UserRegistration userRegistration = new UserRegistration();

        boolean result = userRegistration.validateFirstName("Shakeel");

        Assert.assertTrue(result);
    }

    @Test
    public void givenInValidFirstName_ShouldReturnFalse_Test() {

        UserRegistration userRegistration = new UserRegistration();

        boolean result = userRegistration.validateFirstName("shakeel");

        Assert.assertFalse(result);
    }
}
