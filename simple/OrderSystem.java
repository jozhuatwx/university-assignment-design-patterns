package simple;

public class OrderSystem {
  public static void main(String[] args) {
    Order order1 = new Order();
    order1.addOrder(new ClassicRoastedLargeHundredSugar());
    order1.addOrder(new ClassicRoastedLargeFiftySugar());
    order1.addOrder(new ClassicRoastedLargeZeroSugar());
    order1.addOrder(new ClassicRoastedRegularHundredSugar());
    order1.addOrder(new ClassicRoastedRegularFiftySugar());
    order1.addOrder(new ClassicRoastedRegularZeroSugar());

    order1.payOrder();

    Order order2 = new Order();
    order2.addOrder(new OriginalLargeHundredSugar());
    order2.addOrder(new OriginalLargeFiftySugar());
    order2.addOrder(new OriginalLargeZeroSugar());
    order2.addOrder(new OriginalRegularHundredSugar());
    order2.addOrder(new OriginalRegularFiftySugar());
    order2.addOrder(new OriginalRegularZeroSugar());

    order2.payOrder();
  }
}
