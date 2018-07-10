package st;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import st.model.Rooster2;

public class Rooster2Test {
  private Rooster2 chicken;

  @Before
  public void init() {
    chicken = new Rooster2();
  }

  @Test
  public void testSing() {
    String msg = chicken.getSound();

    String expected = "Cock-a-doodle-doo";

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
