package testNGPack;

import org.testng.annotations.Test;
@Test(groups = {"test1"})
public class groupTestNG_class {
  @Test
  public void m1() {
	  System.out.println("test1 m1 method");
  }
  public void m2() {
	  System.out.println("test1 m3 method");
  }
  public void m3() {
	  System.out.println("test1 m3 method");
  }
}

@Test(groups = {"test2"})
class second1 {
	public void m2() {
		System.out.println("test2 m2 method");
	}
}

@Test(groups = {"test3"})
class second12 {
	public void m2() {
		System.out.println("test3 m2 method");
	}
}

