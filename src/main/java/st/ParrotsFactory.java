package st;

public class ParrotsFactory {
  public static Parrots createChickenParrots() {
    return new Parrots(new Chicken());
  }

  public static Parrots createRoosterParrots() {
    return new Parrots(new Rooster());
  }
}
