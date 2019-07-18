package Cucumber.Runner;

//import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Cucumber/RealizarCadastroeLogin.feature", tags = "@RealizarCadastroeLogin", 
glue = {""}, monochrome = true, dryRun = false)//snippets = SnippetType.CAMELCASE)

public class Runner {

}
