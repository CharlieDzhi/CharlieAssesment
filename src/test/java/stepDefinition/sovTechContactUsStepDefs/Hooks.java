package stepDefinition.sovTechContactUsStepDefs;

import cucumber.api.java.After;
import utilities.SeleniumDriver;

public class Hooks {


    @After
    public void afterScenario(){

        SeleniumDriver seleniumDriver = new SeleniumDriver();
        seleniumDriver.EndTest();
    }
}
