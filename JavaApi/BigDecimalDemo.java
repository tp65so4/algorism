package JavaApi;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
        /* 錯誤的計算
        System.out.println(0.09 + 0.01); 0.09999999999999999
        System.out.println(1.0 - 0.32); 0.6799999999999999
        System.out.println(1.015 * 100);  101.49999999999999
        System.out.println(1.301 / 100); 0.013009999999999999
        System.out.println("下面是正確的計算結果");
        System.out.println(0.9+0.1);  1.0
        System.out.println(1.7+1.2);  2.9

        public BigDecimal(double val)    将double表示形式转换为BigDecimal *不建议使用
        public BigDecimal(int val)　　将int表示形式转换成BigDecimal
        public BigDecimal(String val)　　将String表示形式转换成BigDecimal
        为什么不建议采用第一种构造方法呢？来看例子
        BigDecimal bigDecimal = new BigDecimal(2);
        BigDecimal bDouble = new BigDecimal(2.3);
        BigDecimal bString = new BigDecimal("2.3");
        System.out.println("bigDecimal=" + bigDecimal); bigDecimal=2
        System.out.println("bDouble=" + bDouble); bDouble=2.29999999999999982236431605997495353221893310546875
        System.out.println("bString=" + bString); bString=2.3
        为什么会出现这种情况呢？
        JDK的描述：1、参数类型为double的构造方法的结果有一定的不可预知性。有人可能认为在Java中写入newBigDecimal(0.1)所创建的BigDecimal正好等于 0.1（非标度值 1，其标度为 1），但是它实际上等于0.1000000000000000055511151231257827021181583404541015625。这是因为0.1无法准确地表示为 double（或者说对于该情况，不能表示为任何有限长度的二进制小数）。这样，传入到构造方法的值不会正好等于 0.1（虽然表面上等于该值）。
        2、另一方面，String 构造方法是完全可预知的：写入 newBigDecimal("0.1") 将创建一个 BigDecimal，它正好等于预期的 0.1。因此，比较而言，通常建议优先使用String构造方法。

         */
        BigDecimal bDouble1 = BigDecimal.valueOf(2.3);
        BigDecimal bDouble2 = new BigDecimal(Double.toString(2.3));

        System.out.println("bDouble1=" + bDouble1);
        System.out.println("bDouble2=" + bDouble2);

        BigDecimal add = bDouble1.add(bDouble2);
        System.out.println("加總為"+add);
    }
}
