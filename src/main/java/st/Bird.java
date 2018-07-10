package st;

class Bird extends Animal implements Walkable, Flyable {
  void sing() {
    System.out.println(getSound());
  }

  String getSound() {
    return "I am singing";
  }

  public void walk() {
    BehaviorSimulator.walk();
  }

  public void fly() {
    BehaviorSimulator.fly();
  }
}
