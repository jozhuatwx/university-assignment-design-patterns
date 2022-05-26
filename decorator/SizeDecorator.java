package decorator;

public class SizeDecorator extends MilkTeaDecorator {
  String size;

  public SizeDecorator(MilkTea decoratedMilkTea, String size) {
    super(decoratedMilkTea);
    this.size = size;
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", " + size;
  }
  
  @Override
  public double getPrice() {
    if (size.equalsIgnoreCase("LARGE")) {
      return super.getPrice() + 1.05;
    }
    return super.getPrice();
  }
}
