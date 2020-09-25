package _12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.su_dung_linkedlist;

import java.util.Comparator;

public class ProductSort implements Comparator<Product2> {


    @Override
    public int compare(Product2 product, Product2 product2) {
        return (int) (product.getPrice()-product2.getPrice());
    }
}
