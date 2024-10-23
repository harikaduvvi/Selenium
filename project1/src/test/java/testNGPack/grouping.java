package testNGPack;

import org.testng.annotations.Test;

public class grouping {
  @Test
  public void Car1() {
	  System.out.println("Batch Car - Test car 1");
  }
  @Test (groups= {"car"})
  public void Car2() {
	  System.out.println("Batch Car - Test car 2");
  }
  @Test(groups = {"Scooter"})
  public void Scooter1() {
	  System.out.println("Batch Scooter - Test scooter 1");
  }
  @Test (groups = {"Scooter"})
  public void Scooter2() {
	  System.out.println("Batch Scooter - Test scooter 2");
  }
  @Test(groups= {"Car", "Scooter"})
  public void Sedan1() {
	  System.out.println("Batch Sedan Car - Test scooter 1");
  }
}
