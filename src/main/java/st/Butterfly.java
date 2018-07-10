package st;

public class Butterfly extends Animal implements Flyable, Metamorphosis {
  public void fly() {
    BehaviorSimulator.fly();
  }


  public Animal from() {
    return new Caterpillar();
  }

  public Animal to() {
    return null;
  }
}
