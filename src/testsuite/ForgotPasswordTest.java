package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public  void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //click on the ‘Forgot your password’ link
     driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        //Verify the text ‘Reset Password’
     driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--large oxd-button--secondary orangehrm-forgot-password-button orangehrm-forgot-password-button--reset']")).click();
        String expectedText="Reset Password";
        String actualText=driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--large oxd-button--secondary orangehrm-forgot-password-button orangehrm-forgot-password-button--reset']")).getText();
        Assert.assertEquals("Message not found",expectedText,actualText);

    }


    @After
    public  void tearDown(){
        closeBrowser();
    }
}
