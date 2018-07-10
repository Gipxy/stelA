package st.model;

import st.BehaviorSimulator;

public class Duck extends Bird implements Swimmable{
  public String getSound() {
    return "Quack, quack";
  }

  public void swim() {
    BehaviorSimulator.swim();
  }
}
