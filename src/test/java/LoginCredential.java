import org.testng.annotations.Test;
public class LoginCredential extends Website {
    @Test
    public void init() throws Exception {
        Login login=new Login();
        login.setusername("standard_user");
        login.setpassword("secret_sauce");
        login.setloginButton();
    }
}
