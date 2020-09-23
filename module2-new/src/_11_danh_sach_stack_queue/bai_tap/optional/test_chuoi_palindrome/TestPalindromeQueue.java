package _11_danh_sach_stack_queue.bai_tap.optional.test_chuoi_palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TestPalindromeQueue {
    public static void main(String[] args) {

        // nhập chuỗi cần kiểm tra
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String string = input.nextLine();

         //tạo queue
        Queue<Character> queue=new LinkedList<>();

        //add ký tự vào queue

        for (int i = (string.length() - 1); i >= 0; i--) {
            char character = string.charAt(i);
            queue.add(character);
        }
        System.out.println(queue);

        // lớp StringBuffer(String str): Tạo ra một bộ đệm chuỗi với chuỗi cụ thể .có thể thay đổi để  làm bộ đệm  kiểm tra
        // tạo String mới
        // Phương thức reverse() của lớp StringBuffer trong java đảo ngược chuỗi hiện tại

        StringBuffer newString = new StringBuffer(string).reverse();
        String reverseString = newString.toString();


        //Phương thức equalsIgnoreCase() so sánh hai chuỗi đưa ra dựa trên nội dung của chuỗi không phân biệt chữ hoa và chữ thường.
        // Nếu hai chuỗi khác nhau nó trả về false. Nếu hai chuỗi bằng nhau nó trả về true

        if(string.equalsIgnoreCase(reverseString)){
            System.out.println("Là chuỗi Palindrome");
        } else {
            System.out.println("Không phải là chuỗi Palindrome");
        }
    }
}
