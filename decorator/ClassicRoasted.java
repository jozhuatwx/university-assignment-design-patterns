package decorator;

public class ClassicRoasted implements MilkTea {
  @Override
  public String getDescription() {
    return "Classic Roasted Milk Tea";
  }

  @Override
  public double getPrice() {
    return 9;
  }
}
