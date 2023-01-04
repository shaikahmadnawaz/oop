public class Student {
  int rno;
  String name;
  float marks;

  Student(int rno, String name, float marks) {
    this.rno = rno;
    this.name = name;
    this.marks = marks;
  }

  void callHim() {
    System.out.println("Nawaz");
  }

  public static void main(String[] args) {
    Student st = new Student(5, "nawaz", 100);
    // System.out.println(st.callHim());
    st.callHim();
  }
}
