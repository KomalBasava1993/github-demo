package TestNg;

import org.testng.annotations.*;

public class Testgrouping {
  @Test(groups= {"A"})
  public void f1() {
  }
  @Test(groups= {"B"})
  public void f2() {
  }
  @Test(groups= {"C"})
  public void f3() {
  }
  @Test(groups= {"A"})
  public void f4() {
  }
  @Test(groups= {"B"})
  public void f5() {
  }
}
