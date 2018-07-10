package st;

public class Chicken extends Bird {
  public String getSound() {
    return "Cluck, cluck";
  }

  public void fly() {
    throw new RuntimeException("I can't fly!");
  }
}
