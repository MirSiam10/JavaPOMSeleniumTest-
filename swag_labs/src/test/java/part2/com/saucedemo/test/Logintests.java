package part2.com.saucedemo.test;


import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class Logintests extends BaseTest {


    @Test
    public void testLogginerrormessage(){
        loginPage.setUsername("standard_user");
        loginPage.setPassword("xyz33");
        String actualmessage = loginPage.errorMessage();
        Assert.assertTrue(actualmessage.contains("Epic sadface"));


    }

}
