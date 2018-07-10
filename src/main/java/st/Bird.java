package st;

class Bird extends Animal {
  void fly() {
    System.out.println("I am flying");
  }

  void sing() {
    System.out.println(getSound());
  }

  String getSound() {
    return "I am singing";
  }
}
