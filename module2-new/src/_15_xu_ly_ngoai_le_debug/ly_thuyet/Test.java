package _15_xu_ly_ngoai_le_debug.ly_thuyet;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) {
        Demo  demo = new Demo();
        try {
            demo.readMyFile_2();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
