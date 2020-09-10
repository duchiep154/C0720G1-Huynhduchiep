package _02_loop.baiTap;

import java.util.Scanner;

public class Hienthi20songuyentodautien {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("enter a number");
        int number = scanner.nextInt();
        System.out.printf(number + " số nguyen tố đầu tiên là : ");
        int count =0 ;
        int i= 2;
        while(count < number){
            if (kiemTraSoNguyenTo(i)){
                System.out.print(i+" ");
                count++;
            }
            i++;
        }


    }
    public static boolean kiemTraSoNguyenTo(int n){
        if (n < 2){
            return false;
        }
        for (int i=2;i<= Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
