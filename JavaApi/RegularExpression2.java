package JavaApi;

public class RegularExpression2 {
        public static void main(String[] args) {
            String str = "258";

            //1.驗證str是否3位數字
            String regex = "\\d\\d\\d";
            System.out.println("1." + str.matches(regex));

            //2.驗證手機號：1開頭，第二位：3/5/8，剩下9位都是0-9的數字
            str = "13513153355";//要驗證的字串
            regex = "1[358]\\d\\d\\d\\d\\d\\d\\d\\d\\d";//正則表示式
            System.out.println("2." + str.matches(regex));

            //3.驗證字串是否以h開頭，以d結尾，中間是任何字元
            str = "had";//要驗證的字串
            regex = "h.d";//正則表示式
            System.out.println("3." + str.matches(regex));

            //4.驗證str是否是：had.
            str = "had.";//要驗證的字串
            regex = "had\\.";//\\.代表'.'符號，因為.在正則中被預定義為"任意字元"，不能直接使用
            System.out.println("4." + str.matches(regex));
        }
}
