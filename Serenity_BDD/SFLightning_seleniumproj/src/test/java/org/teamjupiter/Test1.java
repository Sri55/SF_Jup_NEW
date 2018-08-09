package org.teamjupiter;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test1 {

    WebDriver driver;

    @When("^I am on sf page$")
    public void i_am_on_sf_page() throws Throwable {

        String exePath = "C:\\Users\\srilatha.devireddy\\Desktop\\Chromedriver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver = new ChromeDriver();
        driver.get("https://stepstone--int.cs81.my.salesforce.com/");
        String title = driver.getTitle();
        System.out.println(title);

    }

    @Then("^I see the element$")
    public void i_see_the_element() throws Throwable {
        System.out.println("Good Luck!");
    }
}
