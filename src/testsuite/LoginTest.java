package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {

    String baseUrl =" https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){
    openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");      //Enter “Admin” username

        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");   //Enter “admin123 password
        //Click on ‘LOGIN’ button
        driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
        //Verify the ‘Dashboard’ text is display
        driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")).getText();
    }

    @After
    public void tearDown(){
        closeBrowser();
    }

}
