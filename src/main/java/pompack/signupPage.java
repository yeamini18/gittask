package pompack;

import basepack.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signupPage extends baseClass{

    public static WebDriver driver;
    public signupPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(name = "emailOrPhone")
    WebElement mobileNo;

    @FindBy(xpath = "//input[@name='password']")
    WebElement password;

    @FindBy(name = "fullName")
    WebElement fname;

    @FindBy(name = "username")
    WebElement uName;

    @FindBy(xpath = "//button[text()='Sign up']")
    WebElement signnUpp;

    public void enterTheAllDetails() {

        mobileNo.sendKeys("9890809080");
        password.sendKeys("xsx@kw");
        fname.sendKeys("Axess");
        uName.sendKeys("Tech");

    }

    public void enterTheAllDetails(String MobileNo,String passwor,String funame,String usname ) {

        mobileNo.sendKeys(MobileNo);
        password.sendKeys(passwor);
        fname.sendKeys(funame);
        uName.sendKeys(usname);

    }
    public void Signupbtnclck() throws InterruptedException {
        scrollBy(0,120);
        Thread.sleep(1000);
        signnUpp.click();

    }







}
