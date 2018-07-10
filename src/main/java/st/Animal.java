package st;

abstract class  Animal {

  String getSound() {
    throw new RuntimeException("I can't sound!");
  };
}
