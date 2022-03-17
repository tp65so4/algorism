package JavaApi;

public class RegularExpression3 {
        public static void main(String[] args) {
            String str = "";

            //1.驗證str是否是三位數字
            str = "012";
            String regex = "\\d{3}";
            System.out.println("1." + str.matches(regex));

            //2.驗證str是否是多位數字
            str = "88932054782342";
            regex = "\\d+";
            System.out.println("2." + str.matches(regex));

            //3.驗證str是否是手機號：
            str = "13813183388";
            regex = "1[358]\\d{9}";
            System.out.println("3." + str.matches(regex));

            //4.驗證小數:必須出現小數點，但是隻能出現1次
            String s2 = "3.1";
            regex = "\\d*\\.{1}\\d+";
            System.out.println("4." + s2.matches(regex));

            //5.驗證小數：小數點可以不出現，也可以出現1次
            regex = "\\d+\\.?\\d+";
            System.out.println("5." + s2.matches(regex));

            //6.驗證小數：要求匹配：3、3.、3.14、+3.14、-3.
            s2 = "-3.";
            regex = "[+-]\\d+\\.?\\d*";
            System.out.println("6." + s2.matches(regex));

            //7.驗證qq號碼：1).5--15位；2).全部是數字;3).第一位不是0
            s2 = "1695827736";
            regex = "[1-9]\\d{4,14}";
            System.out.println("7." + s2.matches(regex));
        }
}
