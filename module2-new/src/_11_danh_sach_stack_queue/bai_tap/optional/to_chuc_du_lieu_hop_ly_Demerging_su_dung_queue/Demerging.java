package _11_danh_sach_stack_queue.bai_tap.optional.to_chuc_du_lieu_hop_ly_Demerging_su_dung_queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Demerging {
    public static void main(String[] args) {
        Queue<NhanVien> nu = new LinkedList<>();
        Queue<NhanVien> nam = new LinkedList<>();
        List<NhanVien> nhanVienList = new ArrayList<>();
        System.out.println("- Danh sách nhân viên: ");

        nhanVienList.add(new NhanVien("huỳnh thị minh dung","Nữ","22/11/1995"));
        nhanVienList.add(new NhanVien("Trần Thị Thu Phương","Nữ","01/01/1995"));
        nhanVienList.add(new NhanVien("nguyễn thị bé út","Nữ","16/04/1992"));
        nhanVienList.add(new NhanVien("Huỳnh Đức Phát","Nam","26/02/2018"));
        nhanVienList.add(new NhanVien("Nguyễn Văn Anh","Nam","05/09/1994"));
        nhanVienList.add(new NhanVien("Huỳnh Đức Hiệp","Nam","15/04/1990"));
        System.out.println(nhanVienList);

        for (NhanVien element : nhanVienList){
            if (element.getGioiTinh().equals("Nữ")){
                nu.add(element);
            }else {
                nam.add(element);
            }
            System.out.println("\n- Danh sách nhân viên Nữ");
            System.out.println(nu);
            System.out.println("\n- Danh sách nhân viên Nam");
            System.out.println(nam);
        }
        System.out.println("danh sách nhân viên sau khi sắp xếp :");
        nu.addAll(nam);
        System.out.println(nu);
    }
}
