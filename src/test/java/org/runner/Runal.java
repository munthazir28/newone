package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.step.Jvmreport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources",glue = "org.step",dryRun = false,plugin = {"pretty"
		,"html:C:\\Users\\ASUS\\eclipse-workspace\\Cucumber\\AllReport\\htmlReport",
		"json:C:\\Users\\ASUS\\eclipse-workspace\\Cucumber\\AllReport\\jsonReport\\face.json",
		"junit:C:\\Users\\ASUS\\eclipse-workspace\\Cucumber\\AllReport\\junitReport\\face.xml"})

public class Runal {
	@AfterClass
	public static void report() {
		Jvmreport.generateJvmReport(System.getProperty("user.dir")+"\\jsonReport\\face.json");
		
		

	}
	
}
