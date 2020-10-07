package Commons;

import Models.House;
import Models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFileCSV {
    public static final String HOUSE_CSV="T:\\C0720G1-Huynh_duc_hiep\\FuramaResort2\\src\\Data\\House.csv";
    public static final String VILLA_CSV ="T:\\C0720G1-Huynh_duc_hiep\\FuramaResort2\\src\\Data\\Villa.csv";
    public static final String DAU_PHAY = ",";

    public static void writeFile(String pathFile, String line) {
        try {
            FileWriter fileWriter = new FileWriter(pathFile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static List<String> readFile(String pathFile) {
        List<String> listLine = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
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
    public static void ghiFileVilla(Villa villa) throws IOException {
        File file = new File(VILLA_CSV);
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        try {
         ///   StringBuilder stringBuilder = new StringBuilder();
         //   stringBuilder.append(villa.toString());
            bufferedWriter.write(villa.toString());
            bufferedWriter.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
    public static List<Villa> docFileVilla() throws IOException {
        List<Villa> villaList = new ArrayList<>();
        File file = new File(VILLA_CSV);
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String dong = bufferedReader.readLine();
            String[] mang;
            while ((dong = bufferedReader.readLine()) != null) {
                mang = dong.split(DAU_PHAY);
                Villa villa = new Villa(mang[0], mang[1], mang[2], mang[3], mang[4], mang[5], mang[6], mang[7], mang[8], mang[9]);
                villaList.add(villa);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            assert bufferedReader != null;
            bufferedReader.close();
        }
        return villaList;
    }
    public static void ghiFileHouse(House house) throws IOException {
        File file = new File(HOUSE_CSV);
        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        try {

            bufferedWriter.write(house.toString());
            bufferedWriter.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.flush();
            bufferedWriter.close();
        }
    }
    public static List<House> docFileHouse() throws IOException {
        List<House> houseList = new ArrayList<>();
        File file = new File(HOUSE_CSV);
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String dong = bufferedReader.readLine();
            String[] mang;
            while ((dong = bufferedReader.readLine()) != null) {
                mang = dong.split(DAU_PHAY);
               House house = new House(mang[0], mang[1], mang[2], mang[3], mang[4], mang[5], mang[6], mang[7], mang[8]);
                houseList.add(house);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            assert bufferedReader != null;
            bufferedReader.close();
        }
        return houseList;

    }

}
