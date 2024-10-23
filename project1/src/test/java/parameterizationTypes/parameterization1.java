package parameterizationTypes;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterization1 {
  @Test
  @Parameters({"name","age"})
  public void f(String name, int age) {
	  System.out.println("name :"+name+"\n"+"age :"+age);
  }
}
