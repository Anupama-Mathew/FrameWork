import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.server.UserIdentity;

public class Login {

    @FindBy(id = "user-name")
    WebElement UserName;
    @FindBy(id = "password")
    WebElement Password;
    @FindBy(id = "login-button")
    WebElement LoginButton;

    public void setusername(String username) {
        UserName.sendKeys(username);
    }

    public void setpassword(String password) {
        Password.sendKeys(password);
    }
    public void setloginButton() {
        LoginButton.click();
    }


}

