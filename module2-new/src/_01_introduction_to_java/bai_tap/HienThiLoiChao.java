package _01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class HienThiLoiChao {
    public static void main(String[] args) {
        // INPUT: scanner (alt + Enter)
        Scanner scanner = new Scanner(System.in);
        // Nhap so
//        int a = scanner.nextInt();

        // Nhap chuoi
        System.out.println("Vui long nhap 1 chuoi bat ky: ");
        String str = scanner.nextLine();

        // OUTPUT: sout
        System.out.println(str);
    }
}
