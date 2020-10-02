package _16_IO_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    static void writeFile(String fileCopyNguon){
        try{
            Scanner scanner=new Scanner(System.in);
            System.out.println("mời nhập nội dung cần ghi vào file");
            String noiDungFile =scanner.nextLine();

            //đường dẫn file nguồn
            File file =new File("//T:\\C0720G1-Huynh_duc_hiep\\module2-new\\src\\_16_IO_text_file\\bai_tap\\copy_file_text\\fileCopyNguon.txt");

            /* kiểm tra file đã tồn tại chưa nếu chưa thì tạo file mới
             */
            if(!file.exists()){
                file.createNewFile();
            }

            //viết thêm nội dung vào tệp
            FileWriter ghiFile = new FileWriter(file,true);
            BufferedWriter demGhiFile = new BufferedWriter(ghiFile);
           // ghi file = filewriter
//            demGhiFile.write(noiDungFile);
//            demGhiFile.newLine();
//            demGhiFile.close();

            // ghi file = printwriter
            PrintWriter inGhiFile = new PrintWriter(demGhiFile);
            inGhiFile.println("");
            inGhiFile.println(noiDungFile);
            inGhiFile.close();

            System.out.println("đã hoàn thành ghi nội dung vào file");

        }catch(IOException ioe){
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }

    }


    static void copyFile(String fileCopyNguon, String fileCopyDich) {
        //Đọc từng dòng của File cần sao chép
        try (BufferedReader input = new BufferedReader(new FileReader(fileCopyNguon))) {

            //Ghi chép nội dung vào file đích; chép vào text
            try (BufferedWriter output = new BufferedWriter(new FileWriter(fileCopyDich))) {
                String text = null;
                while ((text = input.readLine()) != null) {
                    System.out.println(text);
                    output.write(text);
                    output.newLine();
                }
            }
            System.out.println("Thông báo: Đã sao chép Xong");
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
// tệp nguồn
//T:\C0720G1-Huynh_duc_hiep\module2-new\src\_16_IO_text_file\bai_tap\copy_file_text\fileCopyNguon.txt
// tệp đích
//T:\C0720G1-Huynh_duc_hiep\module2-new\src\_16_IO_text_file\bai_tap\copy_file_text\fileCopyDich.txt