package st;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import st.model.Bird;


public class BirdSingTest {
  private Bird bird;

  @Before
  public void init() {
    bird = new Bird();
  }

  @Test
  public void testSingNotNull() {
    String msg = bird.getSound();

    Assert.assertNotNull(msg);
  }


}
