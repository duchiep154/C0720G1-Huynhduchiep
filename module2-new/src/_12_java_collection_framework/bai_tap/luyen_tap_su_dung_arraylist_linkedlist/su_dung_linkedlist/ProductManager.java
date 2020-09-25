package _12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.su_dung_linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductManager {

    // hàm hiển thị menu

    public static void mainMenu(LinkedList<Product2> product2s){
        Scanner scanner=new Scanner(System.in);

        while (true){
            int chon;
            System.out.println("1.Thêm Sản Phẩm");
            System.out.println("2.Chỉnh sửa thông tin sản phẩm");
            System.out.println("3.Xóa  sản phẩm ");
            System.out.println("4.Hiển thị danh sách sản phẩm");
            System.out.println("5.tìm kiếm sản phẩm");
            System.out.println("6.sắp xếp sản phẩm theo giá");
            System.out.println("7.thoát");
            System.out.print("Enter the selection: ");
            chon = scanner.nextInt();
            switch (chon) {
                case 1:
                    addProduct(product2s,scanner);
                    break;
                case 2:
                    editProductById(product2s, scanner);
                    break;
                case 3:
                    deleteProductById(product2s, scanner);
                    break;
                case 4:
                    displayProduct(product2s);
                    break;
                case 5:
                    findProductByName(product2s,scanner);
                    break;
                case 6:
                    sortProduct(product2s);
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }


    // hàm add sản phẩm
    public static void addProduct(LinkedList<Product2> linkedList, Scanner scanner) {
        scanner.nextLine();
        System.out.println("nhập tên sản phẩm");
        String name =scanner.nextLine();
        System.out.println("nhập id sản phẩm");
        int id = scanner.nextInt();
        System.out.println("nhập giá sản phẩm");
        double price = scanner.nextDouble();
        linkedList.add(new Product2(name,id,price));
        displayProduct(linkedList);

    }

    // hàm sửa thông tin
    public static void editProductById(LinkedList<Product2> linkedList, Scanner scanner) {
        Scanner scanner1=new Scanner(System.in);
        System.out.println("nhập id sản phẩm muốn sửa");
        int inputID =scanner.nextInt();
        for (Product2 product2 :linkedList){
            if(inputID== product2.getId()){
                System.out.println("nhập tên sản phẩm");
                String nameNew=scanner.nextLine();
                product2.setName(nameNew);
                System.out.println("nhập id sản phẩm");
                int idNew=scanner.nextInt();
                product2.setId(idNew);
                System.out.println("nhập giá sản phẩm");
                double priceNew=scanner.nextDouble();
                product2.setPrice(priceNew);
            }else {
                System.out.println("không có thông tin sản phẩm");
            }
        }
        displayProduct(linkedList);

    }

    // hàm đelete
    public static void deleteProductById(LinkedList<Product2> linkedList, Scanner scanner){
        System.out.println("nhập id sản phẩm muốn xóa");
        int inputDelete=scanner.nextInt();
        for(int i=0;i<linkedList.size();i++){
            if(inputDelete==linkedList.get(i).getId()){
                linkedList.remove(linkedList.get(i));
            }
        }
        System.out.println("đã xóa thành công");
        displayProduct(linkedList);
    }

    // hàm tìm kiếm

    public static void findProductByName(LinkedList<Product2> linkedList, Scanner scanner){
        Scanner scanner1=new Scanner(System.in);
        String nameSearch;
        System.out.println(" nhập tên sản phẩm muốn tìm");
        scanner.nextLine();
        nameSearch=scanner.nextLine();
        for (Product2 product2 : linkedList) {
            if (nameSearch.equals(product2.getName())) {
                System.out.println(product2.toString());
            }else {
                System.out.println("không có thông tin sản phẩm");
                break;
            }
        }
    }
    // hàm săp xếp

   private static void sortProduct(LinkedList<Product2>linkedList){
       // LinkedList<Product2> linkedList = null;
        Scanner scanner=new Scanner(System.in);
       System.out.println("1.sắp xếp theo giá tăng dần\n" +
               "2.sắp xếp theo giá giảm dần\n" +
               "3.back");
       int inputChon=scanner.nextInt();
       switch (inputChon){

           case 1:
               sortGiam(linkedList);
               break;
           case 2:
               sortTang(linkedList);
               break;
           case 3:
               mainMenu(linkedList);

               break;
           default:
               break;

       }



   }

   public static void sortGiam(LinkedList<Product2> linkedList){
       Collections.sort(linkedList,new ProductSort());
       for(Product2 product2 :linkedList){
           System.out.println(product2);

       }
   }

   public static void sortTang(LinkedList<Product2> linkedList){
       Collections.sort(linkedList,new ProducSortTang());
       for(Product2 product2 :linkedList){
           System.out.println(product2);

       }

   }

// hàm hiển thị sản phẩm
    public static void displayProduct(LinkedList<Product2> linkedList){
        for(Product2 product2 :linkedList){
            System.out.println(product2);

        }
    }

}

