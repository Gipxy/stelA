package st;

public class Duck extends Bird implements Swimmable{
  public String getSound() {
    return "Quack, quack";
  }

  public void swim() {
    SwimDelegate.swim();
  }
}
