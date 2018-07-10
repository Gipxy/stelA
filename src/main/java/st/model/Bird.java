package st.model;

import st.BehaviorSimulator;

public class Bird extends Animal implements Walkable, Flyable {
  public void sing() {
    System.out.println(getSound());
  }

  public String getSound() {
    return "I am singing";
  }

  public void walk() {
    BehaviorSimulator.walk();
  }

  public void fly() {
    BehaviorSimulator.fly();
  }
}
