package _11_danh_sach_stack_queue.bai_tap;

import java.util.TreeMap;

public class DemSoLanXuatHienCuaMoiTuTrongMotChuoiSuDungMap {
    public static void main(String[] args) {
        String str = "CHIỀU CHIỀU RA ĐỨNG BỜ AO TRÔNG VỀ QUÊ MẸ RUỘT ĐAU CHÍN CHIỀU";
        System.out.println("Chuỗi đã nhập: " + str);


        // CHUYỂN chữ hoa thành thường
        String string = str.toLowerCase();
        System.out.println("Chuyển chữ hoa thành chữ thường: " + string);

        // NẠP các từ vào mảng

        String[] arrayChuoi = string.split("\\s");

        // tạo treemap
        TreeMap<String, Integer> map = new TreeMap<>();

        // kiêm tra treemap đã có từ ( key) chưa
        for (String element: arrayChuoi){
            if(map.containsKey(element)){                  //map.containskey(obj)  tìm kiếm key           // có rồi thì đẩy vào tăng value lên 1
                map.put(element,(map.get(element) + 1));
            } else {                                                    // chưa thì đẩy từ vào map
                map.put(element,1);                         //map.put(objet key,valuekey)
            }
        }
        System.out.println(map);


    }
}
