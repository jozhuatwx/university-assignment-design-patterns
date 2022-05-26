package decorator;

public class Original implements MilkTea {
  @Override
  public String getDescription() {
    return "Original Milk Tea";
  }

  @Override
  public double getPrice() {
    return 8.50;
  }
}
