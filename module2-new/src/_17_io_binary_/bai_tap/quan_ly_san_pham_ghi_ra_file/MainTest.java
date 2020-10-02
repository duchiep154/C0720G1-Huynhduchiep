package _17_io_binary_.bai_tap.quan_ly_san_pham_ghi_ra_file;



import java.util.Scanner;

public class MainTest {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        ProductManager productManager=new ProductManager();
        int productId;

        // show menu
        showMenu();
        while (true) {
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    productManager.add();
                    break;
                case "2":
                    productManager.show();

                    break;
                case "3":
                    productManager.findProductByName();

                    break;

                case "0":
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("lựa chọn ko đúng vui lòng nhập số theo hướng dẫn :");
                    break;
            }
            if (exit) {
                break;
            }
            // show menu
            showMenu();
        }

    }
    public static void showMenu() {
        System.out.println("-----------menu------------");
        System.out.println("1. Thêm Sản Phẩm.");
        System.out.println("2. hiển thị Sản phẩm");
        System.out.println("3. tìm Kiếm thông tin sản phẩm.");

        System.out.println("0. exit.");
        System.out.println("---------------------------");
        System.out.print("vui lòng nhập số theo chỉ dẫn : ");
    }
}
