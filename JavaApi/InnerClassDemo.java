package JavaApi;

public class InnerClassDemo {
        public static void main(String[] args) {
            Body.Heart heart = new Body().new Heart();
            heart.jump();
        }
    }

    class Body {	// 身體
        private int weight = 30;

        // 在成員位置定義一個類
        class Heart {
            private int weight = 20;

            public void jump() {
                int weight = 10;
                System.out.println("心臟在跳動 " + weight);	// 10
                System.out.println("心臟在跳動 " + this.weight);	// 20
                System.out.println("心臟在跳動 " + Body.this.weight);	// 30
            }
        }
    }

