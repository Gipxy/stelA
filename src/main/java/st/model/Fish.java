package st.model;

import st.BehaviorSimulator;

public class Fish extends Animal implements Swimmable {
  public String getSound() {
    throw new RuntimeException("Fish cant make sound!");
  }

  public void swim() {
    BehaviorSimulator.swim();
  }

  public void remark() {
    System.out.println("General Fish");
  };
}
