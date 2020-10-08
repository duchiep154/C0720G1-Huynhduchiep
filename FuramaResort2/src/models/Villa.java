package models;
//-	Riêng Villa sẽ có thêm thông tin: Tiêu chuẩn phòng, Mô tả tiện nghi khác, Diện tích hồ bơi, Số tầng.

public class Villa extends Services {
    private String tieuChuanPhong;
    private String moTaTienNghiKhac;
    private String dienTichHoBoi;
    private String soTang;

    public Villa(String id, String tenDichVu, String dienTichSuDung, String giaThue, String soLuongNguoiThue, String kieuThue, String tieuChuanPhong, String moTaTienNghiKhac, String dienTichHoBoi, String soTang) {
        super(id, tenDichVu, dienTichSuDung, giaThue, soLuongNguoiThue, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "id=" + id + '\'' +
                ",tenDichVu=" + tenDichVu + '\'' +
                ",dienTichSuDung=" + dienTichSuDung + '\'' +
                ",giaThue='" + giaThue + '\'' +
                ",soLuongNguoiThue='" + soLuongNguoiThue + '\'' +
                ",kieuThue='" + kieuThue + '\'' +
                ",tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ",moTaTienNghiKhac='" + moTaTienNghiKhac + '\'' +
                ",dienTichHoBoi='" + dienTichHoBoi + '\'' +
                ",soTang='" + soTang + '\'' +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());

    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getMoTaTienNghiKhac() {
        return moTaTienNghiKhac;
    }

    public void setMoTaTienNghiKhac(String moTaTienNghiKhac) {
        this.moTaTienNghiKhac = moTaTienNghiKhac;
    }

    public String getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(String dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public String getSoTang() {
        return soTang;
    }

    public void setSoTang(String soTang) {
        this.soTang = soTang;
    }
}
