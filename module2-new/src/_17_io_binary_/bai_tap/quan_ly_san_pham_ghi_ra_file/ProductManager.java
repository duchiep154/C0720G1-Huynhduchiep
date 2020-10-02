package _17_io_binary_.bai_tap.quan_ly_san_pham_ghi_ra_file;



import java.util.List;
import java.util.Scanner;

public class ProductManager {
    public static Scanner scanner =new Scanner(System.in);
    private List<Product> productList;
    private ProductFile productFile;

    public ProductManager() {
        productFile=new ProductFile();
        productList=productFile.reader();
    }


    // hàm thêm sản phẩm
    public void add(){
        int id = (productList.size() > 0) ? (productList.size() + 1) : 1;
        System.out.println("product id = " + id);
        String name = inputName();
        String hangSanXuat=inputHangSanXuat();
        double price = inputPrice();
        scanner.nextLine();
        String detail = inputDetail();
        Product product = new Product(id, name, hangSanXuat, price, detail);
        productList.add(product);
        productFile.write(productList);
        System.out.println("thêm thành công");
    }

    /// hàm hiển thị sản phẩm
    public void show() {
        for (Product product : productList) {
            System.out.println(product.toString());
        }
    }

    // hàm tìm kiếm thông tin sản phẩm
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
    private String inputName() {
        System.out.print("nhập tên sản phẩm: ");
        return scanner.nextLine();
    }
    private String inputHangSanXuat() {
        System.out.print("nhập hãng sản xuât: ");
        return scanner.nextLine();
    }
    private double inputPrice(){
        System.out.println("nhập giá tiền :");
        return scanner.nextDouble();
    }
    private String inputDetail() {
        System.out.print("nhập thông tin sản phẩm: ");
        return scanner.nextLine();
    }

}
