package st;

import org.junit.Assert;
import org.junit.Test;
import st.model.Parrots;

public class ParrotsTest {


  @Test
  public void testSing() {
    Parrots parrots;

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
