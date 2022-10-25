package chord;

public class java5 {
  public static void main(String[] ages) {
    Student stu1 = new Student("ミウラ");
    stu1.setScore(80);
    stu1.display();

    Student stu2 = new Student("ミ");
    stu2.setScore(-100);
    stu2.display();
  }
}

class Student {
  // 1属性
  private String name;
  int score;

  // 操作（メソッド）
  public Student(String n) {
    name = n;
  }

  public void setScore(int s) {
    if (0 <= s && s <= 100) {
      score = s;
    } else {
      System.out.println(name + "さんの点数が範囲外です");
      score = 0;
    }
  }

  void display() {
    System.out.println(name + "さん" + score + "点");
  }
}
