package stepdefs;

import cucumber.api.java.en.Given;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyInput;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.interactions.internal.KeysRelatedAction;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.plugin.dom.html.HTMLSelectElement;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.security.Key;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;
import static sun.nio.cs.Surrogate.is;
import static sun.plugin.javascript.navig.JSType.Element;

public class MyStepdefs {
    @Given("^I am on google home page$")
    public void iAmOnGoogleHomePage() throws Throwable {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");


        String exePath = "C:\\Serenity_BDD\\ChromeDriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://test.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("sri.devireddy@stepstone.co.uk.int");
        driver.findElement(By.id("password")).sendKeys("Rama1248");

        driver.findElement(By.id("Login")).click();

        driver.manage().window().maximize();

        Thread.sleep(5000);

       driver.findElement(By.xpath("//a[@title='Leads']")).click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@id=\"brandBand_1\"]/div/div[1]/div[2]/div/div/div[1]/div[1]/div[2]/ul/li[1]/a/div")).click();

        Thread.sleep(5000);

        driver.findElement(By.xpath("//*[contains(text(),'Qualified')]")).click();

        Thread.sleep(5000);


       driver.findElement(By.xpath("//span[@class=' label bBody' and contains(text(), 'Next')]")).click();

        List<WebElement> sample = driver.findElementsByXPath("//*[@class='slds-has-flexi-truncate slds-p-horizontal_medium full forcePageBlockItem forcePageBlockItemEdit']");
        Thread.sleep(4000);
        //Enter Company Name
        WebElement CompanyName = sample.get(0);

        Actions actions = new Actions(driver);
        actions.moveToElement(CompanyName);
        actions.click();
        actions.sendKeys("TMedia");
        actions.build().perform();

        //Enter Company Type
        WebElement company_type  = sample.get(2);
        company_type.click();
        Thread.sleep(3000);
        Actions actions_companytype = new Actions(driver);
        actions_companytype.sendKeys("Direct").sendKeys(Keys.ENTER).perform();

         //**********Enter Salutation

        WebElement salutation = driver.findElementByXPath("//*[@class='salutation compoundTLRadius compoundTRRadius compoundBorderBottom form-element__row uiMenu']");
        salutation.click();
        Thread.sleep(5000);
        Actions act = new Actions(driver);
        act.sendKeys("Mr.").sendKeys(Keys.ENTER).perform();


        WebElement lastname = driver.findElement(By.xpath("//*[@class='lastName compoundBorderBottom form-element__row input']"));

        Actions actln = new Actions(driver);
        actln.moveToElement(lastname);
        actln.click();
        actln.sendKeys("Graphinao");
        actln.build().perform();


      //*** Select Industry
       WebElement Ind1= driver.findElement(By.xpath("//div[@class='modal-body scrollable slds-modal__content slds-p-around--medium']/div/div[4]/div/div[1]/div/div[@role='list']/div[4]/div[2]//div[@class='uiPopupTrigger']/div//a"));
       Ind1.click();
        Actions actIndustry1 = new Actions(driver);
        actIndustry1.sendKeys("Accounting").sendKeys(Keys.ENTER).perform();


        //****************** EMAIL
        WebElement Email = driver.findElement(By.xpath("//*[@class='uiInput uiInputEmail uiInput--default uiInput--input']"));
        Email.click();
        Thread.sleep(5000);

        Actions act_email = new Actions(driver);
        act_email.moveToElement(Email);
        act_email.click();
        act_email.sendKeys("Ngsssdgf123c@test.com");
        act_email.build().perform();


        //******BRAND
        WebElement Brand= driver.findElement(By.xpath("//div[@class='modal-body scrollable slds-modal__content slds-p-around--medium']/div/div[4]/div/div[1]/div/div[@role='list']/div[11]/div[1]//div[@class='uiPopupTrigger']//a[@role='button']"));
        Brand.click();
        Actions act_brand= new Actions(driver);
        act_brand.sendKeys("Totaljobs.com").sendKeys(Keys.ENTER).perform();


        //code to select Lead Source

        sample.get(6).click();
       // actions.moveByOffset(509,430).build().perform();
       WebElement select_Leadsource = driver.findElementByXPath("//*[@title='Data.com']");
       select_Leadsource.click();

        driver.findElement(By.xpath("//button[@class='slds-button slds-button--neutral uiButton--default uiButton--brand uiButton forceActionButton']")).click();

        //click converted link on path
        //Added implicit wait to tell webdriver to wait for 15 sec before throwing NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        driver.findElement(By.xpath("//a[@class='tabHeader' and @title='Converted']")).click();
        Thread.sleep(5000);

        //click Mark as converted link on path
        driver.findElement(By.xpath("//div[@class='runtime_sales_pathassistantPathAssistantHeader--desktop runtime_sales_pathassistantPathAssistantHeader']")).click();

        Thread.sleep(10000);

        //click the Final convert button on the pop up just before Account , contact and Opp creation
        driver.findElement(By.xpath("//button[@class='slds-button slds-button--neutral uiButton--default uiButton--brand uiButton runtime_sales_leadConvertModalFooter']")).click();

        Thread.sleep(5000);

        //*Switch to Lead converted window to click on Opportunity name.

        java.util.Set<String> handles = driver.getWindowHandles();
        System.out.println(handles);

        for (String handle1 : driver.getWindowHandles()) {

            System.out.println(handle1);

            driver.switchTo().window(handle1);
        }

        java.util.List<WebElement> links = driver.findElements(By.xpath("//div[@class='bodyConvertedItem']/ul/li[2]/div[1]/div[2]/a"));

        System.out.println(links.size());
        System.out.println(links.get(0).getText());
        System.out.println(links.get(1).getText());

        Actions act_actname = new Actions(driver);
        act_actname.moveToElement(links.get(0));
        act_actname.click();
        act_actname.build().perform();

        Thread.sleep(4000);

        WebElement Enter_Type =driver.findElement(By.xpath("//button[@title='Edit Type']"));
        Enter_Type.click();
        Thread.sleep(5000);

        Actions act_type = new Actions(driver);
        act_type.sendKeys("Direct").sendKeys(Keys.ENTER).perform();

        driver.findElement(By.xpath("//button[@title='Save']")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;


        WebElement Click_on_Opp_from_Acct = driver.findElement(By.xpath("//li[@class='rlql-relatedListQuickLink'][3]"));
        Click_on_Opp_from_Acct.click();

       driver.quit();


    }
    }

