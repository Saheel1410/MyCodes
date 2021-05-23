package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(features="src/test/java/feature",glue= {"steps","hooks"},monochrome=true,tags = "@smoke")
public class TestRunner extends AbstractTestNGCucumberTests {

}
