package Java300;/*
Java利用迴圈列印菱形、空心菱形
https://iter01.com/565469.html

 */

public class Diamond {
    public static void main(String[] args) {
        printHelloRhombus(7);
    }
    public static void printHelloRhombus(int size){
        if(size%2==0){
            size++;
        }
        for(int i=0;i<size/2+1;i++){
            for (int j=size/2+1;j>i+1;j--){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                if(j==0||j==2*i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for(int i=size/2+1;i<size;i++){
            for(int j=0;j<i-size/2;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*size-1-2*i;j++){
                if(j==0||j==2*(size-i-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
