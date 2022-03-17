package JavaApi;

public class IntegerDemo {
    public static void main(String[] args) {
        //public Integer(int value)：根據 int 值建立 Integer 物件(過時)
        /* Integer i1 = new Integer(100);
        System.out.println(i1);

        //public Integer(String s)：根據 String 值建立 Integer 物件(過時)
        Integer i2 = new Integer("100");
        //Integer i2 = new Integer("abc"); //NumberFormatException
        System.out.println(i2);
        System.out.println();
        System.out.println("--------"); */

        //public static Integer valueOf(int i)：返回表示指定的 int 值的 Integer 例項
        Integer i3 = Integer.valueOf(100);
        System.out.println(i3);

        //public static Integer valueOf(String s)：返回儲存指定String值的Integer物件
        Integer i4 = Integer.valueOf("100");
        System.out.println(i4);
    }
}
