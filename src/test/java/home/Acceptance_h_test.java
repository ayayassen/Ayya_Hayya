package home;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="cases",
		strict=true,
		plugin= {"html:target/cucumber/wikipedia.html"},
		monochrome=true,
		snippets=SnippetType.CAMELCASE,
		glue={"home"})
		
		
		
		
	
public class Acceptance_h_test {

}
