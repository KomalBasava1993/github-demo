package TestNg;

import org.testng.annotations.*;

public class TestAnnotation {
	@Test
	public void f1() {
		System.out.println("Inside F1");
		
	}
	@Test
	public void f2() {
		System.out.println("Inside F2");
		
	}
	@Test
	public void f3() {
		System.out.println("Inside F3");
		
	}
	@BeforeMethod
	public void beforeEverymethod() {
		System.out.println("Before Every test method");
		
	}
	@AfterMethod
	public void AfterEveryMethod() {
		System.out.println("After Every test method");
		
	}
	@BeforeTest
	public void BeforeanyTest() {
		System.out.println("Before any test method run");
		
	}
   @AfterTest
   public void Afterallthetest() {
	   System.out.println("After all the test method run");
	   
   }
   
	

}
