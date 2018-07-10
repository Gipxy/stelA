package st;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParrotsTest {
  private Parrots parrots;

  @Before
  public void init() {

  }

  @Test
  public void testSing() {

    //living with Chicken
    parrots = ParrotsFactory.createChickenParrots();
    String msg = parrots.getSound();
    String expected = "Cluck, cluck";
    Assert.assertEquals(expected, msg);

    //living with Rooster
    parrots = ParrotsFactory.createRoosterParrots();
    msg = parrots.getSound();
    expected = "Cock-a-doodle-doo";
    Assert.assertEquals(expected, msg);

  }
}
