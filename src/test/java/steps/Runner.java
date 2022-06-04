package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        monochrome = false,
        features = "src/test/resources/features",
        glue = "steps",
        plugin = {
                "pretty",
                "html:target/relatorio-html"
        }
)
public class Runner {



}
