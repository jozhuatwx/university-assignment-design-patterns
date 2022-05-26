package factory;

import java.util.ArrayList;

public class Order {
  private ArrayList<MilkTea> milkTeas = new ArrayList<>();
  private double totalPrice = 0.0;

  public void addOrder(MilkTea milkTea) {
    milkTeas.add(milkTea);
    totalPrice += milkTea.getPrice();
  }

  public double getTotalPrice() {
    return totalPrice;
  }

  public void payOrder() {
    int i = 0;
    for (MilkTea milkTea : milkTeas) {
      System.out.println(++i + ". " + milkTea.getDescription());
    }
    System.out.println("\nTotal Price: RM " + String.format("%.2f", getTotalPrice()) + "\n==================================================\n");
  }
}
