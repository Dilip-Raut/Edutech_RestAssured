package hooks;


import com.aventstack.extentreports.Status;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ExtentManager;

public class Hooks {

    @Before
    public void beforeScenario(Scenario scenario) {
        ExtentManager.createTest(scenario.getName());
        ExtentManager.getTest()
                .log(Status.INFO, "Scenario Started: " + scenario.getName());
    }

    @After
    public void afterScenario(Scenario scenario) {

        if (scenario.isFailed()) {
            ExtentManager.getTest()
                    .log(Status.FAIL, "Scenario Failed");
        } else {
            ExtentManager.getTest()
                    .log(Status.PASS, "Scenario Passed");
        }

        ExtentManager.flush();
    }
}
