package factory;

public class OrderSystem {
  public static void main(String[] args) {
    MilkTeaFactory factory = new MilkTeaFactory();

    Order order1 = new Order();
    order1.addOrder(factory.getMilkTea("CLASSICROASTED", "Large", 100));
    order1.addOrder(factory.getMilkTea("CLASSICROASTED", "Large", 50));
    order1.addOrder(factory.getMilkTea("CLASSICROASTED", "Large", 0));
    order1.addOrder(factory.getMilkTea("CLASSICROASTED", "Regular", 100));
    order1.addOrder(factory.getMilkTea("CLASSICROASTED", "Regular", 50));
    order1.addOrder(factory.getMilkTea("CLASSICROASTED", "Regular", 0));

    order1.payOrder();

    Order order2 = new Order();
    order2.addOrder(factory.getMilkTea("ORIGINAL", "Large", 100));
    order2.addOrder(factory.getMilkTea("ORIGINAL", "Large", 50));
    order2.addOrder(factory.getMilkTea("ORIGINAL", "Large", 0));
    order2.addOrder(factory.getMilkTea("ORIGINAL", "Regular", 100));
    order2.addOrder(factory.getMilkTea("ORIGINAL", "Regular", 50));
    order2.addOrder(factory.getMilkTea("ORIGINAL", "Regular", 0));

    order2.payOrder();
  }
}
