package chord;

public class java3 {
  public static void main(String[] ages) {
    Student stu1 = new Student("ミウラ");
    Student stu2 = new Student("ミウラ", 90, 98);

    stu1.setScore(90, 90);
    stu1.display();
    stu2.display();

  }
}

class Student {
  // 属性を定義
  String name;
  int engScore;
  int mathScore;

  // メソッド（操作）

  Student(String n) {
    name = n;
  }

  // コンストラクタを使ってメソッドを定義。 型はクラスメソッド（Student）に合わす
  Student(String n, int e, int m) {
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
    System.out.println("英語" + engScore + "点" + "数学" + mathScore + "点");
  }
}
