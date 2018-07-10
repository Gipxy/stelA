package st;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChickenTest {
  private Chicken chicken;

  @Before
  public void init() {
    chicken = new Chicken();
  }

  @Test
  public void testSing() {
    String msg = chicken.getSound();
    String expected = "Cluck, cluck";
    Assert.assertEquals(expected, msg);
  }

  @Test
  public void testFly() {
    try {
      chicken.fly();
      Assert.fail("How can chicken fly!!!");
    } catch (Exception e) {
      Assert.assertTrue(true);
    }
  }
}
