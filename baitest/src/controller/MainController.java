package controller;

import common.FileUntil;
import models.GiaoVien;
import models.LopHoc;
import models.SinhVien;
import validate.*;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class MainController {

    public static List<LopHoc> danhSachLopHoc =FileUntil.docFileLopHoc();
    public static List<SinhVien> danhSachSV = FileUntil.docFileSV();

    static Scanner input=new Scanner(System.in);
    public static void hienThiMenu() throws TenException, NgaySinhException, SoDienThoaiException {
        int chon = 0;
        do {
            System.out.println("----------CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN--------------\n" +
                    "Chọn chức năng theo số (để tiếp tục)\n" +
                    "1.thêm mới sinh viên\n" +
                    "2.xóa sinh viên\n" +
                    "3.hiển thị danh sách sinh viên" +
                    "\n4.dọc file giáo viên\n" +
                    "5.Tìm Kiếm\n" +
                    "6.Thoát\n" +
                    "----------------------------------------------------");
            System.out.print("Chọn chức năng: ");
            String chonMenu = input.nextLine();
            if (KiemTra.kiemTraSoNguyen(chonMenu)) {
                chon = Integer.parseInt(chonMenu);
                switch (chon) {
                    case 1:
                        themMoiSinhVien();
                        break;
                    case 2:
                        xoaSinhVien();
                        break;
                    case 3:
                        hienThiDanhSachSV();
                        break;
                    case 4:
                        hienThiDanhSachGV();
                        break;
                    case 5:
                        timKiem();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("sự lựa chọn không tồn tại");
                        hienThiMenu();
                }
            } else System.out.println("Lựa chọn không hợp lệ");
        } while (true);
    }

    private static void timKiem() {
        //List<SinhVien> danhSachSV = FileUntil.docFileSV();
        if (danhSachSV.isEmpty()) {
            System.out.println("Chưa có thông tin Sinh viên nào");
        }
        else {
            System.out.print("Nhập mã số sinh viên  hoặc họ tên bạn muốn tìm kiếm: ");
            String timKiem = input.nextLine();
            boolean kiemTra = true;
            int bienDem = 1;
            for (SinhVien element : danhSachSV) {
                if ( element.getHoVaTen().contains(timKiem)|element.getId()==Integer.parseInt(timKiem)) {
                    kiemTra = false;
                    System.out.println(bienDem + ". " + element);
                    bienDem++;
                }

            }
            if (kiemTra) {
                System.out.println("Không có sinh viên nào khớp với thông tin bạn nhập");
            }
        }
    }

    private static void hienThiDanhSachSV() {
        //List<SinhVien> danhSachSV = FileUntil.docFileSV();
        List<SinhVien> danhSachSV=FileUntil.docFileSV();
        if (danhSachSV.isEmpty()) System.out.println("Chưa có thông tin giao vien nào");
        else {
            System.out.println("Danh sách giao vien :");
            int bienDem = 0;
            for (SinhVien element : danhSachSV) {

                System.out.println((bienDem + 1) + ". " + element.toString());
                bienDem++;
            }
        }

    }

    private static void xoaSinhVien() {
        //List<SinhVien> danhSachSV = FileUntil.docFileSV();
        if (danhSachSV.isEmpty()){
            System.out.println("Hiện tại chưa có thông tin nào");
        }
        else {
            do {
                try {
                    SinhVien sinhVien = null;
                    System.out.print("Nhập mã số sinh viên bạn cần xóa: ");
                    String nhap = input.nextLine();
                    for (int i = 0; i < danhSachSV.size(); i++) {
                        if (Integer.parseInt(nhap)  == (danhSachSV.get(i).getId())) {
                            sinhVien = danhSachSV.get(i);
                            break;
                        }
                    }
                    if (sinhVien != null) {
                        do {
                            System.out.println("Bạn có thật sự muốn xóa sinh vien này không?\n" +
                                    "====================================================\n" +
                                    "Nhập Y để xóa\n" +
                                    "Nếu không thì nhập N\n" +
                                    "====================================================");
                            String chon = input.nextLine();
                            if (chon.equals("Y")|chon.equals("y")) {
                                danhSachSV.remove(sinhVien);
                                FileUntil.ghiFile(danhSachSV);
                                hienThiDanhSachSV();
                                System.out.println("đã xóa thành công ");
                                return;
                            }
                            if (chon.equals("N")|chon.equals("n")){
                                return;
                            }
                        } while (true);
                    } else throw new NotFoundDirectoryException();
                } catch (NotFoundDirectoryException e) {
                    e.thongBao();
                    System.out.println("====================================================\n" +
                            "Bạn có muốn quay về Menu chính không?\n" +
                            "Nhấn Enter để quay về\n" +
                            "Nhập N để xóa tiếp\n" +
                            "====================================================");
                    if (input.nextLine().equals("")) return;
                }
            } while (true);
        }
    }

    private static void themMoiSinhVien() throws TenException, NgaySinhException, SoDienThoaiException {
        //List<SinhVien> danhSachSV = FileUntil.docFileSV();
        boolean flag;
       // int idSinhVien =(danhSachSV.size() > 0) ? (danhSachSV.size() + 1) : 1;
        int idSinhVien = 0;
        idSinhVien = (danhSachSV.size() == 0) ? 1 : idSinhVien + (danhSachSV.get(danhSachSV.size() - 1).getId() + 1);
        System.out.println("Sinhvien id = " + idSinhVien);

        String hoTen=KiemTra.kiemTraHoTen();
        String ngaySinh=KiemTra.kiemTraNgaySinh();
        System.out.println("nhap gioi tinh");
        String gioiTinh=input.nextLine();
        String soDT;
        do {
             soDT=KiemTra.kiemTraSoDT();
            flag = true;
            for (SinhVien sinhVien : danhSachSV) {
                if (sinhVien.getSoDienThoai().equals(soDT)) {
                    System.out.println("So dien thoai da ton tai !!!");
                    flag = false;
                    break;
                }
            }

        }while (!flag);

        int idLopHoc;

        do {
            flag = false;
            System.out.print("Nhap ma lop hoc: ");
            idLopHoc = input.nextInt();
            for (LopHoc lopHoc : danhSachLopHoc) {
                if (lopHoc.getIdLopHoc() == idLopHoc) {
                    flag = true;
                    break;
                }
            }
            System.out.println("Ma lop hoc khong ton tai");
        } while (!flag);
        // tao sv moi
        SinhVien sinhVien=new SinhVien(idSinhVien,hoTen,ngaySinh,gioiTinh,soDT,idLopHoc);
        // add sv vao danh sach
        danhSachSV.add(sinhVien);
        FileUntil.ghiFile(danhSachSV);
        hienThiDanhSachSV();



    }

    private static void hienThiDanhSachGV() {
        List<GiaoVien> danhSachGV=FileUntil.docFileGV();
        if (danhSachGV.isEmpty()) System.out.println("Chưa có thông tin giao vien nào");
        else {
            System.out.println("Danh sách giao vien :");
            int bienDem = 0;
            for (GiaoVien element : danhSachGV) {

                System.out.println((bienDem + 1) + ". " + element.toString());
                bienDem++;
            }
        }

    }

    public static void main(String[] args) throws TenException, NgaySinhException, SoDienThoaiException {
        hienThiMenu();
    }


}
