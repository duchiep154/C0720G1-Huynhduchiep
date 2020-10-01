package _14_thuat_toan_sap_xep.bai_tap.minh_hoa_sap_xep_chen;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        int giaTriChen;
        int viTriChen;
        int index;
        for(index=1; index<arr.length ; index++){
            giaTriChen = arr[index];

            viTriChen= index;

            while (viTriChen > 0 && arr[viTriChen - 1] > giaTriChen) {
                arr[viTriChen] = arr[viTriChen - 1];
                viTriChen--;
            }
            if (viTriChen != index) {

                // chen phan tu tai vi tri chen
                arr[viTriChen] = giaTriChen;
            }
        }
        System.out.println("danh sách sau khi sắp xếp là :");
        System.out.println(Arrays.toString(arr));
//        System.out.print("[");
//
//        // Duyet qua tat ca phan tu
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.print("]\n");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số lượng phần tử muốn thêm vào :");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("nhập  " + list.length + "  giá trị phần tử ");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.println("danh sách số bạn đã nhập là : ");
        System.out.println(Arrays.toString(list));
//        System.out.print("[");
//
//        for (int i = 0; i < list.length; i++) {
//            System.out.print(list[i] + "\t");
//        }
//        System.out.print("]\n");

        insertionSort(list);


    }
}
