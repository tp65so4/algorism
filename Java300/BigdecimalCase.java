package Java300;

import java.math.BigDecimal;

/*
“对于高精度要求或者运算数较大的计算，应该使用BigDecimal类实现，否则Java基本类型的数据无法保证浮点数的精度，也无法对超出其表示范围的数字进行运算。”
“本实例主要应用了while循环和BigDecimal类的实例对象的相关方法实现计算1＋1/2!＋1/3!…1/20!的和。BigDecimal类型的数字可以用来做超大的浮点数的运算，如加、减、乘、除等。使用BigDecimal对象的add()方法可以实现加法运算，使用multiply()方法可以实现乘法运算。”
 */
public class BigdecimalCase {
    public static void main(String[] args) {
        BigDecimal sum=new BigDecimal(0.0);
        BigDecimal factorial=new BigDecimal(1.0);
        int i=1;
        while(i<=20){
            sum=sum.add(factorial);
            ++i;
            factorial=factorial.multiply((new BigDecimal(1.0/i)));
            System.out.println(factorial.doubleValue());
        }
        System.out.println("1+ 1/2!+ 1/3!.....1/20!的計算結果為\n"+sum);
    }

}
