package decorator;

public abstract class MilkTeaDecorator implements MilkTea {
  protected MilkTea decoratedMilkTea;

  public MilkTeaDecorator(MilkTea decoratedMilkTea) {
    this.decoratedMilkTea = decoratedMilkTea;
  }

  @Override
  public String getDescription() {
    return decoratedMilkTea.getDescription();
  }

  @Override
  public double getPrice() {
    return decoratedMilkTea.getPrice();
  }
}
