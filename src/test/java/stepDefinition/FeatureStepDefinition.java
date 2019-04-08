package stepDefinition;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FeatureStepDefinition {
static WebDriver myDriver;

    @Given("^User opens tirumala org$")
    public void User_opens_tirumala_org (){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\uma_g\\IdeaProjects\\NewMavenProject\\src\\chromedriver.exe");

    myDriver = new ChromeDriver();

    }
    @When("^User access tirumals org website$")
    public void User_access_tirumala_org_website(){
        //myDriver.get("https://www.venkateswara.org");
        myDriver.get("https://www.svuniversity.edu.in/");

    }
    @Then("^User can see tirumala Home Page$")
    public void User_can_see_tirumala_Home_page(){
       // myDriver.quit();

    }

}
