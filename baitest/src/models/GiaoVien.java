package models;

public class GiaoVien extends ConNguoi {
    public GiaoVien(int id, String hoVaTen, String ngaySinh, String gioiTinh, String soDienThoai) {
        super(id, hoVaTen, ngaySinh, gioiTinh, soDienThoai);
    }

    @Override
    public String toString() {
        return "GiaoVien{" +
                "id=" + id +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                '}';
    }

    @Override
    public String hienThiThongTin() {
        this.toString();

        return null;
    }
}
