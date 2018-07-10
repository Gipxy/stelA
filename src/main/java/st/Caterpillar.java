package st;

public class Caterpillar extends Animal implements Walkable, Metamorphosis {
  public void walk() {
    BehaviorSimulator.walk();
  }


  public Animal from() {
    return null;
  }

  public Animal to() {
    return new Butterfly();
  }
}
