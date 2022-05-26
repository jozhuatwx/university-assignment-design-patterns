package decorator;

public class OrderSystem {
  public static void main(String[] args) {
    Order order1 = new Order();
    order1.addOrder(new SugarDecorator(new SizeDecorator(new ClassicRoasted(), "Large"), 100));
    order1.addOrder(new SugarDecorator(new SizeDecorator(new ClassicRoasted(), "Large"), 50));
    order1.addOrder(new SugarDecorator(new SizeDecorator(new ClassicRoasted(), "Large"), 0));
    order1.addOrder(new SugarDecorator(new SizeDecorator(new ClassicRoasted(), "Regular"), 100));
    order1.addOrder(new SugarDecorator(new SizeDecorator(new ClassicRoasted(), "Regular"), 50));
    order1.addOrder(new SugarDecorator(new SizeDecorator(new ClassicRoasted(), "Regular"), 0));

    order1.payOrder();

    Order order2 = new Order();
    order2.addOrder(new SugarDecorator(new SizeDecorator(new Original(), "Large"), 100));
    order2.addOrder(new SugarDecorator(new SizeDecorator(new Original(), "Large"), 50));
    order2.addOrder(new SugarDecorator(new SizeDecorator(new Original(), "Large"), 0));
    order2.addOrder(new SugarDecorator(new SizeDecorator(new Original(), "Regular"), 100));
    order2.addOrder(new SugarDecorator(new SizeDecorator(new Original(), "Regular"), 50));
    order2.addOrder(new SugarDecorator(new SizeDecorator(new Original(), "Regular"), 0));

    order2.payOrder();
  }
}
