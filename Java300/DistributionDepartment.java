package Java300;

import java.util.Scanner;

public class DistributionDepartment {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("請輸入新員工姓名");
        String name = scn.nextLine();
        System.out.println("請輸入新員工應聘的編成語言");
        String language = scn.nextLine();
        switch (language.hashCode()){
            case 3254818:
            case 2301506:
            case 2269730:
                System.out.println("員工"+name+"被分配到java部門");
                break;
            case 3104:
            case 2112:
                System.out.println("員工"+name+"被分配到c部門");
                break;
            default:
                System.out.println("本公司不需要"+language+"語言的程序人員");
        }
    }
}


