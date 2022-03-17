package Java300;

import java.util.Scanner;
//字串屬於對象,所以要用equals
public class LoginCheck {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("請輸入帳號");
        String username = scn.nextLine();
        System.out.println("請輸入密碼");
        String password = scn.nextLine();
        if(!username.equals("admin")){
            System.out.println("帳號錯誤");
        }else if(!password.equals("123456")){
            System.out.println("密碼錯誤");
        }else{
            System.out.println("登錄成功");
        }
    }
}
