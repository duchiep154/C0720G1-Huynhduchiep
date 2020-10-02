package _17_io_binary_.bai_tap.option_copy_file_nhi_phan;

import java.io.*;
import java.util.Scanner;

public class CopyBinaryFile {
    public static void copyFile(String fileSource,String fileDest) throws IOException {
        InputStream inStream = null;
        OutputStream outStream = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;


        try {
            inStream = new FileInputStream(new File(fileSource));
            outStream = new FileOutputStream(new File(fileDest));
             bis=new BufferedInputStream(inStream);
             bos=new BufferedOutputStream(outStream);
            int length;
            byte[] buffer = new byte[1024];

            //1 character = 1 byte
            while ((length = bis.read(buffer)) > 0) {
                bos.write(buffer, 0, length);
                System.out.println("Số byte đã sao chép được: " + length + " bytes");
            }
            System.out.println("Đã sao chép thành công!");
            System.out.println("\nNội dung đã sao chép: ");
            for(int i = 0; i < buffer.length; i++){
                System.out.print((char)buffer[i]);
            }

            bis.close();
            bos.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inStream.close();
            outStream.close();

        }
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        System.out.printf("Enter source file:");
        String sourceFile = in.nextLine();
        System.out.printf("Enter destination file:");
        String destPath = in.nextLine();


        copyFile(sourceFile,destPath);
    }
}
// C:\Users\beut1\Downloads\JavaBinaryFileIOExamples.zip

// T:\C0720G1-Huynh_duc_hiep\module2-new\src\_17_io_binary_\ly_thuyet\JavaBinaryFileIOExamples.zip