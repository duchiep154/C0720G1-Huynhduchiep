package models;

///-	Riêng House sẽ có thêm thông tin: Tiêu chuẩn phòng, Mô tả tiện nghi khác, Số tầng.
public class House extends Services {

    private String tieuChuanPhong;
    private String moTaTienNghiKhac;
    private String soTang;

    public House(String id, String tenDichVu, String dienTichSuDung, String giaThue, String soLuongNguoiThue, String kieuThue, String tieuChuanPhong, String moTaTienNghiKhac, String soTang) {
        super(id, tenDichVu, dienTichSuDung, giaThue, soLuongNguoiThue, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id + '\'' +
                ",tenDichVu=" + tenDichVu + '\'' +
                ",dienTichSuDung=" + dienTichSuDung + '\'' +
                ",giaThue=" + giaThue + '\'' +
                ",soLuongNguoiThue=" + soLuongNguoiThue + '\'' +
                ",kieuThue=" + kieuThue + '\'' +
                ",tieuChuanPhong=" + tieuChuanPhong + '\'' +
                ",moTaTienNghiKhac=" + moTaTienNghiKhac + '\'' +
                ",soTang=" + soTang + '\'' +
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

    public String getSoTang() {
        return soTang;
    }

    public void setSoTang(String soTang) {
        this.soTang = soTang;
    }
}
