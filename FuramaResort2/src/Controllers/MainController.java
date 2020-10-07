package Controllers;

import Commons.DocGhiFileCSV;
import Models.House;
import Models.Villa;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class MainController {
    static Scanner input = new Scanner(System.in);


        // ham hien thi mainmenu

    public static void displayMainMenu() throws IOException {
        int chon = 0;
        do {
            System.out.println("-------------Menu-----------------\n" +
                    "1.Add New Services\n" +
                    "2.Show Services\n" +
                    "3.Add New Customer\n" +
                    "4.Show Information of Customer\n" +
                    "5.Add New Booking\n" +
                    "6.Show Information of Employee\n" +
                    "7.Exit\n" +
                    "-----------------------------------");
            System.out.print("Chọn: ");
            String chonMenu = input.nextLine();
            if (kiemTraSoNguyen(chonMenu)) {
                chon = Integer.parseInt(chonMenu);
                switch (chon) {
                    case 1:
                        addNewServices();
                        break;
                    case 2:
                        showServices();
                        break;
                    case 3:
                        addNewCustomer();
                        break;
                    case 4:
                        showInfoCustomer();
                        break;
                    case 5:
                        addNewBooking();
                        break;
                    case 6:
                        showInfoEmployee();
                        break;

                    case 7:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Sự lựa chọn không tồn tại. Bạn cần chọn lại");
                }
            } else System.out.println("Lựa chọn không tồn tại");
        } while (true);
    }

    private static void showInfoEmployee() {
    }

    private static void addNewBooking() {
    }


    private static void showInfoCustomer() {
    }

    private static void addNewCustomer() {
    }

    private static void showServices() {
    }
    // ham add new service
    private static void addNewServices() throws IOException {
        int chon = 0;
        do {
            System.out.println("-------------Menu-----------------\n" +
                    "1.Add New Villa\n" +
                    "2.Add New House\n" +
                    "3.Add New Room\n" +
                    "4.Back to Menu\n" +
                    "5.Exit\n" +
                    "-----------------------------------");
            System.out.print("Chọn: ");
            String chonMenu = input.nextLine();
            if (kiemTraSoNguyen(chonMenu)) {
                chon = Integer.parseInt(chonMenu);
                switch (chon) {
                    case 1:
                        addNewVilla();
                        break;
                    case 2:
                        addNewHouse();
                        break;
                    case 3:
                        addNewRoom();
                        break;
                    case 4:
                        displayMainMenu();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Sự lựa chọn không tồn tại. Bạn cần chọn lại");
                }
            } else System.out.println("Lựa chọn không tồn tại");
        } while (true);
    }



    private static void addNewRoom() {
    }

    private static void addNewHouse() throws IOException {
        String id = kiemTraID("HO");
        String tenDichVu = kiemTraTen("House");
        String dienTichSuDung = kiemTraDienTich("sử dụng");
        String giaThue = kiemTraChiPhiThue();
        String soLuongNguoiThue = kiemTraSoLuongNguoi();
        System.out.print("Nhập Kiểu thuê: ");
        String kieuThue = chuanHoaDL(input.nextLine());
        System.out.print("Nhập tiêu chuẩn Phòng: ");
        String tieuChuanPhong = chuanHoaDL(input.nextLine());
        System.out.print("Nhập mô tả tiện nghi khác: ");
        String moTaTienNghiKhac = input.nextLine();
        String soTang = kiemTraSoTang();
        System.out.println("bạn đã nhập thành công\n");
        House house = new House(id,tenDichVu,dienTichSuDung,giaThue,soLuongNguoiThue,kieuThue,tieuChuanPhong,moTaTienNghiKhac,soTang);
        DocGhiFileCSV.ghiFileHouse(house);
        List<House> houseList=DocGhiFileCSV.docFileHouse();
        for (House element : houseList){
            System.out.println(element);
        }

    }

    private static void addNewVilla() throws IOException {

        String id = kiemTraID("VL");
        String tenDichVu = kiemTraTen("Villa");
        String dienTichSuDung = kiemTraDienTich("sử dụng");
        String giaThue = kiemTraChiPhiThue();
        String soLuongNguoiThue = kiemTraSoLuongNguoi();
        System.out.print("Nhập Kiểu thuê: ");
        String kieuThue = chuanHoaDL(input.nextLine());
        System.out.print("Nhập tiêu chuẩn Phòng: ");
        String tieuChuanPhong = chuanHoaDL(input.nextLine());
        System.out.print("Nhập mô tả tiện nghi khác: ");
        String moTaTienNghiKhac = input.nextLine();
        String dienTichHoBoi = kiemTraDienTich(" hồ bơi");
        String soTang = kiemTraSoTang();
        System.out.print("Bạn đã nhập thành công\n");
        Villa villa = new Villa(id, tenDichVu, dienTichSuDung, giaThue, soLuongNguoiThue, kieuThue, tieuChuanPhong, moTaTienNghiKhac, dienTichHoBoi, soTang);


        DocGhiFileCSV.ghiFileVilla(villa);
        List<Villa> villaList = DocGhiFileCSV.docFileVilla();
        for (Villa element : villaList) {
            System.out.println(element);
        }
    }




    private static boolean kiemTraSoNguyen(String chonMenu) {
        return chonMenu.matches("^\\d+");
    }
    public static boolean kiemTraSoThuc(String soCanKiemTra) {
        return soCanKiemTra.matches("^\\d+([.]\\d+)?");
    }
    public static String kiemTraID(String tenDichVu) {
        final String ID_REGEX = "^SV" + tenDichVu + "[-]\\d{4}$";
        String id;
        do {
            System.out.print("Nhập ID: ");
            id = input.nextLine();
//            Pattern pattern = Pattern.compile(ID_REGEX);
//            Matcher matcher = pattern.matcher(id);
            if (id.matches(ID_REGEX)) break;
            else
                System.out.println("========================================\n" +
                        "Định dạng không hợp lệ\nNếu là Villa nhập: SVVL-YYYY\n" +
                        "Nếu là House nhập: SVHO-YYYY\nNếu là Room nhập: SVRO-YYYY\n" +
                        "Với YYYY: là số từ 0-9\n========================================");
        } while (true);
        return id;
    }
    public static String kiemTraTen(String tenDichVu) {
        String tenDV;
        do {
            System.out.print("Nhập tên dịch vụ: ");
            tenDV = input.nextLine();
            if (tenDichVu.equals("Villa")) {
                if (tenDV.matches("^(Villa)(\\s(\\w)+)+$")) break;
            }
            if (tenDichVu.equals("House")) {
                if (tenDV.matches("^(House)(\\s(\\w)+)+$")) break;
            }
            if (tenDichVu.equals("Room")) {
                if (tenDV.matches("^(Room)(\\s(\\w)+)+$")) break;
            } else
                System.out.println("========================================\nNhập sai tên dịch vụ\nVilla tên - House tên  - Room tên\nVí dụ: Villa Vip || House 1 || Room normal1\n========================================");
        } while (true);
        return tenDV;
    }
    public static String kiemTraDienTich(String loai) {
        String nhapDienTich;
        do {
            System.out.print("Nhập diện tích " + loai + " : ");
            nhapDienTich = input.nextLine();
            if (kiemTraSoThuc(nhapDienTich) && Float.parseFloat(nhapDienTich) > 30) break;
            else
                System.out.println("========================================\n" +
                        "Diện tích " + loai + " phải lớn hơn 30m2" +
                        "\n========================================");
        } while (true);
        return nhapDienTich;
    }
    public static String kiemTraChiPhiThue() {
        String chiPhi;
        do {
            System.out.print("Nhập chi phí thuê: ");
            chiPhi = input.nextLine();
            if (kiemTraSoThuc(chiPhi) && Float.parseFloat(chiPhi) > 0) break;
            else
                System.out.println("========================================\n" +
                        "Chi Phí Thuê Phải Là Số Dương\n========================================");
        } while (true);
        return chiPhi;
    }
    public static String kiemTraSoLuongNguoi() {
        String soNguoi;
        do {
            System.out.print("Nhập số lượng người tối đa: ");
            soNguoi = input.nextLine();
            if (kiemTraSoNguyen(soNguoi) && Integer.parseInt(soNguoi) > 0 && Integer.parseInt(soNguoi) < 20) break;
            else
                System.out.println("========================================\nSố lượng người phải lớn hơn 0 và nhỏ hơn 20\n========================================");
        } while (true);
        return soNguoi;
    }
    public static String chuanHoaDL(String duLieu) {
        duLieu = duLieu.toLowerCase();
        duLieu = duLieu.substring(0, 1).toUpperCase() + duLieu.substring(1);
        return duLieu;
    }
    public static String kiemTraSoTang() {
        String soTang;
        do {
            System.out.print("Nhập số tầng: ");
            soTang = input.nextLine();
            if (kiemTraSoNguyen(soTang) && Integer.parseInt(soTang) > 0) break;
            else
                System.out.println("========================================\n" +
                        "Số tầng phải là số nguyên dương\n" +
                        " ========================================");
        } while (true);
        return soTang;
    }
    public static String dichVuDiKem() {
        final String DV_DI_KEM_REGEX = "^(massage|karaoke|food|drink|car)([,](massage|karaoke|food|drink|car)){0,4}$";
        String dichVu;
        do {
            System.out.print("Dịch vụ đi kèm: ");
            dichVu = input.nextLine();
            if (dichVu.matches(DV_DI_KEM_REGEX)) break;
            else
                System.out.println("========================================\nChọn 1 trong các loại dịch vụ đi kèm sau: massage, karaoke, food, drink, car\n========================================");
        } while (true);
        return dichVu;
    }

}
