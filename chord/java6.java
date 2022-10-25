//オーバーロードとは同じメソッド名で引数が違うもの

package chord;

public class java6 {
  public static void main(String[] ages) {
    Car car = new Car();
    car.setNo(2525);
    car.run(30);
    car.display();

    car.brak(10);
    car.display();
  }
}

class Car {
  // 属性
  int no;
  int speed;

  // 操作
  void setNo(int n) {
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
