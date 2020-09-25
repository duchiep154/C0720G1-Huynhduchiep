package _12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.su_dung_linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

import static _12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.su_dung_linkedlist.ProductManager.mainMenu;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        // tạo linkedlist
        LinkedList<Product2> product2List = new LinkedList<>();
        // add sp vào linked list
        product2List.add(new Product2("kem đánh răng",1001,99000));
        product2List.add(new Product2("sữa rửa mặt",1002,59000));
        product2List.add(new Product2("dao cạo rau",1003,189000));
        product2List.add(new Product2("bàn chải",1004,39000));
        product2List.add(new Product2("khăn giấy ",1005,79000));
        product2List.add(new Product2("sữa rữa mặt",1006,239000));
        product2List.add(new Product2("xà bông tắm",1007,89000));

        mainMenu(product2List);
    }
}
