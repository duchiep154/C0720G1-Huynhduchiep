package _quan_ly_danh_SV.common;

import _quan_ly_danh_SV.models.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {
    private static final String STUDENT_FILE="T:\\C0720G1-Huynh_duc_hiep\\module2-new\\src\\_quan_ly_danh_SV\\data\\Student.csv";
    private static final String DAU_PHAY=",";

    public static void ghiFile(List<Student> danhSach){
        File file = new File(STUDENT_FILE);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (Student element : danhSach){
                bufferedWriter.append(element.getInfor());
                bufferedWriter.append("\n");
            }

            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                if (fileWriter != null) {
                    if (bufferedWriter != null) bufferedWriter.close();
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public static List<Student> docFile(){
        List<Student> danhSach = new ArrayList<>();
        File file = new File(STUDENT_FILE);
        if (file.isFile()) {
            FileReader fileReader = null;
            BufferedReader bufferedReader = null;
            try {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                Student thongTin;
                String[] mang;
                String dong;
                while ((dong = bufferedReader.readLine()) != null) {
                    mang = dong.split(DAU_PHAY);
                    thongTin = new Student(mang[0], mang[1], mang[2], mang[3], mang[4], mang[5]);
                    danhSach.add(thongTin);
                }
            } catch (FileNotFoundException e) {
                System.out.print(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fileReader != null) {
                        if (bufferedReader != null) bufferedReader.close();
                        fileReader.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            try {
                if (file.createNewFile()) {
                    System.out.println("File đang trống");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return danhSach;
    }
}
