package JavaApi;

class Fu {
    // Fu中的成員變數。
    int num = 5;
}

class Zi extends Fu {
    // Zi中的成員變數
    int num = 6;

    public void show() {
        int num = 1;

        // 訪問方法中的num
        System.out.println("method num=" + num);
        // 訪問子類中的num
        System.out.println("Zi num=" + this.num);
        // 訪問父類中的num
        System.out.println("Fu num=" + super.num);
    }
}

class FuZi {
    public static void main(String[] args) {
        // 建立子類物件
        Zi z = new Zi();
        // 呼叫子類中的show方法
        z.show();
    }
}
