package _03_array_method.baiTap;

import java.util.Scanner;

public class DemSokiTuTrongChuoi {
    public static void main(String[] args) {
        String chuoi = "chuoi nay xuat hien cai gi day";
        int bienDem = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập 1 kí tự bạn muốn xem số lần xuất hiện của nó trong chuỗi 'Chuoi nay xuat hien cai gi day : ");
        char kiTu = scanner.next().charAt(0);
        for (int i=0;i<chuoi.length();i++){
            if (kiTu == chuoi.charAt(i)){
                bienDem++;
            }
        }
        if (bienDem>0){
            System.out.print("Kí tự bạn nhập là "+kiTu+" , nó xuất hiện "+bienDem+" lần trong chuỗi 'Chuoi nay xuat hien cai gi day'");
        }else System.out.print("Kí tự bạn nhập là "+kiTu+" , nó không xuất hiện trong chuỗi 'Chuoi nay xuat hien cai gi day'");
    }
}
