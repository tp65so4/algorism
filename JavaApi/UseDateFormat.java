package JavaApi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UseDateFormat {
        public static void main(String[] args) throws ParseException {
            //格式化：從 Date 到 String
            Date d = new Date();
            System.out.println(d);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String s = sdf.format(d);
            System.out.println(s);
            System.out.println("--------");

            //從 String 到 Date
            String ss = "2048-08-09 11:11:11";
            //ParseException
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date dd = sdf2.parse(ss);
            System.out.println(dd);
        }
}
