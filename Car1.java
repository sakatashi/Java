class Car1{
  int no;
  int speed;

  void setNo(int n){
    no = n;
  }
  void run(int s){
    speed = s;
  }
  // brakeメソッドを定義する
  void brake(){
    speed = 0;
  }
  void brake(int s){
    speed = speed - s;
  }
  void display(){
    System.out.println("ナンバー" + no + "速度は" + speed + "です");
  }
}
