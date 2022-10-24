package chord;

public class lesson {
  
}

class Car {
  // 属性

  // 属性の使い方(データ型 変数)
  int no;
  int speed;

  // 操作
  void setNo(int n) {// 引数あり、戻り値なし
    no = n;
  }

  void run(int s) {// 引数あり、戻り値なし
    speed = s;
  }

  void stop() {// 引数なし、戻り値なし
    speed = 0;
  }

  void display() {// 変数のスピードを表示する
    System.out.println("ナンバー" + no + "の速度は" + speed + "です");
  }
}