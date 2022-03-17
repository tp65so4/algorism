package JavaApi;

import java.util.Calendar;

public class CalenderGet {
        public static void main(String[] args) {
            //1.獲取一個GregorianCalendar物件
            Calendar instance = Calendar.getInstance();//獲取子類物件

            //2.列印子類物件
            System.out.println(instance);

            //3.獲取屬性
            int year = instance.get(Calendar.YEAR);
            int month = instance.get(Calendar.MONTH) + 1;//Calendar的月份值是0-11
            int day = instance.get(Calendar.DAY_OF_MONTH);

            int hour = instance.get(Calendar.HOUR);
            int minute = instance.get(Calendar.MINUTE);
            int second = instance.get(Calendar.SECOND);

            int week = instance.get(Calendar.DAY_OF_WEEK);//返回值範圍：1--7，分別表示："星期日","星期一","星期二",...,"星期六"

            System.out.println(year + "年" + month + "月" + day + "日" +
                    hour + ":" + minute + ":" + second);
            System.out.println(getWeek(week));

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
