package JavaApi;


class Person{
        public void eat(){
            System.out.println("吃飯");
        }
    }
public class Fuzi2 {
        public static void main(String[] args){
            method(new Person());
            Person p = createPerson();
        }

        //引用型別作為方法引數,在前面筆記本案例中我們也使用了介面型別作為方法引數
        public static void method(Person p){
            p.eat();
        }

        //引用型別作為返回值
        public static Person createPerson(){
            return new Person();
        }
    }


