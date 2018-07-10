package st;

public class Fish extends Animal implements Swimmable {
  String getSound() {
    throw new RuntimeException("Fish cant make sound!");
  }

  public void swim() {
    BehaviorSimulator.swim();
  }

  public void remark() {
    System.out.println("General Fish");
  };
}
