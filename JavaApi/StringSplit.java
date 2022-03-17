package JavaApi;

public class StringSplit {
    public static void main(String[] args) {
        String str = "18  4 567       99     56";
        String[] strArray = str.split(" +");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }
    }
}
