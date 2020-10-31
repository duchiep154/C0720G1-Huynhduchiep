package lythuyet.lythuyet._10_generic._10_generic;

import java.util.ArrayList;
import java.util.List;

public class MyGenericWildcard {

    public static void  printElement(List<?> object) {
        for (int index = 0; index < object.size(); index++) {
            System.out.print(object.get(index) + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);

        List<Double> doubles = new ArrayList<>();
        doubles.add(1.1);
        doubles.add(2.2);

        List<String> strings = new ArrayList<>();
        strings.add("one");
        strings.add("two");

        printElement(integers);
        printElement(doubles);
        printElement(strings);
    }
}
