package JavaApi;

import java.util.Calendar;

public class CalenderSet {
        public static void main(String[] args) {
            //設定屬性——set(int field,int value):
            Calendar c1 = Calendar.getInstance();//獲取當前日期

            //計算班長出生那天是星期幾(假如班長出生日期為：1998年3月18日)
            c1.set(Calendar.YEAR, 1998);
            c1.set(Calendar.MONTH, 3 - 1);//轉換為Calendar內部的月份值
            c1.set(Calendar.DAY_OF_MONTH, 18);

            int w = c1.get(Calendar.DAY_OF_WEEK);
            System.out.println("班長出生那天是：" + getWeek(w));


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
