package _02_loop.baiTap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        int choice = -1;
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Draw the rectangle");
        System.out.println("2. Draw the square triangle");
        System.out.println("3. Draw the isosceles triangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();

        switch (choice){
            case 1:
                System.out.println("nhap chieu dai :");
                int chieuDai=input.nextInt();
                System.out.println("nhap chieu rong :");
                int chieuRong=input.nextInt();
                for(int i=0; i<chieuDai;i++){
                    for(int j=0;j<chieuRong;j++){
                        System.out.print("*");

                    }
                    System.out.println("");
                }
                break;
            case 2 :
                for (int i=1;i<10;i++){
                    for (int j=1;j<i;j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                for (int i=7;i>=1;i--){
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                break;
            case 3 :
                System.out.println("Print isosceles triangle");
                for(byte i=1,j;i<=5;i++){
                    for(j=1;j<=5-i;j++){
                        System.out.print(" ");
                    }
                    for(j=1;j<=2*i-1;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                System.out.print("Enter your choice: ");
                break;
            case 0 :
                System.exit(0);
                break;
            default:
                System.out.println("chon lai ban nhe");
                break;


        }


    }
}
