package JavaApi;

//驗證for迴圈列印數字1-9999所需要使用的時間（毫秒）
public class SystemDemo {
    public static void main(String[] args) {
        //獲取當前時間毫秒值
        System.out.println(System.currentTimeMillis());
        //計算程式執行時間
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗時毫秒：" + (end - start));
    }
}
