package JavaApi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class GenericDemo2 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("itcast");
        // list.add(5);//當集合明確型別後，存放型別不一致就會編譯報錯
        // 集合已經明確具體存放的元素型別，那麼在使用迭代器的時候，迭代器也同樣會知道具體遍歷元素型別
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = it.next();
            //當使用Iterator<String>控制元素型別後，就不需要強轉了。獲取到的元素直接就是String型別
            System.out.println(str.length());
        }
    }
}
