package _11_danh_sach_stack_queue.bai_tap;

import java.util.Stack;

public class DaoNguocPhanTuTrongMangSoNguyenSuDungStack {
    // Đảo ngược mảng số nguyên
    private static void stackOfIntegers() {
        Stack<Integer> stack = new Stack<>();
        int[] arrayInterger = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Mảng số nguyên đã cho sẵn: ");
        for (int element : arrayInterger) {
            System.out.print(stack.push(element) + " ");
        }
        System.out.println();

        System.out.println("mảng số nguyên sau khi đã đảo ngươc");
        for (int element : arrayInterger){
            System.out.println(stack.pop() + " ");
        }
        System.out.println();
    }

    // đảo ngược chuỗi sử dụng stack
    private static void stackOfString() {
       Stack<String> wStack= new Stack<>();
       String string="có những lúc muốn bỏ rơi tất cả ";
        System.out.println("chuỗi ban đầu ");
        for (String mWord : string.split("\\s")) {
            System.out.print(wStack.push(mWord) + " ");
        }
        System.out.println();
        System.out.println("Chuỗi sau khi bị đảo ngược:");
        for (String mWord : string.split("\\s")){
            System.out.println(wStack.pop());
        }
    }



    public static void main(String[] args) {
        System.out.println("1. Đảo ngược mảng số nguyên");
        stackOfIntegers();

        System.out.println("2.đảo ngược chuỗi cho sẵn");
        stackOfString();
    }
}


