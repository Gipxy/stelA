package st.model;

public class Rooster2 extends Bird {
  private Chicken chicken = new Chicken();

  @Override
  public String getSound() {
    return "Cock-a-doodle-doo";
  }

  @Override
  public void fly() {
    chicken.fly();
  }
}
