public class Fortune{
  public static void main(String[] args){
    String[] color =
    {"黄色", "黄緑", "緑", "水色", "青",
     "紫", "ピンク", "赤", "オレンジ", "茶色"};

    System.out.print("あなたの運勢は");
    try{
      for(int i = 0; i < 3; i++){
        System.out.print(".");
        Thread.sleep(1000);         //1000ミリ秒停止
      }

      double fn1 = Math.random();   // 0.0～1.0の乱数
      if( fn1 >= 0.7 ){
        System.out.println("大吉！");
      } else if( fn1 >= 0.4 ){
        System.out.println("中吉！");
      } else if( fn1 >= 0.1 ){
        System.out.println("小吉！");
      } else {
        System.out.println("凶");
      }

      int fn2 = ((int)(fn1 * 100)) % 10;
      System.out.println("ラッキーカラーは" + color[fn2]);

      System.out.println("fn1="+fn1);
      System.out.println("fn2="+fn2);
    } catch(InterruptedException e){
      System.out.println("割り込みが発生しました");
    }
  }
}