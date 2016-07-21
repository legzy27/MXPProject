package com.mazda.MXPProject;

import org.junit.runner.RunWith;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;




@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(jsonReport = "target/cucumber.json",
        jsonUsageReport = "build/cucumber-usage.json",
        retryCount = 0,
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        usageReport = false,
        screenShotLocation = "screenshots/",
        screenShotSize = "300px",
        coverageReport = true,
        toPDF = true,
        outputFolder = "target")
@CucumberOptions(plugin = { "html:target/cucumber-html-report",
        "json:target/cucumber.json", "pretty:target/cucumber-pretty.txt",
        "usage:target/cucumber-usage.json",
        "junit:target/cucumber-results.xml"
          },
        features = {"./src/test/resource" },
        glue = {},
      		
		tags={"@Findadealer"}	
		)

public class RunnerTest {
	

}
