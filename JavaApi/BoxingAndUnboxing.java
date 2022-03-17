package JavaApi;

public class BoxingAndUnboxing {
    public static void main(String[] args) {
        //基本類型4包裝成Integer類型
        Integer iii = Integer.valueOf(4);//使用包裝類中的valueOf方法
        System.out.println(iii);
        //Integer拆封成int類型
        int num = iii.intValue();
        System.out.println(num);
    }
}
