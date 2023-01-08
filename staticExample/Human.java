package staticExample;

public class Human {
  int age;
  String name;
  static long population;

  public Human(int age, String name) {
    this.age = age;
    this.name = name;
    Human.population += 1;
  }
}
