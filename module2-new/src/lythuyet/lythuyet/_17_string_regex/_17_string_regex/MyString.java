package _17_string_regex;

public class MyString {
    public static void main(String[] args) {
//        String str1 = "a";
////        String str2 = "a";
////
////        if(str1 == str2){
////            System.out.println("OK");
////        } else {
////            System.out.println("NG");
////        }
////
////        String str3 = new String("a");
////        String str4 = new String("a");
////        if(str3 == str4){
////            System.out.println("OK");
////        } else {
////            System.out.println("NG");
////        }

        String str1 = new String("a");
        String str2 = str1;
        str2 += "b";
        System.out.println(str1); //ab
        System.out.println(str2); //ab

        StringBuilder str3 = new StringBuilder("a");
        StringBuilder str4 = str3;
        str4.append("b");
        System.out.println(str3); //a
        System.out.println(str4); //ab
    }
}
