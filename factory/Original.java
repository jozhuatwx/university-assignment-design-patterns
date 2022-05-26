package factory;

public class Original implements MilkTea {
  private String size;
  private int sugar;

  public Original(String size, int sugar) {
    this.size = size;
    this.sugar = sugar;
  }

  @Override
  public String getDescription() {
    return "Original Milk Tea" + size + ", " + sugar + "% Sugar";
  }

  @Override
  public double getPrice() {
    if (size.equalsIgnoreCase("LARGE")) {
      return 9.55;
    }
    
    if (size.equalsIgnoreCase("REGULAR")) {
      return 8.5;
    }

    return 0.0;
  }
}
