package _13_thuat_toan_tim_kiem.ly_thuyet;

public class LinearSearch {
    public static int search(int[] array, int element) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == element) {
                return index;
            }
        }
        return -1;
    }

    public static void search_2(int[] array, int element) {
        boolean isExist = false;
        for (int index = array.length - 1; index >= 0; index--) {
            if (element == array[index]) {
                isExist = true;
                System.out.print(index + "\t");
            }
        }
        if (!isExist)
            System.out.println("-1");
    }

    public static void main(String[] args) {
        int[] myArray = {6, 7, 8, 9, 3, 11, 65, 18};
        search_2(myArray, 18);
    }

}
