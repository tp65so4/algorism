package Java300;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("請輸入數字");
        long inputnum=scanner.nextLong();
        /*
           另一種方式使用三元運算符
           String check=(number%2==0)?"是偶數“：“是奇數”;
         */
        if(inputnum%2==0){
            System.out.println("偶數");
        }else{
            System.out.println("奇數");
        }
    }
}
