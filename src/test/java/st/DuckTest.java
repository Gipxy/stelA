package st;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DuckTest {
  private Duck duck;

  @Before
  public void init() {
    duck = new Duck();
  }

  @Test
  public void testSing() {
    String msg = duck.getSound();

    String expected = "Quack, quack";

    Assert.assertEquals(expected, msg);
  }

  @Test
  public void testSwim() {
    try {
      duck.swim();
      Assert.assertTrue(true);
    } catch (Exception e) {
      Assert.fail("Why duck can't swim!!!");
    }
  }
}
