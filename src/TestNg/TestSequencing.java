package TestNg;

import org.testng.annotations.Test;

public class TestSequencing {
  @Test(priority=12)
  public void f() {
  }
  @Test(priority=3,dependsOnMethods= {"f"})
  public void g() {
  }
  @Test(priority=2, description="priority is 2")
  public void h() {
  }
  @Test(priority=10)
  public void i() {
  }
  @Test(priority=0)
  public void k() {
  }
}
