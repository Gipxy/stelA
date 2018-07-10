package st;

public class CountMain {
  public static void main(String[] args) {
    Animal[] animals = new Animal[]{ new Bird(),
            new Duck(),
            new Chicken(),
            new Rooster(),
            ParrotsFactory.createChickenParrots(),
            new Fish(),
            new Shark(),
            new Clownfish(),
            new Dophin(),
            new Butterfly(),
    };

    int countFly =0, countWalk=0;

    for (Animal a : animals) {
      if (a instanceof Flyable) {
        countFly++;
      }

      if (a instanceof Walkable) {
        countWalk++;
      }
    }

    System.out.print("countFly=" + countFly + ", countWalk=" + countWalk);
  }
}
