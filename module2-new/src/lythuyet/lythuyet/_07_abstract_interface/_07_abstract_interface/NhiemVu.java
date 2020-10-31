package _07_abstract_interface;

public class NhiemVu {
    public static void main(String[] args) {
        DungSiDepTrai[] dungSi = new DungSiDepTrai[2];

        DungSiDepTrai dungSiDepTrai1 = new DungSiDepTrai("Tu");
        dungSiDepTrai1.nhiemVu("cuu cong chua");

        DungSiDepTrai dungSiDepTrai2 = new DungSiDepTrai("Linh");
        dungSiDepTrai2.nhiemVu("di mua rau");

        dungSi[0] = dungSiDepTrai1;
        dungSi[1] = dungSiDepTrai2;

        for(DungSiDepTrai dungSiDepTrai: dungSi){
            System.out.println(dungSiDepTrai);
        }

//        DungSiThongThai dungSiThongThai = new DungSiThongThai("Luyen");
//        dungSiThongThai.getVuKhi("kiem bac");
//        dungSiThongThai.getGiap("lua");
//        dungSiThongThai.nhiemVu("diet quai vat");
    }
}
