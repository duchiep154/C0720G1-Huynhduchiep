package common;

import controller.MainController;
import models.GiaoVien;
import models.LopHoc;
import models.SinhVien;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileUntil {
    private static final String SINH_VIEN_FILE="T:\\C0720G1-Huynh_duc_hiep\\baitest\\src\\data\\SinhVien.csv";
    private static final String LOP_HOC_FILE="T:\\C0720G1-Huynh_duc_hiep\\baitest\\src\\data\\LopHoc.csv";
    private static final String GIAO_VIEN_FILE="T:\\C0720G1-Huynh_duc_hiep\\baitest\\src\\data\\GiaoVien.csv";
    private static final String DAU_PHAY=",";



    public static void writeFile(String duongDanFile, List<String> listLine) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter(duongDanFile);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String line: listLine) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFile(String pathFile) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        List<String> listLine = new ArrayList<>();
        try {
            fileReader = new FileReader(pathFile);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                listLine.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listLine;
    }
    public static List<GiaoVien> docFileGV(){
        List<GiaoVien> danhSachGV = new ArrayList<>();
        File file = new File(GIAO_VIEN_FILE);
        if (file.isFile()) {
            FileReader fileReader = null;
            BufferedReader bufferedReader = null;
            try {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                GiaoVien giaoVien;
                String[] mang;
                String dong;
                while ((dong = bufferedReader.readLine()) != null) {
                    mang = dong.split(DAU_PHAY);
                    giaoVien = new GiaoVien(Integer.parseInt(mang[0]), mang[1], mang[2], mang[3], mang[4]);
                    danhSachGV.add(giaoVien);
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
        return danhSachGV;
    }
    public static List<SinhVien> docFileSV(){
        List<SinhVien> danhSachSV = new ArrayList<>();
        File file = new File(SINH_VIEN_FILE);
        if (file.isFile()) {
            FileReader fileReader = null;
            BufferedReader bufferedReader = null;
            try {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                 SinhVien sinhVien;
                String[] mang;
                String dong;
                while ((dong = bufferedReader.readLine()) != null) {
                    mang = dong.split(DAU_PHAY);
                    sinhVien = new SinhVien(Integer.parseInt(mang[0]), mang[1], mang[2], mang[3], mang[4],Integer.parseInt(mang[5]));
                    danhSachSV.add(sinhVien);
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
        return danhSachSV;
    }
    public static List<LopHoc> docFileLopHoc(){
        List<LopHoc> danhSachLopHoc = new ArrayList<>();
        File file = new File(LOP_HOC_FILE);
        if (file.isFile()) {
            FileReader fileReader = null;
            BufferedReader bufferedReader = null;
            try {
                fileReader = new FileReader(file);
                bufferedReader = new BufferedReader(fileReader);
                LopHoc lopHoc;
                String[] mang;
                String dong;
                while ((dong = bufferedReader.readLine()) != null) {
                    mang = dong.split(DAU_PHAY);
                    lopHoc = new LopHoc(Integer.parseInt(mang[0]),mang[1],mang[2]);
                    danhSachLopHoc.add(lopHoc);
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
        return danhSachLopHoc;
    }
    public static void ghiFile(List<SinhVien> danhSachSV){
        File file = new File(SINH_VIEN_FILE);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (SinhVien element : danhSachSV){
                bufferedWriter.append(element.hienThiThongTin());
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



}
