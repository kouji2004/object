//コンストラクタ

package chord;

public class lesson2 {
  public static void main(String[] ages) {
    Car c1 = new Car();
    c1.run(30);
    c1.display();

    Car c2 = new Car(2525);
    c2.run(50);
    c2.display();
  }
}

class Car {
  // 属性
  int no;
  int speed;

  // 操作

  Car() {
    no = 0;
  }

  Car(int n) {
    no = n;
  }

  void run(int s) {
    speed = s;
  }

  void brak() {
    speed = 0;
  }

  void brak(int s) {
    speed = speed - s;
  }

  void display() {
    System.out.println("ナンバー" + no + "の速度は" + speed + "です");
  }
}
