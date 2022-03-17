package Java300;

/*
“杨辉三角形由数字排列，可以把它看作一个数字表，其基本特性是两侧数值均为1，其他位置的数值是其正上方的数值与左上角数值之和”
 */
public class YanghuiTriangle {
    public static void main(String[] args) {
        int triangle[][]=new int[10][];
        for(int i=0;i< triangle.length;i++){
            //初始化第二層數組的大小
            triangle[i]=new int[i+1];
            for(int j=0;j<=i;j++){
                if(i==0||j==0||j==i){
                    triangle[i][j]=1;
                }else{
                    triangle[i][j]=triangle[i-1][j]+triangle[i-1][j-1];
                }
                System.out.print(triangle[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
