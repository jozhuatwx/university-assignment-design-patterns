package factory;

public class MilkTeaFactory {
  public MilkTea getMilkTea(String milkTeaType, String size, int sugar) {
    if (milkTeaType.equalsIgnoreCase("CLASSICROASTED")) {
      return new ClassicRoasted(size, sugar);
    }

    if (milkTeaType.equalsIgnoreCase("ORIGINAL")) {
      return new Original(size, sugar);
    }

    return null;
  }
}
