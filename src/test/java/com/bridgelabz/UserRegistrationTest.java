package com.bridgelabz;
//importing  junit assert
import org.junit.Assert;
//importing j unit Test
import org.junit.Test;

public class UserRegistrationTest {

    @Test
    public void givenValidFirstName_ShouldReturnTrue_Test() {
        /*
            creating the object of userRegistrstion
         */

        UserRegistration userRegistration = new UserRegistration();

        boolean result = userRegistration.validateFirstName("CMD");

        Assert.assertTrue(result);
    }

    @Test
    public void givenInValidFirstName_ShouldReturnFalse_Test() {

        UserRegistration userRegistration = new UserRegistration();

        boolean result = userRegistration.validateFirstName("CMD");

        Assert.assertFalse(result);


    }

    @Test
    public void givenValidSecondName_ShouldReturnTrue_Test() {

        UserRegistration userRegistration = new UserRegistration();

        boolean result = userRegistration.validateFirstName("SHAKEEL");

        Assert.assertTrue(result);
    }

    @Test
    public void givenInValidSecondName_ShouldReturnFalse_Test() {

        UserRegistration userRegistration = new UserRegistration();

        boolean result = userRegistration.validateFirstName("SHAKEEL");

        Assert.assertFalse(result);

    }
}
