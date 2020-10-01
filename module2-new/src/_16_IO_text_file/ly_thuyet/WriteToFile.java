package _16_IO_text_file.ly_thuyet;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("filetestIOFile.txt");
            myWriter.write("ghi bất cứ gì vào đây");
            myWriter.close();
            System.out.println("hoàn thành ghi file");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
