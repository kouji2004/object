//private カプセル化

package chord;

public class lesson3 {
  public static void main(String[] ages) {
    Car c1 = new Car();
    c1.run(30);
    c1.display();

    Car c2 = new Car(2525);
    c2.run(50);
    // c2.speed = 50;
    c2.display();
  }
}

class Car {
  // 属性を指定
  private int no;
  private int speed;

  public Car() {
    no = 0;
  }

  public Car(int n) {
    no = n;
  }

  public void run(int s) {
    speed = s;
  }

  public void brake() {
    speed = 0;
  }

  public void brake(int s) {
    speed = speed - s;
  }

  public void display() {
    System.out.println("ナンバー" + no + "の速度は" + speed + "です");
  }
}