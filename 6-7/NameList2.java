import java.util.ArrayList;
import java.util.Iterator;

public class NameList2{
  public static void main(String[] args){
    ArrayList<String> names = new ArrayList<String>();
    names.add("櫻井");
    names.add("田中");
    names.add("中山");
    names.add("鈴本");
    String search = args[0];
    boolean result = false;

    Iterator<String> it = names.iterator();
    while(it.hasNext()){
      if(search.equals(it.next())){
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
