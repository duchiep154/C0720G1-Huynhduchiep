package _quan_ly_danh_SV.common;




import java.util.Scanner;

public class KiemTra {
    static Scanner input = new Scanner(System.in);

    public static boolean kiemTraSoNguyen(String chon) {
        return chon.matches("^\\d+");
    }
    public static String kiemTraSoDT() {
        String soDT;
        do {
            System.out.print("Nhập Số Điện Thoại: ");
            soDT = input.nextLine();
            if (soDT.matches("^0\\d{9}$")) break;
            else
                System.out.println("========================================\nSố điện phải có 10 số và bắt đầu bằng số 0\n========================================");
        } while (true);
        return soDT;
    }
    public static String kiemTraEmail() {
        String email;
        do {
            try {
                System.out.print("Nhập Địa Chỉ Email: ");
                email = input.nextLine();
                if (email.matches("^\\w+@([a-z]{3,6})+[.]([a-z]{2,3})$")) break;
                else throw new EmailExeception();
            } catch (EmailExeception e) {
                System.out.println("========================================\nEmail phải đúng định dạng, ví dụ: abc123@gmail.com\n========================================");
            }
        } while (true);
        return email;
    }
    public static String kiemTraHoTen() {
        String hoTen;
        do {
            System.out.print("Nhập Họ và Tên sinh viên: ");
            hoTen = input.nextLine();
            //^[A-Z]([a-z]*)([\s][A-Z]([a-z]*))+$ : Họ Tên Không Dấu
            if (hoTen.matches("^\\p{Lu}((\\p{Ll})*)(\\s\\p{Lu}(\\p{Ll})*)*$")){
                break;
            }else {
                System.out.println("========================================\nTên Khách hàng phải in hoa ký tự đầu tiên trong mỗi từ\n========================================");

            }
        } while (true);
        return hoTen;
    }
    public static String kiemTraMaSo() {
        String maSo;
        do{
            System.out.println("nhập mã số sinh viên :");
            maSo=input.nextLine();
            if (maSo.matches("^SV[-]\\d{4}$")){
                break;
            }else {
                System.out.println("mã số sinh viên phải có 4 số vi dụ SV-0001");

            }
        }while (true);
        return maSo;
    }
    public static String kiemTraNgaySinh() {
        String ngaySinh;
        do {
            System.out.print("Nhập ngày tháng năm sinh: ");
            ngaySinh = input.nextLine();
            if (ngaySinh.matches("^((0[1-9])|([1-2][0-9])|(3[0-1]))[/]((0[1-9])|(1[0-2]))[/]((19[0-9]{2})|(200[0-2]))$")){
                break;
            } else {
                System.out.println("========================================\nNgày sinh không hợp lệ.\nNăm sinh phải > 1900 và nhỏ hơn năm hiện tại 18 năm\nĐúng định dạng dd/mm/yyyy\n========================================");
            }
        } while (true);
        return ngaySinh;
    }

}
