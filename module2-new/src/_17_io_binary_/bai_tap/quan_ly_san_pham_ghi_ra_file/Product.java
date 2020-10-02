package _17_io_binary_.bai_tap.quan_ly_san_pham_ghi_ra_file;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private String hangSanXuat;
    private double price;
    private String detail;

    public Product() {
    }

    public Product(int id, String name, String hangSanXuat, double price, String detail) {
        this.id = id;
        this.name = name;
        this.hangSanXuat = hangSanXuat;
        this.price = price;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", price=" + price +
                ", detail='" + detail + '\'' +
                '}';
    }
}
