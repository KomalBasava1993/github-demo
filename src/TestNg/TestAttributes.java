package TestNg;

import org.testng.annotations.Test;

public class TestAttributes {
  @Test
  public void f() {
  }
  @Test
  public void a() {
  }
  @Test(enabled=false)
  public void g() {
  }
  @Test(invocationCount=4)
  public void h() {
  }
}
