package chord;

public class StuSample {
  public static void main(String[] ages) {
    java stu1 = new java();
    stu1.name = "三浦";
    stu1.setScore(90, 90);

    stu1.display();
    System.out.println("平均" + stu1.getAvg() + "点");
  }
}

// 設計図
class java {
  // メンバー変数（属性）
  String name;
  int engScore;
  int mathScore;

  // メソッド（操作）
  void display() {// 引数なし、戻り値なし
    System.out.println(name + "さん");
    System.out.println("英語" + engScore + "点" + mathScore + "点");
  }

  void setScore(int eng, int math) {// 引数あり、戻り値なし
    engScore = eng;
    mathScore = math;
  }

  double getAvg() {// 引数なし、戻り値あり
    double avg = (engScore + mathScore) / 2.0;
    return avg;
  }
}