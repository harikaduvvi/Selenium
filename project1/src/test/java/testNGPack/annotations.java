package testNGPack;
	  import org.testng.annotations.AfterClass;
	  import org.testng.annotations.AfterMethod;
	  import org.testng.annotations.BeforeClass;
	  import org.testng.annotations.BeforeTest;
	  import org.testng.annotations.AfterTest;
	  import org.testng.annotations.BeforeSuite;
	  import org.testng.annotations.AfterSuite;

	  import org.testng.annotations.BeforeMethod;
	  import org.testng.annotations.Test;

	  public class annotations {
	    @Test
	    public void testcase1() {
	  	  System.out.println("This is the test case1");
	    }
	    // @Test
	    public void testcase2() {
	  	  System.out.println("This is the test case2");
	  }
	  @BeforeMethod
	  public void testcase3() {
	  	  System.out.println("This is the test case3");
	  }
	  @AfterMethod
	  public void testcase4() {
	  	  System.out.println("This is the test case4");
	  }
	  @BeforeClass
	  public void Beforeclass() {
	  	  System.out.println("This will execute before the class");
	  }

	  @AfterClass
	  public void Afterclass() {
	  	  System.out.println("This will execute after the class");
	  }
	  @BeforeTest
	  public void BeforeTest() {
	  	  System.out.println("This will execute before the test");
	  }
	  @AfterTest
	  public void AfterTest() {
	  	  System.out.println("This will execute after the test");
	  }
	  @BeforeSuite
	  public void BeforeSuite() {
	  	  System.out.println("This will execute before the test suite");
	  }
	  @AfterSuite
	  public void AfterSuite() {
	  	  System.out.println("This will execute after the test suite");
	  }
}
