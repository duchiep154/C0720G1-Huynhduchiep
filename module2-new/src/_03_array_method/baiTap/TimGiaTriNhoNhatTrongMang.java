package _03_array_method.baiTap;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int[] arr = {45, 12, 90, 8, 1, 6, 79};
        int result = minValue(arr);
        System.out.println("Giá trị Nhỏ nhất trong mảng là: " + result);
    }
    public static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
