package _07_abstract_interface;

public class DungSiDepTrai extends DungSi {
    public DungSiDepTrai(String ten) {
        super(ten);
    }

    @Override
    public void nhiemVu(String tenNhiemVu) {
        System.out.println("Dung si [" +getTen() + "] dang lam nhiem vu+ "+tenNhiemVu);
    }

    @Override
    public String toString() {
        return getTen();
    }
}
