package _03_array_method.baiTap;

import java.util.Scanner;

public class TinhTongCacSo1CotCoDinh {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 7},
                {4, 5, 6, 8, 9, 10},
                {7, 8, 9}};
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập cột muốn tính tổng: ");
        int number = input.nextInt();

        int sum = 0;
        for (int row = 0; row < array[number].length; row++) {
            sum += array[number][row];
        }
        System.out.println("Cột " + number);
        System.out.println(sum);
    }
}
