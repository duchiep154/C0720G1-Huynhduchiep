package _14_thuat_toan_sap_xep.bai_tap.minh_hoa_sap_xep_chen;

import java.util.Arrays;

public class SapXepChen {
    public void insertionSort(int arr[]) {
        int giaTriChen;
        int viTriChen;


        // lap qua tat ca cac so
        for (int index = 1; index < arr.length; index++) {

            // chon mot gia tri de chen
            giaTriChen = arr[index];

            // lua chon vi tri de chen
            viTriChen = index;

            // kiem tra xem so lien truoc co lon hon gia tri duoc chen khong
            while (viTriChen > 0 && arr[viTriChen - 1] > giaTriChen) {
                arr[viTriChen] = arr[viTriChen - 1];
                viTriChen--;
                System.out.println("Di chuyen phan tu: " + arr[viTriChen]);
            }

            if (viTriChen != index) {
                System.out.println(" Chen phan tu: " + giaTriChen
                        + ", tai vi tri: " + viTriChen);
                // chen phan tu tai vi tri chen
                arr[viTriChen] = giaTriChen;
            }

            System.out.println("Vong lap thu " + index);
            System.out.println(Arrays.toString(arr));
           // display(arr);
        }
    }

//    public void display(int arr[]) {
//
//        System.out.print("[");
//
//        // Duyet qua tat ca phan tu
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//        System.out.print("]\n");
//    }

    public static void main(String[] args) {
        // khoi tao mang arr
        int arr[] = { 6, 7, 0, 2, 8, 1, 3, 9, 4, 5,18,31,74,69,58,20,14,16};

        SapXepChen sapXepChen = new SapXepChen();
        System.out.println("Mang du lieu dau vao: ");
        System.out.println(Arrays.toString(arr));
        //sapXepChen.display(arr);
        System.out.println("-----------------------------");
        sapXepChen.insertionSort(arr);
        System.out.println("-----------------------------");
        System.out.println("\nMang sau khi da sap xep: ");
        System.out.println(Arrays.toString(arr));
       // sapXepChen.display(arr);
    }
}


