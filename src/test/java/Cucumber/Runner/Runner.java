package Cucumber.Runner;

//import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Cucumber/RealizarCadastroeLogin.feature", 
glue = {"src/test/java/Cucumber.Passos/"}, monochrome = true, dryRun = false)

public class Runner {

}
