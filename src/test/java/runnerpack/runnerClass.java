package runnerpack;

import basepack.baseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Featurefolder/Intro.feature", dryRun = false, glue = "stepDef", tags = "@2", publish = true,
        plugin = {"pretty", "html:target/report/Html report.html", "json:target/report/Html report.json"})
public class runnerClass extends baseClass {
    @BeforeClass
    public static void start() {
        browserLaunch();
        maximize();

    }

    @AfterClass
    public static void end() throws InterruptedException {
        quit();

    }
}
