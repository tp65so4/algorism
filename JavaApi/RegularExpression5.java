package JavaApi;

public class RegularExpression5 {
    public static void main(String[] args) {
        //將下面字串中的"數字"替換為"*"
        String str = "jfdk432jfdk2jk24354j47jk5l31324";
        System.out.println(str.replaceAll("\\d+", "*"));
    }
}
