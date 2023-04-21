package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.BaseClass;

public class Hooks extends BaseClass {
  WebDriver driver;
    @Before
    public void setup(){
      setupDriver();
    }
    @After
    public void close(){
      closeDriver();
    }

}
