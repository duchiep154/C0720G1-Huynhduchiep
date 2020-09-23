package _11_danh_sach_stack_queue.bai_tap.optional;

import java.util.Scanner;
import java.util.Stack;

public class ChuyenDoiHeThapPhanSangNhiPhanBangStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.print("Nhập hệ số thập phân cần chuyển đổi: ");
        Scanner input = new Scanner(System.in);
        int soThapPhan = input.nextInt();
        int temp = soThapPhan;
        int count = 0;
        int result;
        // lặp chia lấy dư đẩy vào stack
        while (temp != 0) {
            result = temp % 2;
            stack.push(result);
            count++;
            temp = temp / 2;
        }
        System.out.println(stack);
        System.out.print("Hệ nhị phân của " + soThapPhan + " là: ");
        while (count != 0) {
            System.out.print(stack.pop());
            count--;
        }

    }
}
