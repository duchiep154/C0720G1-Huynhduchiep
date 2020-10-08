package models;
//1.	Tạo class có tên là Customer với các thuộc tính như sau:
// Họ tên Customer, Ngày sinh, Giới tính,
// Số CMND, Số ĐT, Email, Loại khách,
// Địa chỉ và thuộc tính sử dụng dịch vụ có kiểu đối tượng là Services,
// và phương thức showInfor().
//2.	Xây dựng phương thức addNewCustomer() cho phép người dùng nhập thông tin cho Customer sau đó lưu vào file Customer.CSV.
//3.	Xây dựng phương thức showInformationCustomers() cho phép người dùng sau khi chọn sẽ hiển thị ra toàn bộ thông tin của các Customer có trong file Customer.CSV.

public class Customer {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private String cmnd;
    private String soDT;
    private String email;
    private String loaiKhach;
    private String diaChi;
    Services dichVu;

    public Customer() {
    }

    public Customer(String hoTen, String ngaySinh, String gioiTinh, String cmnd, String soDT, String email, String loaiKhach, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
        this.soDT = soDT;
        this.email = email;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
    }

    public Customer(String hoTen, String ngaySinh, String gioiTinh, String cmnd, String soDT, String email, String loaiKhach, String diaChi, Services dichVu) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
        this.soDT = soDT;
        this.email = email;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
        this.dichVu = dichVu;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Services getDichVu() {
        return dichVu;
    }

    public void setDichVu(Services dichVu) {
        this.dichVu = dichVu;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", cmnd='" + cmnd + '\'' +
                ", soDT='" + soDT + '\'' +
                ", email='" + email + '\'' +
                ", loaiKhach='" + loaiKhach + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", dichVu=" + dichVu +
                '}';
    }
    public String showInfor(){
        return "Họ và Tên: " + hoTen
                + " _ Ngày Sinh: " + ngaySinh
                + " _ Giới Tính: " + gioiTinh
                + " _ CMND: " + cmnd
                + " _ Số Điện Thoại: " + soDT
                + " _ Email: " + email
                + " _ Loại Khách: " + loaiKhach
                + " _ Địa chỉ: " + diaChi;
    }
}
