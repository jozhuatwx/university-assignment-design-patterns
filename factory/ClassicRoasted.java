package factory;

public class ClassicRoasted implements MilkTea {
  private String size;
  private int sugar;

  public ClassicRoasted(String size, int sugar) {
    this.size = size;
    this.sugar = sugar;
  }

  @Override
  public String getDescription() {
    return "Classic Roasted Milk Tea" + size + ", " + sugar + "% Sugar";
  }

  @Override
  public double getPrice() {
    if (size.equalsIgnoreCase("LARGE")) {
      return 10.05;
    }
    
    if (size.equalsIgnoreCase("REGULAR")) {
      return 9;
    }

    return 0;
  }
}
