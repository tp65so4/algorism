package JavaApi;

public class RegularExpression4 {
        public static void main(String[] args) {
            String str = "DG8FV-B9TKY-FRT9J-99899-XPQ4G";

            //驗證這個序列號：分為5組，每組之間使用-隔開，每組由5位A-Z或者0-9的字元組成
            String regex = "([A-Z0-9]{5}-){4}[A-Z0-9]{5}";
            System.out.println(str.matches(regex));
        }
    }

