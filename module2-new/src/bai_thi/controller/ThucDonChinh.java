package bai_thi.controller;


import bai_thi.models.LopHoc;
import bai_thi.models.SinhVien;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThucDonChinh {
    public static List<SinhVien> sinhVienList = new ArrayList<bai_thi.models.SinhVien>();
    public static List<String> listLine = new ArrayList<>();
    public static List<LopHoc> lopHocList = new ArrayList<bai_thi.models.LopHoc>();
    public static final String COMA = ",";
    public static final String FILE_SINHVIEN = "T:\\C0720G1-Huynh_duc_hiep\\module2-new\\src\\bai_thi\\data\\sinhvien.csv";
    public static final String FILE_BACTCHS = "T:\\C0720G1-Huynh_duc_hiep\\module2-new\\src\\bai_thi\\data\\bacths.csv";
    public static final String FILE_GIAOVIEN = "T:\\C0720G1-Huynh_duc_hiep\\module2-new\\src\\bai_thi\\data\\giaovien.csv";

    public static void thucDon() {
        String luaChon;
        do {
            System.out.println("1. Them moi sinh vien.");
            System.out.println("2. Xoa sinh vien.");
            System.out.println("3. Xem danh sach sinh vien.");
            System.out.println("4. Xem thong tin giao vien.");
            System.out.println("5. Tim kiem sinh vien.");
            System.out.println("6. Thoat.");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap lua chon cua ban: ");
            luaChon = scanner.nextLine();

            switch (luaChon) {
                case "1":
                    ThemSinhVien.themMoiSinhVien();
                    break;
                case "2":
                    XoaSinhVien.xoaSinhVien();
                    break;
                case "3":
                    HienThiDanhSachSinhVien.hienThi();
                    break;
                case "4":
                    DocFile.docFileGiaoVien();
                    break;
                case "5":
                    TimKiem.timKiem();
                    break;
                case "6":
                    return;
                default:
                    thucDon();
            }
        } while (Integer.parseInt(luaChon) > 0 && Integer.parseInt(luaChon) < 7);
    }

    public static void main(String[] args) {
        thucDon();
    }
}
