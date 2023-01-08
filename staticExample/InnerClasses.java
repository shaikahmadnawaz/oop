package staticExample;

public class InnerClasses {

  // Inner classes can be static but outter classes can't be static
  static class Test {
    String name;

    public Test(String name) {
      this.name = name;
    }
  }

  public static void main(String[] args) {
    Test a = new Test("Nawaz");

    System.out.println(a.name);
  }
}
