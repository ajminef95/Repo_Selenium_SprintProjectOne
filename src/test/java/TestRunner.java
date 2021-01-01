import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        //Path to your feature files
        features = {"src/test/resources/features"},

        //Specify the step definition package name
        // Note: The step definition package and TestRunner class needs to be inside the same package
        glue = {"stepDefinition", "DriverWrapper"},

        //Specify tags to be executed
        tags = {"@TestCase-9"},

        //readable console logs

        monochrome = true,

        // This creates cucumber reports (default)
        //plugin = {"pretty", "html:Reports/Default/"},


        //This creates auto method in camelCase
        // be sure to type cucumber.api.SnippetType.CAMELCASE (choose camelCase after SnippetType.)
        snippets = SnippetType.CAMELCASE
)



public class TestRunner {



}
