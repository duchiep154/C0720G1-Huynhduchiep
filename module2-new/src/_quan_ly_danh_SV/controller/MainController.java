package _quan_ly_danh_SV.controller;

import _quan_ly_danh_SV.common.DocGhiFile;
import _quan_ly_danh_SV.common.KiemTra;
import _quan_ly_danh_SV.common.SapXeptheoten;
import _quan_ly_danh_SV.models.Student;
import _quan_ly_danh_SV.common.NotFoundDirectoryException;


import java.util.List;
import java.util.Scanner;

public class MainController {
    static Scanner input=new Scanner(System.in);
    public static List<Student> danhSach= DocGhiFile.docFile();

    public static void hienThiMenu() {
        int chon = 0;
        do {
            System.out.println("----------CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN--------------\n" +
                    "Chọn chức năng theo số (để tiếp tục)\n" +
                    "1.Xem Danh Sách\n" +
                    "2.Thêm Mới\n" +
                    "3.Cập Nhật" +
                    "\n4.Xóa\n" +
                    "5.Tìm Kiếm\n" +
                    "6.Đọc Từ File\n" +
                    "7.Ghi vào File\n" +
                    "8.Sắp Xếp \n" +
                    "9.Thoát \n" +
                    "----------------------------------------------------");
            System.out.print("Chọn chức năng: ");
            String chonMenu = input.nextLine();
            if (KiemTra.kiemTraSoNguyen(chonMenu)) {
                chon = Integer.parseInt(chonMenu);
                switch (chon) {
                    case 1:
                        xemDanhSach();
                        break;
                    case 2:
                        themMoi();
                        break;
                    case 3:
                        capNhat(danhSach);
                        break;
                    case 4:
                        xoa();
                        break;
                    case 5:
                        timKiem();
                        break;
                    case 6:
                        docTuFile();
                        break;
                    case 7:
                        ghiVaoFile(danhSach);
                        break;
                    case 8:
                        sapXepDS();
                        break;
                    case 9:
                        System.exit(0);
                        break;    
                    default:
                        System.out.println("Sự lựa chọn không tồn tại. Bạn cần chọn lại");
                }
            } else System.out.println("Lựa chọn không hợp lệ");
        } while (true);
    }

    private static List<Student> sapXepDS() {
        if (!danhSach.isEmpty()) {
            SapXeptheoten sapXep = new SapXeptheoten();
            danhSach.sort(sapXep);
            int bienDem = 1;
            for (Student element : danhSach) {
                System.out.println(bienDem + ". " + element.getInfor());
                bienDem++;
            }
        } else {
            System.out.println("Hiện chưa có thông tin nào");
        }
        return danhSach;
    }

    private static void ghiVaoFile(List<Student> danhSach) {
        System.out.println("Bạn đã cập nhật thông tin thành công bạn có muốn lưu vào file không ?\n" +
                "====================================================\n" +
                "Nhập Y để lưu\n" +
                "Nếu không thì nhập N\n" +
                "====================================================");
        if (input.nextLine().equals("Y")){
            DocGhiFile.ghiFile(danhSach);
            System.out.println("lưu thành công");
            xemDanhSach();
        }else {
            System.out.println("hủy lưu ");
            docTuFile();
            return;
        }

    }

    public static void capNhat(List<Student> danhSach) {
        System.out.print("nhập mã sô  sinh viên bạn muốn cập nhật : ");
        String maSo = input.nextLine();
        capNhatDanhSach(danhSach, maSo);
    }

