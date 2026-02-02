package basepack;

import com.google.common.io.Files;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class baseClass {
    public static WebDriver driver;
    public static JavascriptExecutor scroll;

    public static void browserLaunch() {
        driver = new ChromeDriver();
    }

    public static void url(String URL) {
        driver.get(URL);
    }

    public static void maximize() {
        driver.manage().window().maximize();
    }

    public static void implicitlyWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    public static void ss(String Imgname) throws IOException {
        TakesScreenshot sc = (TakesScreenshot)driver;
        File screenshotAs = sc.getScreenshotAs(OutputType.FILE);
        File path=new File("C:\\Users\\Admin\\eclipse-workspace\\cuku\\target\\images\\"+Imgname+".png");

        FileUtils.copyFile(screenshotAs,path);
    }
    public static void ssUsingelement(WebElement e, String Img) throws IOException {
        File screenshotAs = e.getScreenshotAs(OutputType.FILE);
        File path=new File("C:\\Users\\Admin\\eclipse-workspace\\cuku\\target\\images\\"+Img+".png");
        FileUtils.copyFile(screenshotAs,path);

    }
    public static void scrollBy(int x,int y){
     scroll=(JavascriptExecutor) driver;
      scroll.executeScript("window.scrollTo("+x+","+y+")");

 }
    public static void quit() throws InterruptedException {
        Thread.sleep(4000);
        driver.quit();
    }

}
