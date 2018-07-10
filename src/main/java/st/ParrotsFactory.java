package st;

import st.model.Chicken;
import st.model.Parrots;
import st.model.Rooster;

public class ParrotsFactory {
  public static Parrots createChickenParrots() {
    return new Parrots(new Chicken());
  }

  public static Parrots createRoosterParrots() {
    return new Parrots(new Rooster());
  }
}
