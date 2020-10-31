package lythuyet.lythuyet._10_generic._10_generic;


public class Generic {

    public static <T> void  printElement(T[] object) {
        for (int index = 0; index < object.length; index++) {
            System.out.print(object[index] + "\t");
        }
        System.out.println();
    }

    public static <T> void  printElement2(T[]  object) {
        for (int index = 0; index < object.length; index++) {
            System.out.print(object[index] + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3};
        Double[] doublesArr = {1.1, 2.2, 3.3};
        String[] stringArr = {"one", "two", "three"};

        printElement(intArr);
        printElement(doublesArr);
        printElement(stringArr);
    }
}