    private static void capNhatDanhSach(List<Student> danhSach, String maSo ) {
        int chon = 0;
        if (maSo.equals("")) {
            hienThiMenu();
        } else {
            boolean check = false;
            for (Student element : danhSach) {
                if (maSo.equals(element.getMaSo())) {
                    System.out.println(element.toString());
                    String chonMenu;
                    do {
                        System.out.print("--------------THÔNG TIN CẦN CẬP NHẬT----------------------\n" +
                                "1.Cập Nhật mã số sinh viên\n" +
                                "2.Cập Nhật Họ Tên\n" +
                                "3.Cập Nhật ngày sinh\n" +
                                "4.Cập Nhật điện thoại\n" +
                                "5.Cập Nhật email\n" +
                                "6.Cập Nhật điểm trung bình\n" +
                                "7.Thoát Cập Nhật và Quay về Menu\n" +
                                "------------------------------------------------------\n" +
                                "Chọn thông tin cần cập nhật : ");
                        chonMenu = input.nextLine();
                        if (quan_ly.commons.KiemTra.kiemTraSoNguyen(chonMenu)) {
                            chon = Integer.parseInt(chonMenu);
                            switch (chon) {
                                case 1:
                                    System.out.print("Nhập Nhóm Danh Bạ : ");
                                    String maSoSV = input.nextLine();
                                    element.setMaSo(maSoSV);
                                    break;
                                case 2:
                                    System.out.print("Nhập Họ Tên: ");
                                    String hoTen = input.nextLine();
                                    element.setHoTen(hoTen);
                                    break;
                                case 3:
                                    System.out.print("Nhập ngày sinh : ");
                                    String ngaySinh = input.nextLine();
                                    element.setNgaySinh(ngaySinh);
                                    break;
                                case 4:
                                    System.out.print("Nhập điện thoại : ");
                                    String dienThoai = input.nextLine();
                                    element.setDienThoai(dienThoai);
                                    break;
                                case 5:
                                    System.out.print("Nhập email : ");
                                    String email = input.nextLine();
                                    element.setEmail(email);
                                    break;
                                case 6:
                                    System.out.print("nhập điểm trung bình: ");
                                    String diemTB = input.nextLine();

                                    element.setDiemTB(diemTB);
                                    break;
                                case 7:
                                    hienThiMenu();
                                    break;
                                default:
                                    System.out.println("Lựa chọn không tồn tại. Bạn cần chọn lại");
                            }
                        } else System.out.println("Lựa chọn không hợp lệ");
                        check = true;
                        break;
                    } while (true);
                }
            }
            if (!check) {
                System.out.println("Không tìm được sinh viên với số mã số trên. Vui lòng nhập lại ");
                capNhat(danhSach);
            } else {
                ghiVaoFile(danhSach);


            }
        }
    }

    private static void docTuFile() {
        List<Student> danhSach2=DocGhiFile.docFile();
        if (danhSach2.isEmpty()) System.out.println("Chưa có thông tin Sinh Viên nào");
        else {
            System.out.println("Danh sách quản lý sinh viên :");
            int bienDem = 0;
            for (Student element : danhSach2) {

                System.out.println((bienDem + 1) + ". " + element.toString());
                bienDem++;
            }
        }

    }

    private static void timKiem() {
        if (danhSach.isEmpty()) {
            System.out.println("Chưa có thông tin Sinh viên nào");
        }
        else {
            System.out.print("Nhập mã số sinh viên  hoặc họ tên bạn muốn tìm kiếm: ");
            String timKiem = input.nextLine();
            boolean kiemTra = true;
            int bienDem = 1;
            for (Student element : danhSach) {
                if (element.getMaSo().contains(timKiem) || element.getHoTen().contains(timKiem)) {
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

    private static void xoa() {
        if (danhSach.isEmpty()){
            System.out.println("Hiện tại chưa có thông tin nào");
        }
        else {
            do {
                try {
                    Student student = null;
                    System.out.print("Nhập mã số sinh viên bạn cần xóa: ");
                    String nhap = input.nextLine();
                    for (int i = 0; i < danhSach.size(); i++) {
                        if (nhap.equals(danhSach.get(i).getMaSo())) {
                            student = danhSach.get(i);
                            break;
                        }
                    }
                    if (student != null) {
                        do {
                            System.out.println("Bạn có thật sự muốn xóa sinh vien này không?\n" +
                                    "====================================================\n" +
                                    "Nhập Y để xóa\n" +
                                    "Nếu không thì nhập N\n" +
                                    "====================================================");
                            String chon = input.nextLine();
                            if (chon.equals("Y")|chon.equals("y")) {
                                danhSach.remove(student);
                                DocGhiFile.ghiFile(danhSach);
                                xemDanhSach();
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

    private static void themMoi() {
        String maSo=KiemTra.kiemTraMaSo();
        String hoTen=KiemTra.kiemTraHoTen();
        String ngaySinh=KiemTra.kiemTraNgaySinh();
        String soDt=KiemTra.kiemTraSoDT();
        String email=KiemTra.kiemTraEmail();
        System.out.println("nhập điểm trung bình");
        String diemTB=input.nextLine();
        System.out.println("bạn đã thêm thành công");
        Student student=new Student(maSo,hoTen,ngaySinh,soDt,email,diemTB);
        danhSach.add(student);
        DocGhiFile.ghiFile(danhSach);
        xemDanhSach();
    }

    private static void xemDanhSach() {
        if (danhSach.isEmpty()) System.out.println("Chưa có thông tin Sinh Viên nào");
        else {
            System.out.println("Danh sách quản lý sinh viên :");
            int bienDem = 0;
            for (Student element : danhSach) {

                System.out.println((bienDem + 1) + ". " + element.toString());
                bienDem++;
            }
        }
    }

    public static void main(String[] args) {
        hienThiMenu();
    }

}
