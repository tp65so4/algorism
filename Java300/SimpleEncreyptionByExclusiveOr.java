package Java300;

import java.util.Scanner;
//15
public class SimpleEncreyptionByExclusiveOr {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("請輸入一個英文字符串或解密字符串");
        String password=scan.nextLine();
        char[] array=password.toCharArray(); //toCharArray將字符串轉為字符數組
        for (int i = 0; i <array.length ; i++) {
            array[i]=(char) (array[i]^20000);
        }
        System.out.println("加密或解密結果如下");
        System.err.println(new String(array)); //輸出密鑰
    }
}
