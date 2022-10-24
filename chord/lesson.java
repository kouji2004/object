package chord;

public class lesson {
  public static void main(String[] ages) {
    // Carクラスのオブジェクトを生成
    Car c1 = new Car();

    // 自動車c1のナンバーを255に設定
    c1.setNo(234);

    // 自動車c1の速度を30に設定
    c1.run(30);

    // 自動車c1のナンバー、速度表示
    c1.display();

    // 自動車c1のの速度を0に表示
    c1.stop();

    // 自動車c1のナンバー、速度を表示
    c1.display();
  }
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