package st.model;

import st.BehaviorSimulator;

public class Dophin extends Animal implements Swimmable {
  public String getSound() {
    return "Dophin sound...";
  }


  public void swim() {
    BehaviorSimulator.swim();
  }
}
