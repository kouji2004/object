package chord;

public class java1 {
  public static void main(String[] ages) {

  }
}

class Student {
  // メンバー変数（属性）
  String name;
  int engScore;
  int mathScore;

  // メソッド（操作）
  void display() {//引数なし、戻り値なし
    System.out.println(name + "さん");
    System.out.println("英語" + engScore + "点" + mathScore + "点");
  }

  void setScore(int eng, int math) {//引数あり、戻り値なし
    engScore = eng;
    mathScore = math;
  }

  double getAvg() {//引数なし、戻り値あり
    double avg = (engScore + mathScore) / 2.0;
    return avg;
  }
}