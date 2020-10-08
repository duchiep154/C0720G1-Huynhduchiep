package models;
//1.	Khu nghỉ dưỡng Furama sẽ cung cấp các dịch vụ cho thuê bao gồm Villa, House, Room.
//Tất cả các dịch vụ này sẽ bao có các thông tin: Tên dịch vụ, Diện tích sử dụng, Chi phí thuê,
// Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ).

public abstract class Services {
    protected String id;
    protected String tenDichVu;
    protected String dienTichSuDung;
    protected String giaThue;
    protected String soLuongNguoiThue;
    protected String kieuThue;

    public Services(String id, String tenDichVu, String dienTichSuDung, String giaThue, String soLuongNguoiThue, String kieuThue) {
        this.id = id;
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.giaThue = giaThue;
        this.soLuongNguoiThue = soLuongNguoiThue;
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "Services{" +
                "id='" + id + '\'' +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", dienTichSuDung=" + dienTichSuDung +
                ", giaThue=" + giaThue +
                ", soLuongNguoiThue=" + soLuongNguoiThue +
                ", kieuThue='" + kieuThue + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(String dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public String getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(String giaThue) {
        this.giaThue = giaThue;
    }

    public String getSoLuongNguoiThue() {
        return soLuongNguoiThue;
    }

    public void setSoLuongNguoiThue(String soLuongNguoiThue) {
        this.soLuongNguoiThue = soLuongNguoiThue;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    public abstract void showInfor();


}
