package st.model;

public abstract class  Animal {

  public String getSound() {
    throw new RuntimeException("I can't sound!");
  };
}
