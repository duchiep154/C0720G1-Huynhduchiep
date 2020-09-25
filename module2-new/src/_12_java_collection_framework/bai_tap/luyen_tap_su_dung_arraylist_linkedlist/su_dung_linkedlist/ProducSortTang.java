package _12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.su_dung_linkedlist;

import java.util.Comparator;

public class ProducSortTang implements Comparator<Product2> {

    @Override
    public int compare(Product2 product1, Product2 product2) {
        return (int) (product2.getPrice()-product1.getPrice());
    }
}
