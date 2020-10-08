package models;

import java.util.Comparator;

//Tạo 1 class tên là Employee gồm: Họ tên Employee ,tuổi , địa chỉ và phương thức toString().
public class Employer implements Comparable<Employer> {
    private String maSo;
    private String hoTen;
    private String tuoi;
    private String diaChi;

    public Employer() {
    }

    public Employer(String maSo, String hoTen, String tuoi, String diaChi) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
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

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "maSo='" + maSo + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", tuoi='" + tuoi + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }




    @Override
    public int compareTo(Employer otherEmployer) {
        return this.getMaSo().compareTo(otherEmployer.getMaSo());
    }
}
