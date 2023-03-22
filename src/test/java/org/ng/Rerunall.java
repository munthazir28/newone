package org.ng;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class Rerunall implements IAnnotationTransformer {

	public void transform(ITestAnnotation d, Class testClass, Constructor testConstructor, Method testMethod) {
		IRetryAnalyzer f = d.getRetryAnalyzer();
		if (f==null) {
			d.setRetryAnalyzer(Failed.class);
			
		}
		
		
	}

}
