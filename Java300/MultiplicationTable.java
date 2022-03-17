package Java300;

public class MultiplicationTable {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for (int j=1;j<=i;j++){
                //關鍵在這個i和j對調,就算i和j對調乘出來的結果還是一樣的！
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
