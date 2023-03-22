package org.step;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Jvmreport {
public static void generateJvmReport(String jsonReport) {
	
	File f=new File(System.getProperty("user.dir")+"\\AllReport\\JvmReport");
	
	Configuration c=new Configuration(f, "facebook Appliction");
	c.addClassifications("window", "11");
	c.addClassifications("jdk", "1.8");
	c.addClassifications("browser", "GoogleChrome");
	
	List<String> l=new ArrayList<String>();
	l.add(jsonReport);
	
	ReportBuilder r=new ReportBuilder(l, c);
	r.generateReports();
	

	
	
}
}
