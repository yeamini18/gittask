package stepDef;

import basepack.baseClass;
import io.cucumber.java.en.*;
import pompack.loginPage;
import pompack.signupPage;

import java.io.IOException;

public class stepDefclass extends baseClass {
    loginPage pom=new loginPage();
    signupPage sign=new signupPage(driver);
    @Given("User enter the URL")
    public void user_enter_the_url() {

        implicitlyWait();
        url("https://www.instagram.com/");

    }
    @When("enter the username and password")
    public void enter_the_username_and_password() {
        pom.enterthename();
        pom.enterthepass();

    }
    @When("click the password show icon btn")
    public void click_the_password_show_icon_btn() throws IOException {
    pom.clickshowicon();
    }
    @Then("click the login Btn")
    public void click_the_login_btn() throws InterruptedException, IOException {
        pom.login();
        Thread.sleep(5000);


    }
    @Then("verify the error msg")
    public void verify_the_error_msg() throws IOException {
        pom.Verifyerrormsg();

    }
    @Then("Click signupbtn in loginpage")
    public void click_signupbtn_in_loginpage() {
        pom.clicksignupbtnn();

    }

    @Then("enter All details")
    public void enter_all_details() {
        sign.enterTheAllDetails();

    }

    @Then("Click signup button in Signuppage")
    public void click_signup_button_in_signuppage() throws InterruptedException {
        sign.Signupbtnclck();

    }
    @Then("enter All details {string} {string} {string} {string}")
    public void enter_all_details(String mblno, String pass, String fname, String uname) {
        sign.enterTheAllDetails(mblno,pass,fname,uname);

    }
    @When("enter the username and password {string} {string}")
    public void enter_the_username_and_password(String use, String passw) {
    pom.enterDetail(use,passw);
    }





}
