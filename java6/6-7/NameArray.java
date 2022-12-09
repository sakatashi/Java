public class NameArray{
  public static void main(String[] args){
    String[] names = {"櫻井", "田中", "中山", "鈴本"};
    String search = args[0];
    boolean result = false;

    for(int i = 0; i < names.length; i++){
      if(search.equals(names[i])){
        result = true;
      }
    }
    if(result){
      System.out.println(search + "さんは含まれています");
    } else {
      System.out.println(search + "さんは含まれていません");
    }
  }
}
