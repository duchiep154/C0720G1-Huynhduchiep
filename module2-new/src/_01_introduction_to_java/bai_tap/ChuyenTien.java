package _01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenTien {
    public static void main(String[] args) {
        double vnd=23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("mời bạn nhập số tiền");
        usd = sc.nextDouble();
        double quydoi= usd * 23000;
        System.out.print( "giá tri VND :"+ quydoi);
    }
}
