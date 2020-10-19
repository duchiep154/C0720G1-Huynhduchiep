package _quan_ly_danh_SV.models;

public class Student {
    private String maSo;
    private String hoTen;
    private String ngaySinh;
    private String dienThoai;
    private String email;
    private String diemTB;

    public Student() {
    }

    public Student(String maSo, String hoTen, String ngaySinh, String dienThoai, String email, String diemTB) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.dienThoai = dienThoai;
        this.email = email;
        this.diemTB = diemTB;
    }

    public String getMaSo() {
        return maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
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

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(String diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "Student{" +
                "maSo='" + maSo + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", dienThoai='" + dienThoai + '\'' +
                ", email='" + email + '\'' +
                ", diemTB='" + diemTB + '\'' +
                '}';
    }
    public String getInfor(){
        return maSo+","+hoTen+","+ngaySinh+","+dienThoai+","+email+","+diemTB;

    }
}
