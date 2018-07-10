package st;

public abstract class Fish extends Animal {

  String getSound() {
    throw new RuntimeException("Fish cant make sound!");
  }

  public void swim() {
    System.out.println("I am swimming");
  }

  public abstract void remark();
}
