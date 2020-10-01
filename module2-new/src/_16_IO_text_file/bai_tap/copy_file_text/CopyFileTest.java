package _16_IO_text_file.bai_tap.copy_file_text;

import java.util.Scanner;

public class CopyFileTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập File cần sao chép: ");
        String fileNguon = scanner.nextLine();

       // CopyFile.writeFile(fileNguon);

        System.out.println("Nhập địa chỉ cần sao chép đến File: ");
        String fileDich = scanner.nextLine();

        System.out.println("\nKết quả sau khi sao chép dữ liệu  là: ");
        CopyFile.copyFile(fileNguon, fileDich);
    }
}
// tệp nguồn
//T:\C0720G1-Huynh_duc_hiep\module2-new\src\_16_IO_text_file\bai_tap\copy_file_text\fileCopyNguon.txt
// tệp đích
//T:\C0720G1-Huynh_duc_hiep\module2-new\src\_16_IO_text_file\bai_tap\copy_file_text\fileCopyDich.txt

