package JavaApi;

   interface Swim {
        public abstract void swimming();
    }

/**    public class AnonemousInnerClass01 {
        public static void main(String[] args) {
            // 使用匿名內部類
            new Swim() {
                @Override
                public void swimming() {
                    System.out.println("自由泳...");
                }
            }.swimming();

            // 介面 變數 = new 實現類(); // 多型,走子類的重寫方法
            Swim s2 = new Swim() {
                @Override
                public void swimming() {
                    System.out.println("蛙泳...");
                }
            };

            s2.swimming();
            s2.swimming();
        }
    }
1. 定義介面的實現類
    class Student implements Swim {
        // 2. 重寫抽象方法
        @Override
        public void swimming() {
            System.out.println("狗刨式...");
        }
    }

public class AnonemousInnerClass01{
    public static void main(String[] args) {
        // 3. 建立實現類物件
        Student s = new Student();
        // 4. 呼叫方法
        s.swimming();
    }
} **/
class Student implements Swim {
    // 2. 重寫抽象方法
    @Override
    public void swimming() {
        System.out.println("狗刨式...");
    }
}

public class AnonemousInnerClass01 {
    public static void main(String[] args) {
        // 普通方式傳入物件
        Student s = new Student();
        goSwimming(s);

        // 匿名內部類使用場景:匿名內部類作為方法引數傳遞
        Swim s3 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("蝶泳...");
            }
        };
        // 傳入匿名內部類
        goSwimming(s3);

        // 完美方案: 一步到位
        goSwimming(new Swim() {
            public void swimming() {
                System.out.println("大學生, 蛙泳...");
            }
        });

        goSwimming(new Swim() {
            public void swimming() {
                System.out.println("小學生, 自由泳...");
            }
        });
    }

    // 定義一個方法,模擬請一些人去游泳
    public static void goSwimming(Swim s) {
        s.swimming();
    }
}