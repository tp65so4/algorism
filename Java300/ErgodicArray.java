package Java300;

public class ErgodicArray {
    //24
    public static void main(String[] args) {
        String[] aves=new String[]{"a","b","c"};
        int index=0;
        System.out.println("打印出所有");
        //只要是true就持續打印
        while (index< aves.length){
            System.out.println(aves[index++]);
        }
    }
}
