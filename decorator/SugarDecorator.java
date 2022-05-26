package decorator;

public class SugarDecorator extends MilkTeaDecorator {
  int percentage;

  public SugarDecorator(MilkTea decoratedMilkTea, int percentage) {
    super(decoratedMilkTea);
    this.percentage = percentage;
  }

  @Override
  public String getDescription() {
    return super.getDescription() + ", " + percentage + "% Sugar";
  }
}
