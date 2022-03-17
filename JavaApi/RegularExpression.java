package JavaApi;

import java.util.Scanner;

public class RegularExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("請輸入你的QQ號碼：");
        String qq = sc.next();

        System.out.println(checkQQ2(qq));
    }
    //使用正則表示式驗證
    private static boolean checkQQ2(String qq){
        String regex = "[1-9]\\d{4,14}";//正則表示式
        return qq.matches(regex);
    }
}
