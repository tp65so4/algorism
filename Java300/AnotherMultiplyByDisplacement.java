package Java300;

import java.util.Scanner;

public class AnotherMultiplyByDisplacement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("請輸入一個數字");
        long number=scan.nextLong();
        System.out.println("您輸入的數字是"+number);
        System.out.println("該數字*2="+(number<<1));
        System.out.println("該數字*4="+(number<<2));
        System.out.println("該數字*8="+(number<<3));
        System.out.println("該數字*16="+(number<<4));
        System.out.println("該數字*32="+(number<<5));
    }
}
