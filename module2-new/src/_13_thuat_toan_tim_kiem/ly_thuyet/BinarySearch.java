package _13_thuat_toan_tim_kiem.ly_thuyet;

public class BinarySearch {
    public static int search(int[] array, int element) {
        int low = 0;
        int high = array.length - 1;

        while (high >= low) {
            int mid = (high + low) / 2;

            if (element == array[mid])
                return mid;
            else if (element > array[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println(search(myArray, 1));
      //  System.out.println((0 + 9)%2);
    }
}
