package st;

public class Rooster2 extends Bird {
  private Chicken chicken = new Chicken();

  @Override
  String getSound() {
    return "Cock-a-doodle-doo";
  }

  @Override
  public void fly() {
    chicken.fly();
  }
}
