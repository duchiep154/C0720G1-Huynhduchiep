package Models;
//Ngoài ra, resort còn cung cấp các dịch vụ đi kèm như massage, karaoke, thức ăn, nước uống, thuê xe di chuyển tham quan resort.
//Dịch vụ đi kèm sẽ bao gồm các thông tin: Tên dịch vụ đi kèm, Đơn vị, Giá tiền

public class ExtraServices {
    private String dichVuDiKem;
    private String donVi;
    private double giaTien;

    public ExtraServices(String dichVuDiKem, String donVi, double giaTien) {
        this.dichVuDiKem = dichVuDiKem;
        this.donVi = donVi;
        this.giaTien = giaTien;
    }

    @Override
    public String toString() {
        return "ExtraServices{" +
                "dichVuDiKem='" + dichVuDiKem + '\'' +
                ", donVi='" + donVi + '\'' +
                ", giaTien=" + giaTien +
                '}';
    }

    public String getDichVuDiKem() {
        return dichVuDiKem;
    }

    public void setDichVuDiKem(String dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public double getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }
}
