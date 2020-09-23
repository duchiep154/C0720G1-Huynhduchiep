package _11_danh_sach_stack_queue.bai_tap.optional;

import java.math.BigInteger;
import java.util.Scanner;

public class ChuyenHeThapPhanSangHeKhac {
    //Chuyển đổi từ hệ thập phân sang hệ nhị phân _ decimal: thập phân _ binary: nhị phân
    // sử dụng integer.tobinarystring()
    public static void doiThapPhanSangNhiPhan() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số cần chuyển đổi : ");
        int soThapPhan = input.nextInt();

        System.out.print("Hệ nhị phân của " + soThapPhan + " là: ");
        System.out.print(Integer.toBinaryString(soThapPhan));
    }

    //Chuyển đổi từ hệ nhị phân sang hệ thập phân
    public static void doiNhiPhanSangThapPhan() {

        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số cần chuyển đổi : ");
        String soNhiPhan = input.nextLine();

        System.out.print("Hệ nhị phân của " + soNhiPhan + " là: ");
        System.out.print(Integer.parseInt(soNhiPhan,2));
    }

    // Chuyển đổi từ hệ thập phân sang hệ 16 _ Hexadecimal: hệ 16
    public static void doiThapPhanSangHe16(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số cần chuyển đổi: ");
        int soThapPhan = input.nextInt();

        System.out.print("Hệ 16 của " + soThapPhan + " là: ");
        System.out.print(Integer.toHexString(soThapPhan));
    }
    // Chuyển đổi từ hệ 16 sang hệ thập phân
    public static void doi16SangThapPhan() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số cần chuyển đổi : ");
        String soHe16Phan = input.nextLine();

        System.out.print("Hệ thập phân của " + soHe16Phan + " là: ");
        System.out.print(Integer.parseInt(soHe16Phan,16));
    }

    // Chuyển đổi từ hệ nhị phân sang hệ 16
    public static void doiNhiPhanSangHe16() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số cần chuyển đổi : ");
        String soNhiPhan = input.nextLine();

        System.out.print("Hệ 16 của " + soNhiPhan + " là: ");
        System.out.print(new BigInteger(soNhiPhan,16).toString(2));
    }

    // Chuyển đổi từ hệ 16 sang hệ nhị phân
    public static void doiHe16SangHeNhiPhan() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số cần chuyển đổi : ");
        String soHe16Phan = input.nextLine();

        System.out.print("Hệ nhị phân của " + soHe16Phan + " là: ");
        System.out.print(new BigInteger(soHe16Phan,2).toString(16));
    }


    public static void main(String[] args) {
        System.out.println("1. Chuyển đổi từ hệ thập phân sang hệ nhị phân (155 -> 10011011)");
        doiThapPhanSangNhiPhan();
        System.out.println();

        System.out.println("\n2. Chuyển đổi từ nhị thập phân sang hệ thập phân ( 10011 --> 19)");
        doiNhiPhanSangThapPhan();
        System.out.println();

        System.out.println("\n3. Chuyển đổi từ thập thập phân sang hệ 16 (254 --> FE)");
        doiThapPhanSangHe16();
        System.out.println();

        System.out.println("\n4. Chuyển đổi từ 16 phân sang hệ thập phân (6F --> 111)");
        doi16SangThapPhan();
        System.out.println();

        System.out.println("\n5. Chuyển đổi từ 16 phân sang hệ nhị phân (EE --> 11101110)");
        doiNhiPhanSangHe16();
        System.out.println();

        System.out.println("\n6. Chuyển đổi từ nhị phân phân sang hệ 16 (11101110 --> EE)");
        doiHe16SangHeNhiPhan();
        System.out.println();
    }
}
