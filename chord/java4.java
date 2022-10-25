package chord;

public class java4 {
  public static void main(String[] ages) {

    Student.display();

    Student stu1 = new Student("ミウラ");
    Student.display();

    Student stu2 = new Student("ミ");
    Student.display();
  }
}

class Student {
  // 属性
  String name;
  static int counter;

  // 操作（メソッド）
  Student(String n) {
    name = n;
    counter++;
    System.out.println(name + "さんをインスタンス化しました");
  }

  static void display() {
    System.out.println(counter + "人です");
  }
}