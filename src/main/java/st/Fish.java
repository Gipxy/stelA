package st;

public abstract class Fish extends Animal implements Swimmable {
  String getSound() {
    throw new RuntimeException("Fish cant make sound!");
  }

  public void swim() {
    SwimDelegate.swim();
  }

  public abstract void remark();
}
