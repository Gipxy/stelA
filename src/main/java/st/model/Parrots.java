package st.model;

public class Parrots extends Bird{
  private Animal living;

  public Parrots(Animal living) {
    this.living = living;
  }

  @Override
  public String getSound() {
    return living.getSound();
  }
}
