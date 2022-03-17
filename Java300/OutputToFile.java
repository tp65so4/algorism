package Java300;

import java.io.FileNotFoundException;
import java.io.PrintStream;
/*
013 輸出內容都輸出到log.txt
擴展：到達mac實際位置：Finder > go to
 */
public class OutputToFile {
    public static void main(String[] args) {
       try{
           PrintStream out=System.out;  //保存原有輸出功能(out是靜態成員）
           PrintStream ps=new PrintStream("./log.txt"); //輸出檔名
           System.setOut(ps); //設定輸出到./log.txt
           System.out.println("這些內容將被");
           System.out.println("輸出到log.txt");
           System.setOut(out); //恢復原本的System.out,不輸出到log.txt了
           System.out.println("請查看log");
       }catch (FileNotFoundException e){
           e.printStackTrace();
       }
    }
}
