package JavaApi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*程式在執行時發生了問題java.lang.ClassCastException。 為什麼會發生型別轉換異常呢？ 我們來分析下：由於集合中什麼型別的元素都可以儲存。導致取出時強轉引發執行時 ClassCastException。 怎麼來解決這個問題呢？ Collection雖然可以儲存各種物件，但實際上通常Collection只儲存同一型別物件。例如都是儲存字串物件。因此在JDK5之後，新增了泛型(Generic)語法，讓你在設計API時可以指定類或方法支援泛型，這樣我們使用API的時候也變得更為簡潔，並得到了編譯時期的語法檢查。
 */
public class GenericDemo {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add("abc");
        coll.add("itcast");
        coll.add(5);//由於集合沒有做任何限定，任何型別都可以給其中存放
        Iterator it = coll.iterator();
        while(it.hasNext()){
            //需要列印每個字串的長度,就要把迭代出來的物件轉成String型別
            String str = (String) it.next();
            System.out.println(str.length());
        }
    }
}
