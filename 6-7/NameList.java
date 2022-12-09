import java.util.ArrayList;

public class NameList{
  public static void main(String[] args){
    ArrayList<String> names = new ArrayList<String>();
    names.add("櫻井");
    names.add("田中");
    names.add("中山");
    names.add("鈴本");
    String search = args[0];
    boolean result = false;

    for(int i = 0; i < names.size(); i++){
      if(search.equals(names.get(i))){
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
