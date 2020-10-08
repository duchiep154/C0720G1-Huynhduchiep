package controllers;

import commons.DocGhiFileCSV;
import libs.SapXepHoTenKhach;
import models.*;
import exception.*;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

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
                        showInforCustomer();
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

    private static void addNewBooking() throws IOException {
        List<Customer> customerList = DocGhiFileCSV.docFileCustomer();
        if (!customerList.isEmpty()) {
            int bienDem = 1;
            for (Customer element : customerList) {
                System.out.println(bienDem + ". Customer " + bienDem + " " + element.showInfor());
                bienDem++;
            }
            String nhap;
            do {
                System.out.print("Nhập số thứ tự Customer bạn muốn chọn: ");
                nhap = input.nextLine();
                if (kiemTraSoNguyen(nhap) && Integer.parseInt(nhap) > 0 && Integer.parseInt(nhap) <= customerList.size())
                    break;
                else System.out.println("Lựa chọn của bạn không hợp lệ");
            } while (true);
            Customer customer = customerList.get(Integer.parseInt(nhap) - 1);
            int chon = 0;
            do {
                System.out.println("-------------Menu-----------------\n" +
                        "1.Booking Villa\n" +
                        "2.Booking House\n" +
                        "3.Booking Room\n" +
                        "4.Back to menu\n" +
                        "5.Exit\n" +
                        "-----------------------------------");
                System.out.print("Chọn: ");
                String chonMenu = input.nextLine();
                if (kiemTraSoNguyen(chonMenu)) {
                    chon = Integer.parseInt(chonMenu);
                    switch (chon) {
                        case 1:
                            bookingVilla(customer);
                            displayMainMenu();
                            break;
                        case 2:
                            bookingHouse(customer);
                            displayMainMenu();
                            break;
                        case 3:
                            bookingRoom(customer);
                            displayMainMenu();
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
        } else System.out.println("Hiện chưa có thông tin nào");
    }

    private static void bookingRoom(Customer customer) {
    }

    private static void bookingHouse(Customer customer) {
    }

    private static void bookingVilla(Customer customer) {
    }


    private static List<Customer> showInforCustomer() throws IOException {
        List<Customer> customerList = DocGhiFileCSV.docFileCustomer();
        if (!customerList.isEmpty()) {
            SapXepHoTenKhach sapXep = new SapXepHoTenKhach();
            customerList.sort(sapXep);
            int bienDem = 1;
            for (Customer element : customerList) {
                System.out.println(bienDem + ". " + element.showInfor());
                bienDem++;
            }
        } else System.out.println("Hiện chưa có thông tin nào");
        return customerList;

    }

    private static void addNewCustomer() throws IOException {
        String hoTen=kiemTraName();
        String ngaySinh=kiemTraNgaySinh();
        String gioiTinh=kiemTraGioiTinh();
        String cmnd=kiemTraIDCard();
        String soDT=kiemTraPhone();
        String email=kiemTraEmail();
        String loaiKhach=kiemTraLoaiCustomer();
        System.out.println("nhập địa chỉ khách hàng :");
        String diaChi=chuanHoaDL(input.nextLine());
        Customer customer = new Customer(hoTen, ngaySinh, gioiTinh, cmnd, soDT, email, loaiKhach, diaChi);
        DocGhiFileCSV.ghiFileCustomer(customer);
        List<Customer> customerList = DocGhiFileCSV.docFileCustomer();
        for (Customer element : customerList) {
            System.out.println(element.showInfor());
        }
    }




    private static void showServices() throws IOException {
        int chon = 0;
        do {
            System.out.println("-------------Menu-----------------\n" +
                    "1.Show All Villa\n" +
                    "2.Show All House\n" +
                    "3.Show All Room\n" +
                    "4.Show All Name Villa Not Duplicate\n" +
                    "5.Show All Name House Not Duplicate\n" +
                    "6.Show All Name Room Not Duplicate\n" +
                    "7.Back to menu\n" +
                    "8.Exit\n" +
                    "-----------------------------------");
            System.out.print("Chọn: ");
            String chonMenu = input.nextLine();
            if (kiemTraSoNguyen(chonMenu)) {
                chon = Integer.parseInt(chonMenu);
                switch (chon) {
                    case 1:
                        showAllVilla();
                        break;
                    case 2:
                        showAllHouse();
                        break;
                    case 3:
                        showAllRoom();
                        break;
                    case 4:
                        showAllNameVillaNotDuplicate();
                        displayMainMenu();
                        break;
                    case 5:
                        showAllNameHouseNotDuplicate();
                        displayMainMenu();
                        break;
                    case 6:
                        showAllNameRoomNotDuplicate();
                        displayMainMenu();
                        break;
                    case 7:
                        displayMainMenu();
                        break;
                    case 8:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Sự lựa chọn không tồn tại. Bạn cần chọn lại");
                }
            } else System.out.println("Lựa chọn không tồn tại");
        } while (true);
    }

    private static void showAllNameRoomNotDuplicate() throws IOException {
        List<Room> roomList = DocGhiFileCSV.docFileRoom();
        TreeSet<String> treeSet = new TreeSet<>();
        int bienDem = 1;
        if (!roomList.isEmpty()) {
            for (Room element : roomList) {
                treeSet.add(element.getTenDichVu());
            }

            System.out.println("Danh sách các Room không trùng tên: ");
            for (String element : treeSet) {
                System.out.println(bienDem + ". " + element);
                bienDem++;
            }
        } else System.out.println("Hiện chưa có thông tin Room nào");
    }

    private static void showAllNameHouseNotDuplicate() throws IOException {
        List<House> houseList = DocGhiFileCSV.docFileHouse();
        TreeSet<String> treeSet = new TreeSet<>();
        int bienDem = 1;
        if (!houseList.isEmpty()) {
            for (House element : houseList) {
                treeSet.add(element.getTenDichVu());
            }

            System.out.println("Danh sách các House không trùng tên: ");
            for (String element : treeSet) {
                System.out.println(bienDem + ". " + element);
                bienDem++;
            }
        } else System.out.println("Hiện chưa có thông tin House nào");
    }

    private static void showAllNameVillaNotDuplicate() throws IOException {
        List<Villa> villaList = DocGhiFileCSV.docFileVilla();
        TreeSet<String> treeSet = new TreeSet<>();
        int bienDem = 1;
        if (!villaList.isEmpty()) {
            for (Villa element : villaList) {
                treeSet.add(element.getTenDichVu());
            }

            System.out.println("Danh sách các Villa không trùng tên: ");
            for (String element : treeSet) {
                System.out.println(bienDem + ". " + element);
                bienDem++;
            }
        } else System.out.println("Hiện chưa có thông tin Villa nào");
    }

    private static List<Room> showAllRoom() throws IOException {
        List<Room> roomList = DocGhiFileCSV.docFileRoom();
        if (!roomList.isEmpty()) {
            for (Room element : roomList) {
                System.out.println(element);
            }
        } else System.out.println("Hiện chưa có thông tin của Room nào");
        return roomList;
    }

    private static List<House> showAllHouse() throws IOException {
        List<House> houseList = DocGhiFileCSV.docFileHouse();
        if (!houseList.isEmpty()) {
            for (House element : houseList) {
                System.out.println(element);
            }
        } else System.out.println("Hiện chưa có thông tin của House nào");
        return houseList;
    }

    private static List<Villa> showAllVilla() throws IOException {
        List<Villa> villaList = DocGhiFileCSV.docFileVilla();
        if (!villaList.isEmpty()) {
            for (Villa element : villaList) {
                System.out.println(element);
            }
        } else System.out.println("Hiện chưa có thông tin của Villa nào");
        return villaList;
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



    private static void addNewRoom() throws IOException {
        String id = kiemTraID("RO");
        String tenDichVu = kiemTraTenDV("Room");
        String dienTichSuDung = kiemTraDienTich("sử dụng");
        String giaThue = kiemTraChiPhiThue();
        String soLuongNguoiThue = kiemTraSoLuongNguoi();
        System.out.print("Nhập Kiểu thuê: ");
        String kieuThue = chuanHoaDL(input.nextLine());
        ExtraServices extraServices=dichVuDiKem();
        System.out.print("Bạn đã nhập thành công\n");
        Room room = new Room(id, tenDichVu, dienTichSuDung, giaThue, soLuongNguoiThue, kieuThue,extraServices);
        DocGhiFileCSV.ghiFile(room);
        showAllRoom();

    }

    private static void addNewHouse() throws IOException {
        String id = kiemTraID("HO");
        String tenDichVu = kiemTraTenDV("House");
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

        DocGhiFileCSV.ghiFile(house);
        showAllHouse();

    }

    private static void addNewVilla() throws IOException {

        String id = kiemTraID("VL");
        String tenDichVu = kiemTraTenDV("Villa");
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


        DocGhiFileCSV.ghiFile(villa);
        showAllVilla();
    }




    private static boolean kiemTraSoNguyen(String chonMenu) {
        return chonMenu.matches("^\\d+");
    }
    public static boolean kiemTraSoThuc(String soCanKiemTra) {
        return soCanKiemTra.matches("^\\d+([.]\\d+)?");
    }
    public static String kiemTraID(String idDichVu) {
        final String ID_REGEX = "^SV" + idDichVu + "[-]\\d{4}$";
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
    public static String kiemTraTenDV(String tenDichVu) {
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
                System.out.println("========================================" +
                        "\nNhập sai tên dịch vụ" +
                        "\nVilla tên - House tên  - Room tên" +
                        "\nVí dụ: Villa Vip || House 1 || Room normal1" +
                        "\n========================================");
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
            if (kiemTraSoThuc(chiPhi) && Float.parseFloat(chiPhi) > 0) {
                break;
            }
            else{
                System.out.println("========================================\n" +
                        "Chi Phí Thuê Phải Là Số Dương\n" +
                        "========================================");
            }

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
                System.out.println("========================================\n" +
                        "Số lượng người phải lớn hơn 0 và nhỏ hơn 20\n" +
                        "========================================");
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
    public static String kiemTraNgaySinh() {
        String ngaySinh;
        do {
            try {
                System.out.print("Nhập ngày tháng năm sinh: ");
                ngaySinh = input.nextLine();
                if (ngaySinh.matches("^((0[1-9])|([1-2][0-9])|(3[0-1]))[/]((0[1-9])|(1[0-2]))[/]((19[0-9]{2})|(200[0-2]))$"))
                    break;
                else throw new BirthdayException();
            } catch (BirthdayException e) {
                System.out.println("========================================\nNgày sinh không hợp lệ.\nNăm sinh phải > 1900 và nhỏ hơn năm hiện tại 18 năm\nĐúng định dạng dd/mm/yyyy\n========================================");
            }
        } while (true);
        return ngaySinh;
    }
    public static String kiemTraEmail() {
        String email;
        do {
            try {
                System.out.print("Nhập địa chỉ Email: ");
                email = input.nextLine();
                if (email.matches("^\\w+@([a-z]{3,6})+[.]([a-z]{2,3})$")) {
                    break;
                }
                else throw new EmailException();
            } catch (EmailException e) {
                System.out.println("========================================\n" +
                        "Email phải đúng định dạng abc@abc.abc\n" +
                        "========================================");
            }
        } while (true);
        return email;
    }
    public static String kiemTraName(){
        String hoTen;
        do {
            try{
                System.out.println("nhập họ và tên khách hàng : ");
                hoTen=input.nextLine();
                if (hoTen.matches("^\\p{Lu}((\\p{Ll})*)(\\s\\p{Lu}(\\p{Ll})*)*$")){
                    break;
                }
                else throw new NameException();
            }catch (NameException e){
                System.out.println("******************************\n" +
                        "Name Customer phải có định dạng in hoa ký tự đầu tiên và không cho phép kí tự khoảng trống thừa \n" +
                        "Ví dụ “Nguyễn Kiên” là đúng còn “Nguyễn kIÊn” là sai.\n" +
                        "******************************");
            }
        }while (true);
        return hoTen;
    }
    public static String kiemTraGioiTinh() {
        String gioiTinh;
        do {
            try {
                System.out.print("Nhập giới tính: ");
                gioiTinh = input.nextLine();
                if (gioiTinh.matches("^([Mm][Aa][Ll][Ee])|([Ff][Ee][Mm][Aa][Ll][Ee])|([Uu][Nn][Kk][Nn][Oo][Ww][Nn])$")) {
                    gioiTinh = gioiTinh.toLowerCase();
                    gioiTinh = gioiTinh.substring(0, 1).toUpperCase() + gioiTinh.substring(1);
                    break;
                } else throw new GenderException();
            } catch (GenderException e) {
                System.out.println("========================================\n" +
                        "Giới tính không hợp lệ. Nhập 1 trong 3 giới tính sau: Male, Female, Unknown\n" +
                        "========================================");
            }
        } while (true);
        return gioiTinh;
    }
    public static String kiemTraIDCard(){
        String idCard;
        do {
            try{
                System.out.println("nhập số chứng minh nhân dân: ");
                idCard=input.nextLine();
                if(idCard.matches("^\\d{9}$")){
                    break;
                }else throw new IDException();

            }catch (IDException e){
                System.out.println("**************************\n" +
                        "sai định dạng \n" +
                        "Id Card phải có 9 chữ số và theo định dạng XXX XXX XXX\n" +
                        "****************************");
            }
        }while (true);
        return idCard;
    }
    private static String kiemTraPhone() {
        String soDT;
        do {
            System.out.print("Nhập số điện thoại: ");
            soDT = input.nextLine();
            if (soDT.matches("^0\\d{9}$")) break;
            else
                System.out.println("========================================\nSố điện phải có 10 số và bắt đầu bằng số 0\n========================================");
        } while (true);
        return soDT;
    }
    private static String kiemTraLoaiCustomer() {
        String loaiKhachHang;
        do {
            System.out.print("Nhập loại khách hàng: ");
            loaiKhachHang = input.nextLine();
            if (loaiKhachHang.equals("Diamond")) {
                if (loaiKhachHang.matches("^(Diamond)$")) {
                    break;
                }
            }
            if (loaiKhachHang.equals("Platinium")) {
                if (loaiKhachHang.matches("^(Platinium)$")) {
                    break;
                }
            }
            if (loaiKhachHang.equals("Gold")) {
                if (loaiKhachHang.matches("^(Gold)$")) {
                    break;
                }
            } if (loaiKhachHang.equals("Silver")) {
                if (loaiKhachHang.matches("^(Silver)$")){
                    break;
                }
            }if (loaiKhachHang.equals("Member")) {
                if (loaiKhachHang.matches("^(Member)$")) {
                    break;
                }
            }else {
                System.out.println("========================================" +
                        "\nNhập sai loại khách hàng" +
                        "\nLoại Customer bao gồm: (Diamond, Platinium, Gold, Silver, Member)" +
                        "\nVí dụ: Diamond, Platinium, Gold, Silver, Member" +
                        "\n========================================");
            }   
        } while (true);
        return loaiKhachHang;

    }
    public static ExtraServices dichVuDiKem() {
        final String DV_DI_KEM_REGEX = "^(massage|karaoke|food|drink|car)([,](massage|karaoke|food|drink|car)){0,4}$";
        String dichVu;
        do {
            System.out.print("Dịch vụ đi kèm: ");
            dichVu = input.nextLine();

            if (dichVu.matches(DV_DI_KEM_REGEX)) break;
            else
                System.out.println("========================================\n" +
                        "Chọn 1 trong các loại dịch vụ đi kèm sau: massage, karaoke, food, drink, car\n" +
                        "========================================");
        } while (true);
        System.out.println("nhập số lần sử dụng ");
        String donvi=input.nextLine();
        System.out.println("nhập giá dịch vụ sử dụng đi kèm ");
        String giaTien=input.nextLine();
        ExtraServices extraServices=new ExtraServices(dichVu,donvi,giaTien);
        return extraServices;
    }

}
