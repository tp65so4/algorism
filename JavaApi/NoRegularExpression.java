package JavaApi;

import java.util.Scanner;

public class NoRegularExpression {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("請輸入你的QQ號碼：");
            String qq = sc.next();

            System.out.println(checkQQ(qq));
        }
        //我們自己編寫程式碼，驗證QQ號碼
        private static boolean checkQQ(String qq) {
            //1.驗證5--15位
            if(qq.length() < 5 || qq.length() > 15){
                return false;
            }
            //2.必須都是數字；
            for(int i = 0;i < qq.length() ; i++){
                char c = qq.charAt(i);
                if(c < '0' || c > '9'){
                    return false;
                }
            }
            //3.首位不能是0；
            char c = qq.charAt(0);
            if(c == '0'){
                return false;
            }
            return true;//驗證通過
        }

}
