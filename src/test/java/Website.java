/*import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileReader;

public class Website {
    public static WebDriver driver;

    @BeforeSuite
    public void initializeWebDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }
    CSVReader reader =new CSVReader(new FileReader("D:\\Automation"));
    String csvCell[];
    while((csvCell = reader.readNext()!=null))
    {
        String username=csvCell[0];
        String password=csvCell[1];
    }


    @AfterSuite
    public void quitDriver() {
        //driver.quit();
    }
}*/
