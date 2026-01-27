package random;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert_scripts {
  @Test
  public void f() {
	  SoftAssert softAssert = new SoftAssert();
	  softAssert.assertEquals(2+2, 8, "Math check failed");
	
	  softAssert.assertEquals(10 < 5, "condition checked");
	  
	  softAssert.assertEquals("hello","hello","hello");
	  
	  System.out.println("helloooo");
	  softAssert.assertAll();
  }
}
