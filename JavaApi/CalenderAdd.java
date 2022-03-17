package JavaApi;

import java.util.Calendar;

public class CalenderAdd {
        public static void main(String[] args) {
            //計算200天以後是哪年哪月哪日，星期幾？
            Calendar c2 = Calendar.getInstance();//獲取當前日期
            c2.add(Calendar.DAY_OF_MONTH, 200);//日期加200

            int y = c2.get(Calendar.YEAR);
            int m = c2.get(Calendar.MONTH) + 1;//轉換為實際的月份
            int d = c2.get(Calendar.DAY_OF_MONTH);

            int wk = c2.get(Calendar.DAY_OF_WEEK);
            System.out.println("200天后是：" + y + "年" + m + "月" + d + "日" + getWeek(wk));

        }
        //查表法，查詢星期幾
        public static String getWeek(int w) {//w = 1 --- 7
            //做一個表(陣列)
            String[] weekArray = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
            //            索引      [0]      [1]       [2]      [3]       [4]      [5]      [6]
            //查表
            return weekArray[w - 1];
        }
}
