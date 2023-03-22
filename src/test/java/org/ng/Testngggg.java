package org.ng;

import org.base.Baseclass;
import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.Before;

public class Testngggg extends Baseclass {
	@org.testng.annotations.Test
	private void tc1() {
		System.out.println("tc1");
		Assert.assertTrue(false);
		System.out.println("tc11");
	}
	@org.testng.annotations.Test(enabled =true)
	private void tc2() {
		System.out.println("tc2");
		Assert.assertTrue(false);
		System.out.println("tc22");

	}
	@org.testng.annotations.Test
	private void tc3() {
		System.out.println("tc3");
		Assert.assertTrue(true);
	}
	@BeforeClass
	private void launch() {
		System.out.println("start>>>>...");
		
	}
	@AfterClass
	private void close() {
		System.out.println("ennd>>>>.");

	}
	@BeforeMethod
	private void time() {
		datetimem();

	}
	@AfterMethod
	private void date() {
		datetimem();
	}

}
