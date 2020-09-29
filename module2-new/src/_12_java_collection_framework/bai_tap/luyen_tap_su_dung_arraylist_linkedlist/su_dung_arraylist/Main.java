package _12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.su_dung_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager=new ProductManager();
        Scanner scanner=new Scanner(System.in);
        while (true) {
            int choose;
            System.out.println("*********************************");
            System.out.println("1.Thêm Sản Phẩm");
            System.out.println("2.Chỉnh sửa thông tin sản phẩm");
            System.out.println("3.Xóa  sản phẩm ");
            System.out.println("4.Hiển thị danh sách sản phẩm");
            System.out.println("5.tìm kiếm sản phẩm");
            System.out.println("6.sắp xếp sản phẩm theo giá");
            System.out.println("7.thoát");
            System.out.println("*********************************");
            System.out.print("Enter the selection: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    productManager.addProduct();
                    break;
                case 2:
                    productManager.editProductById();
                    break;
                case 3:
                    productManager.deleteProductById();
                    break;
                case 4:
                    productManager.displayProduct();
                    break;
                case 5:
                    productManager.findProductByName();
                    break;
                case 6:
                    productManager.sortProduct();
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
}
