package _12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.su_dung_arraylist;

import java.util.ArrayList;

import java.util.Scanner;

public class ProductManager {
    ArrayList<Product> productList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    // hàm chỉnh sửa product

    public ProductManager() {
        productList.add(new Product("chổi lông gà",1001,199000));
        productList.add(new Product("khay rửa ly",1006,160000));
        productList.add(new Product("nước rửa chén",1003,130000));
        productList.add(new Product("bột giặc",1004,180000));
        productList.add(new Product("nước xã",1005,180000));
    }

    public void editProductById() {
        System.out.println("nhập ID sản phẩm muốn sửa ");
        int inputId = scanner.nextInt();
        for (Product product : productList) {
            if (inputId == product.getId()) {
                System.out.println("nhập ID sản Phẩm");
                int idNew = scanner.nextInt();
                product.setId(idNew);
                scanner.nextLine();
                System.out.println("nhập tên sản Phẩm");
                String nameNew = scanner.nextLine();
                product.setName(nameNew);
                System.out.println("nhập giá sản Phẩm");
                double priceNew = scanner.nextDouble();
                product.setPrice(priceNew);
            }
        }
        displayProduct();
    }
    // hàm xóa
    public   void deleteProductById() {
        System.out.println("nhập ID sản phẩm muốn xóa");
        int inputDelete = scanner.nextInt();
        for (int i = 0; i < productList.size(); i++) {
            if (inputDelete == productList.get(i).getId()) {
                productList.remove(productList.get(i));
            }
        }
        displayProduct();
    }

    // hàm tìm kiếm

    public  void findProductByName() {
        String nameFind;
        System.out.println("nhập tên Sản Phẩm muốn tìm");
      //  scanner.nextLine();
        nameFind = scanner.nextLine();
        boolean check=true;


        for (Product product : productList) {


//            if (nameFind.equals(product.getName())) {    // tim kiếm chính xác theo name
            // timg kiếm theo bất cứ ký tự nhập vào
            if (product.getName().contains(nameFind)) {
                System.out.println(product.toString());
                check=true;
            }
        }
        if(!check){
            System.out.println("không có thông tin sản phâm");
        }
    }

    public  void sortProduct() {
        productList.sort(new SortProduct());
        System.out.println("danh sách sau khi sắp xếp theo giá");
        System.out.println(productList);
    }

    public  void addProduct() {
      //  scanner.nextLine();
        System.out.println("nhập tên Sản Phẩm");
        String name = scanner.nextLine();
        System.out.println("nhập ID sản Phẩm");
        int id = scanner.nextInt();
        System.out.println("nhập giá Sản Phẩm");
        double price = scanner.nextDouble();
        productList.add(new Product(name, id, price));
        displayProduct();
    }

    public  void displayProduct() {
        for (Product product:productList ) {
            System.out.println(product);
        }
    }
}
