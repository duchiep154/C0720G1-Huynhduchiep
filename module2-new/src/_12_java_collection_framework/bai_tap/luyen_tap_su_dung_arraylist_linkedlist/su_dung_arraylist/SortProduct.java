package _12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.su_dung_arraylist;

import java.util.Comparator;

public class SortProduct implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrice()-o2.getPrice());

    }
}
