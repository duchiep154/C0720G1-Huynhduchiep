package _15_xu_ly_ngoai_le_debug.bai_tap.su_dung_lop_IllegalTriangleException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int side1 = 0;
        int side2 =0;
        int side3 =0;
       try {
           System.out.print("Nhập cạnh thứ nhất của tam giác: ");
            side1 = input.nextInt();

           System.out.print("Nhập cạnh thứ hai của tam giác: ");
            side2 = input.nextInt();

           System.out.print("Nhập cạnh thứ ba của tam giác: ");
            side3 = input.nextInt();
       } catch (InputMismatchException e){
           System.out.println("phai nhap so");
       }

        try {
            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println(triangle.toString());
        } catch (InputMismatchException e){
            System.out.println("ko dc nhap chu");
        } catch (IllegalTriangleException e) {
            System.out.println("ko phải là tam giác :");
        }finally {
            System.out.println("chuong trinh ket thuc");
        }
    }

}
