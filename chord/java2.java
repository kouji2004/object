package chord;

public class java2 {
  public static void main(String[] ages) {
    Student stu1 = new Student();
    Student stu2 = new Student();

    stu1.setDate("ミウラ");
    stu1.setScore(90, 100);
    stu1.display();

    stu2.setDate("ミ", 100, 98);
    stu2.display();
  }
}

class Student {
  // 属性
  String name;
  int engScore;
  int mathScore;

  // 操作
  void setDate(String n) {
    name = n;
  }

  void setDate(String n, int e, int m) {
    name = n;
    engScore = e;
    mathScore = m;
  }

  void setScore(int e, int m) {
    engScore = e;
    mathScore = m;
  }

  void display() {
    System.out.println(name + "さん");
    System.out.println("英語" + engScore + "点・数学" + mathScore + "点");
  }
}