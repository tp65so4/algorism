package Java300;

import java.util.Scanner;

public class SwapNumByExclusiveOr {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("請輸入數字1");
        long num1=scn.nextLong();
        System.out.println("請輸入數字2");
        long num2=scn.nextLong();
        System.out.println("num1="+num1+"num2="+num2);
        System.out.println("執行swap");
        num1=num1^num2;
        System.out.println(num1);
        num2=num2^num1;//把2找回來
        System.out.println(num2);
        num1=num1^num2;
        System.out.println(num1);

        System.out.println("num1="+num1+"num2="+num2);

    }
}
