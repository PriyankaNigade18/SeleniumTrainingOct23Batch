package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
 * Single scenario: tags="@Mobiles"
 * Multiple scenario: tags="@Bestseller or @Mobiles"
 * skip any one scenario: tags="not @Mobiles"
 * Skip Multiple scenario: @ignore
 * To run all scenario: @All
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Amazon.feature",
					glue="stepdef",
					tags="@All",
					publish=true)
public class AmazonRuuner {

}
