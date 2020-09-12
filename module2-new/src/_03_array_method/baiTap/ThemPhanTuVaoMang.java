package _03_array_method.baiTap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        // Tạo mảng array có sẵn giá trị và hiển thị array
        int[] arrayBanDau = {50, 5, 35, 75, 45, 75, 65, 95, 85, 15};
        System.out.print("Mảng đã cho: ");
        for (int i = 0; i < arrayBanDau.length; i++) {
            System.out.print(arrayBanDau[i] + " ");
        }

        // Nhập số cần tìm
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Nhập số cần chèn vào mảng : ");
        int soCanChen = scanner.nextInt();

        // Nhập vị trí muốn chèn (chỉ số)
        System.out.print("Nhập vị trí cần chèn vào mảng : ");
        int viTriCanChen = scanner.nextInt();

        //Duyệt mảng và hiển thị mảng sau khi đã chèn
        if (viTriCanChen < 0 || viTriCanChen > arrayBanDau.length - 1) {
            System.out.print("Vị trí cần chèn không hợp lệ !");
        } else {
            int length = arrayBanDau.length;
            int[] mangSauKhiChen = new int[length + 1];
            System.arraycopy(arrayBanDau,0,mangSauKhiChen,0,viTriCanChen);
            mangSauKhiChen[viTriCanChen] = soCanChen;
            System.arraycopy(arrayBanDau, viTriCanChen, mangSauKhiChen, viTriCanChen + 1, length - viTriCanChen);
            for (int element : mangSauKhiChen) {
                System.out.print(element + " ");

            }
        }

    }
}



