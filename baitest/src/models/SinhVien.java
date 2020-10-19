package models;

public class SinhVien  extends ConNguoi{
    private int idLopHoc;

    public SinhVien(int id, String hoVaTen, String ngaySinh, String gioiTinh, String soDienThoai, int idLopHoc) {
        super(id, hoVaTen, ngaySinh, gioiTinh, soDienThoai);
        this.idLopHoc = idLopHoc;
    }

    public SinhVien() {
    }
    public SinhVien(int idLopHoc) {
        this.idLopHoc = idLopHoc;
    }

    public int getIdLopHoc() {
        return idLopHoc;
    }

    public void setIdLopHoc(int idLopHoc) {
        this.idLopHoc = idLopHoc;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "idLopHoc=" + idLopHoc +
                ", id=" + id +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                '}';
    }

    @Override
    public String hienThiThongTin() {
        return id+","+hoVaTen+","+ngaySinh+","+gioiTinh+","+soDienThoai+","+idLopHoc;

    }
}
