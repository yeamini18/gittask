package pompack;

import basepack.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class loginPage extends baseClass {
    public By Username = By.xpath("//input[@name='username' or @name='email']");
    public By pas = By.xpath("//input[@name='password' or @name='pass']");
    public By showicon = By.xpath("//button[text()='Show']|//div[@aria-label='Show password']");
    public By loginn = By.xpath("//div[text()='Log in']|//span[text()='Log in']");
    public By eleimg = By.xpath("//div[contains(@class,'x5n08af x78zum5')]");
   // public By errmsg=By.xpath("//div[contains(text(),'Sorry')]|//span[contains(text(),'The login information')]");
    public By errmsg=By.xpath("//div[contains(text(),'Sorry')]");

    public By signUp =By.xpath("//span[text()='Sign up' or contains(text(),'Create new')]");

    public void enterthename() {
        WebElement name = driver.findElement(Username);
        name.sendKeys("axesssss");
    }

    public void enterthepass() {
        WebElement passs = driver.findElement(pas);
        passs.sendKeys("#34455");

    }

    public void clickshowicon() throws IOException {
        WebElement icon = driver.findElement(showicon);
        icon.click();
        ss("loginpage");
    }

    public void login() throws InterruptedException, IOException {
        WebElement log = driver.findElement(loginn);
        log.click();
        Thread.sleep(1000);


    }
    public void Verifyerrormsg() throws IOException {
        try {
            WebElement error = driver.findElement(errmsg);
            if (error.isDisplayed()) {
                WebElement form = driver.findElement(eleimg);
                ssUsingelement(form, "formimg");

            } else {
                System.out.println("This is not invalid data");
            }
        } catch (Exception e) {
            ss("some error");
        }
    }
    public void clicksignupbtnn(){
        WebElement si = driver.findElement(signUp);
        si.click();

    }
    public void enterDetail(String user,String pasw){
        WebElement name = driver.findElement(Username);
        name.sendKeys(user);
        WebElement passs = driver.findElement(pas);
        passs.sendKeys(pasw);


    }
}
