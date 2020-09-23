package _11_danh_sach_stack_queue.bai_tap.optional;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDauNgoacTrongBieuThucSuDungStack {
    public static void main(String[] args) {
        // tạo Stack rỗng
        Stack<Character> bStack=new Stack<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập biểu thức cần kiểm tra: ");
        String string = scanner.nextLine();

        char temp;
        // duyệt chuỗi add ký hiệu vào Stack
        for (int i=0; i<string.length();i++){
            temp = string.charAt(i);

            // nếu ngoặc trái thì đưa stack
            if ( temp =='(' || temp =='[' || temp =='{'){
                bStack.push(temp);
            }
            // nếu là dấu ngoặc phải
            if (temp==')'){
                if(bStack.empty()){      // kiêm tra nếu stack trống thì add vào stack
                    bStack.push(temp);
                    break;
                }else bStack.pop();     // không trống thì remove
            }
            if (temp == ']') {
                if (bStack.empty()) {
                    bStack.push(temp);
                    break;
                } else bStack.pop();
            }
            if (temp == '}') {
                if (bStack.empty()) {
                    bStack.push(temp);
                    break;
                } else bStack.pop();
            }

        }

        //kiểm tra nếu stack trống thì biểu thức hợp lê ( từng cặp dấu bị remove khi kiểm tra
        boolean check =bStack.empty();
        if (check) {
            System.out.println("Biểu thức " + string + " hợp lệ");
        } else System.out.println("Biểu thức " + string + " không hợp lệ");

    }
}
