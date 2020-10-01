package _16_IO_text_file.ly_thuyet;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File myObj = new File("filetestIOFile");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName()+ "done");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
