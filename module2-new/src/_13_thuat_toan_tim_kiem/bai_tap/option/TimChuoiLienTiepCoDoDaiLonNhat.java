package _13_thuat_toan_tim_kiem.bai_tap.option;

import java.util.LinkedList;
import java.util.Scanner;

public class TimChuoiLienTiepCoDoDaiLonNhat {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // tạo danh sách lưu chuỗi tìm đc
        LinkedList<Character> listChuoiThuTuDaiNhat = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();

        // nhập chuỗi
        System.out.print("mời nhập chuỗi bất kỳ ");
        String chuoi = input.nextLine();

        // Tìm chuỗi con có thứ tự tăng dần liên tiếp lớn nhất
        for (int i = 0; i < chuoi.length(); i++) {        // single loop
            if (list.size() > 1 && chuoi.charAt(i) <= list.getLast() &&
                    list.contains(chuoi.charAt(i))) {
                list.clear(); // xóa tất cà phần tử trong list
            }

            list.add(chuoi.charAt(i)); // thêm phần tử vào list

            if (list.size() > listChuoiThuTuDaiNhat.size()) {// thêm phần tử vào danh sách thứ tụ  dài nhât
                listChuoiThuTuDaiNhat.clear();
                listChuoiThuTuDaiNhat.addAll(list);
            }
        }

        // hiển thị liên tiếp tối đa

        for (Character character : listChuoiThuTuDaiNhat) {
            System.out.print(character);
        }
        System.out.println();
    }
}
