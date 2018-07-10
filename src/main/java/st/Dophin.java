package st;

public class Dophin extends Animal implements Swimmable {
  String getSound() {
    return "Dophin sound...";
  }


  public void swim() {
    BehaviorSimulator.swim();
  }
}
