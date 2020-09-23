package _11_danh_sach_stack_queue.ly_thuyet;

public class MyMap<K, V> {
    private K key;
    private V value;

    public MyMap(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        //1 : one
        MyMap<Integer, String> myMap_1 = new MyMap<>(1, "one");

        //"two" : 2
        MyMap<String, Integer> myMap_2 = new MyMap<>("two", 2);

        System.out.println("MyMap1: key: " + myMap_1.getKey() +" value: " + myMap_1.getValue() );
        System.out.println("MyMap2: key: " + myMap_2.getKey() +" value: " + myMap_2.getValue() );

    }
}
