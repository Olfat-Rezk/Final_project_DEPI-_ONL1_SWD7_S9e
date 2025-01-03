package Tests;

import Pages.Account;
import Pages.Login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Selectcurrency extends TestBase{
    Login loginPage;
    Account account;

    @BeforeMethod
    public void preconditions() {

        // Initialize the page objects

        account = new Account(driver);
        loginPage=new Login(driver);
    }
    @Test(priority = 1)
    public void selectEuro() {
        // First, log in
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/login");
        loginPage.enterEmail("doaa.fahmi@gmail.com");
        loginPage.enterPassword("Asd@101094");
        loginPage.clickLoginButton();  // Enter email and password together
        account.selectEuro();// Select Euro currency

    }


    //validate that price change when crenccy changed
    @Test
    public void selectanothercategoryandverifydollarsign (){
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/login");
        loginPage.enterEmail("doaa.fahmi@gmail.com");
        loginPage.enterPassword("Asd@101094");
        loginPage.clickLoginButton();
        account.selectDollar();
        account.Clickoncategorydesktop();
        account.mac_subcategory();
        account.virefydollarsignonanyproduct();

    }
    // select main and sub category and verify that sign was changed in product when change currency
    @Test
    public void selectanothercategoryandverifypoundsterlingsign (){
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/login");
        loginPage.enterEmail("doaa.fahmi@gmail.com");
        loginPage.enterPassword("Asd@101094");
        loginPage.clickLoginButton();
        account.selectPoundSterling();
        account.Clickoncategorydesktop();
        account.mac_subcategory();
        account.virefypoundsterlingsignonanyproduct();

    }

    @Test
    public void selectanothercategoryandverifyeuroign (){
        driver.navigate().to("https://awesomeqa.com/ui/index.php?route=account/login");
        loginPage.enterEmail("doaa.fahmi@gmail.com");
        loginPage.enterPassword("Asd@101094");
        loginPage.clickLoginButton();
        account.selectEuro();
        account.Clickoncategorydesktop();
        account.mac_subcategory();
        account.virefyeurosignonanyproduct();

    }

}
