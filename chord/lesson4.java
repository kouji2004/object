//staticを使って車の台数を表示する

package chord;

public class lesson4 {
  public static void main(String[] ages) {
    // staticを使う場合は クラス名.変数名 = クラス名.メソッド名

    // Car c1 = new Car(); ←static無しバージョン
    // c1.display(); ←static無しバージョン
    Car c1 = new Car(123);
    Car.display();

    // Car c2 = new Car();
    Car c2 = new Car(123);
    Car.display();

    // Car c3 = new Car();
    Car c3 = new Car(2525);
    Car.display();
  }
}

class Car {
  // 属性
  private int no;
  // private int count; ←static無し
  private static int count;

  // 操作（メソッド）
  public Car() {
    no = 0;
    count++;
    System.out.println("ナンバーなしを作りました");
  }

  public Car(int n) {
    no = n;
    count++;
    System.out.println("ナンバー" + no + "を作りました");
  }

  // public void display() ←static無しのバージョン
  public static void display() {
    System.out.println(count + "台を作成しました。");
  }
}