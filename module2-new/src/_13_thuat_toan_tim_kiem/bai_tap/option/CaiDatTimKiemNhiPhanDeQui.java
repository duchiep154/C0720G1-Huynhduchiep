package _13_thuat_toan_tim_kiem.bai_tap.option;

import java.util.Scanner;

public class CaiDatTimKiemNhiPhanDeQui {
    public static int binarySearch(int arr[], int low, int high, int value){

        if (high>=low) {
            int mid =  (high + low)/2;
            if (arr[mid] == value){
                return mid;
            }else if (arr[mid] > value){
                return binarySearch(arr, low, mid-1, value);
            }else {
                return binarySearch(arr, low, mid-1, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int[] myArray={1,5,43,45,51,52,61,68,73,79,81,85,94,96};
        System.out.println("nhap so can tim");
        int number=scanner.nextInt();
        System.out.println("so can tim nam o vi tri");

        System.out.println(binarySearch(myArray,0,myArray.length-1,number));
    }

}
