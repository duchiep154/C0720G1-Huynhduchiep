package _12_java_collection_framework.bai_tap.luyen_tap_su_dung_arraylist_linkedlist.su_dung_arraylist;

import java.util.ArrayList;

import java.util.Scanner;

public class ProductManager {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product("chổi lông gà",1001,199000));
        productList.add(new Product("khay rửa ly",1006,160000));
        productList.add(new Product("nước rửa chén",1003,130000));
        productList.add(new Product("bột giặc",1004,180000));
        productList.add(new Product("nước xã",1005,180000));
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int choose;

            System.out.println("1.Thêm Sản Phẩm");
            System.out.println("2.Chỉnh sửa thông tin sản phẩm");
            System.out.println("3.Xóa  sản phẩm ");
            System.out.println("4.Hiển thị danh sách sản phẩm");
            System.out.println("5.tìm kiếm sản phẩm");
            System.out.println("6.sắp xếp sản phẩm theo giá");
            System.out.println("7.thoát");
            System.out.print("Enter the selection: ");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    addProduct(productList, scanner);
                    break;
                case 2:
                    editProductById(productList, scanner);
                    break;
                case 3:
                    deleteProductById(productList, scanner);
                    break;
                case 4:
                    displayProduct(productList);
                    break;
                case 5:
                    findProductByName(productList, scanner);
                    break;
                case 6:
                    sortProduct(productList);
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
    // hàm chỉnh sửa product

    private static void editProductById(ArrayList<Product> arrayList, Scanner scanner) {
        System.out.println("nhập ID sản phẩm muốn sửa ");
        int inputId = scanner.nextInt();
        for (Product product : arrayList) {
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
        displayProduct(arrayList);
    }

    // hàm xóa

    private static void deleteProductById(ArrayList<Product> arrayList, Scanner scanner) {
        System.out.println("nhập ID sản phẩm muốn xóa");
        int inputDelete = scanner.nextInt();
        for (int i = 0; i < arrayList.size(); i++) {
            if (inputDelete == arrayList.get(i).getId()) {
                arrayList.remove(arrayList.get(i));
            }
        }
        displayProduct(arrayList);
    }

    // hàm tìm kiếm

    private static void findProductByName(ArrayList<Product> arrayList, Scanner scanner) {
        String nameFind;
        System.out.println("nhập tên Sản Phẩm muốn tìm");
        scanner.nextLine();
        nameFind = scanner.nextLine();

        for (Product product : arrayList) {
            if (nameFind.equals(product.getName())) {
                System.out.println(product.toString());
            }
            else {
                System.out.println("không có thông tin sản phẩm");
                break;
            }
        }
    }

    private static void sortProduct(ArrayList<Product> arrayList) {
        arrayList.sort(new SortProduct());
        System.out.println("danh sách sau khi sắp xếp theo giá");
        System.out.println(arrayList);
    }

    private static void addProduct(ArrayList<Product> arrayList, Scanner scanner) {
        scanner.nextLine();
        System.out.println("nhập tên Sản Phẩm");
        String name = scanner.nextLine();
        System.out.println("nhập ID sản Phẩm");
        int id = scanner.nextInt();
        System.out.println("nhập giá Sản Phẩm");
        double price = scanner.nextDouble();
        arrayList.add(new Product(name, id, price));
        displayProduct(arrayList);
    }

    private static void displayProduct(ArrayList<Product> arrayList) {
        for (Product product:arrayList ) {
            System.out.println(product);
        }
    }
}
