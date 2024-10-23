package parameterizationTypes;
//Parameterization : it allows you to run the same test method multiple times with parameters
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterization {
  @Test
  @Parameters({"name","city"})
  public void f(String name, String city) {
	  System.out.println("name :"+name+"\n"+"city :"+city);
  }
}
