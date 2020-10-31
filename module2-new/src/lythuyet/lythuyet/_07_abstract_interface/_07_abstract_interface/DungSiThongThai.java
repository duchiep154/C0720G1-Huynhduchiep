package _07_abstract_interface;

public class DungSiThongThai extends DungSi implements IVuKhi, IGiap {
    public DungSiThongThai(String ten) {
        super(ten);
    }

    @Override
    public void nhiemVu(String tenNhiemVu) {
        System.out.println("Dung si [" + getTen() + "] dang lam nhiem vu+ " + tenNhiemVu);
    }

    @Override
    public void getVuKhi(String tenVuKhi) {
        System.out.println("Dung si [" + getTen() + "]  duoc trang bi vu khi " + tenVuKhi + " cap " + IVuKhi.capDo);
    }

    @Override
    public void getGiap(String tenGiap) {
        System.out.println("Dung si [" + getTen() + "]  duoc trang bi giap " + tenGiap + " cap " + IGiap.capDo);
    }
}
