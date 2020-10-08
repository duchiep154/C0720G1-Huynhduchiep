package commons;

import models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFileCSV {
    public static final String HOUSE_CSV = "T:\\C0720G1-Huynh_duc_hiep\\FuramaResort2\\src\\Data\\House.csv";
    public static final String VILLA_CSV = "T:\\C0720G1-Huynh_duc_hiep\\FuramaResort2\\src\\Data\\Villa.csv";
    public static final String ROOM_CSV = "T:\\C0720G1-Huynh_duc_hiep\\FuramaResort2\\src\\Data\\Room.csv";
    public static final String CUSTOMER_CSV="T:\\C0720G1-Huynh_duc_hiep\\FuramaResort2\\src\\Data\\Customer.csv";
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

    public static void ghiFile(Services service) throws IOException {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;


        try {
            StringBuilder stringBuilder = new StringBuilder();
            if (service instanceof Villa) {
                File file = new File(VILLA_CSV);
                fileWriter = new FileWriter(file, true);
                bufferedWriter = new BufferedWriter(fileWriter);
                Villa villa = (Villa) service;
                stringBuilder.append(villa.getId()).append(DAU_PHAY).append(villa.getTenDichVu()).append(DAU_PHAY).append(villa.getDienTichSuDung()).append(DAU_PHAY).append(villa.getGiaThue()).append(DAU_PHAY).append(villa.getSoLuongNguoiThue()).append(DAU_PHAY).append(villa.getKieuThue()).append(DAU_PHAY).append(villa.getTieuChuanPhong()).append(DAU_PHAY).append(villa.getMoTaTienNghiKhac()).append(DAU_PHAY).append(villa.getDienTichHoBoi()).append(DAU_PHAY).append(villa.getSoTang());
                bufferedWriter.write(stringBuilder.toString());
                bufferedWriter.write("\n");
            }
            if (service instanceof House) {
                File file = new File(HOUSE_CSV);
                fileWriter = new FileWriter(file, true);
                bufferedWriter = new BufferedWriter(fileWriter);
                House house = (House) service;
                stringBuilder.append(house.getId()).append(DAU_PHAY).append(house.getTenDichVu()).append(DAU_PHAY).append(house.getDienTichSuDung()).append(DAU_PHAY).append(house.getGiaThue()).append(DAU_PHAY).append(house.getSoLuongNguoiThue()).append(DAU_PHAY).append(house.getKieuThue()).append(DAU_PHAY).append(house.getTieuChuanPhong()).append(DAU_PHAY).append(house.getMoTaTienNghiKhac()).append(DAU_PHAY).append(house.getSoTang());
                bufferedWriter.write(stringBuilder.toString());
                bufferedWriter.write("\n");
            }
            if (service instanceof Room) {
                File file = new File(ROOM_CSV);
                fileWriter = new FileWriter(file, true);
                bufferedWriter = new BufferedWriter(fileWriter);
                Room room = (Room) service;

              //  ExtraServices extraServices=
                stringBuilder.append(room.getId()).append(DAU_PHAY).append(room.getTenDichVu()).append(DAU_PHAY).append(room.getDienTichSuDung()).append(DAU_PHAY).append(room.getGiaThue()).append(DAU_PHAY).append(room.getSoLuongNguoiThue()).append(DAU_PHAY).append(room.getKieuThue()).append(DAU_PHAY).append(room.getExtraServices().getDichVuDiKem()).append(DAU_PHAY).append(room.getExtraServices().getDonVi()).append(DAU_PHAY).append(room.getExtraServices().getGiaTien());
                bufferedWriter.write(stringBuilder.toString());
                bufferedWriter.write("\n");
            }
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

    public static List<Room> docFileRoom() throws IOException {
        List<Room> roomList = new ArrayList<>();
        File file = new File(ROOM_CSV);
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String dong = bufferedReader.readLine();
            String[] mang;
            while ((dong = bufferedReader.readLine()) != null) {
                mang = dong.split(DAU_PHAY);
                ExtraServices extraServices=new ExtraServices(mang[6],mang[7],mang[8]);
                Room room = new Room(mang[0], mang[1], mang[2], mang[3], mang[4], mang[5],extraServices);
                roomList.add(room);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            assert bufferedReader != null;
            bufferedReader.close();
        }
        return roomList;

    }
    public static void ghiFileCustomer(Customer customer) throws IOException {
        File file=new File(CUSTOMER_CSV);

        FileWriter fileWriter = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(customer.getHoTen()).append(DAU_PHAY).append(customer.getNgaySinh()).append(DAU_PHAY).append(customer.getGioiTinh()).append(DAU_PHAY).append(customer.getCmnd()).append(DAU_PHAY).append(customer.getSoDT()).append(DAU_PHAY).append(customer.getEmail()).append(DAU_PHAY).append(customer.getLoaiKhach()).append(DAU_PHAY).append(customer.getDiaChi());
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.flush();
            bufferedWriter.close();
        }

    }
    public static List<Customer> docFileCustomer() throws IOException {
        List<Customer> customerList = new ArrayList<>();
        File file = new File(CUSTOMER_CSV);
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String dong = bufferedReader.readLine();
            String[] mang;
            while ((dong = bufferedReader.readLine()) != null) {
                mang = dong.split(DAU_PHAY);
                Customer customer = new Customer(mang[0], mang[1], mang[2], mang[3], mang[4], mang[5], mang[6], mang[7]);
                customerList.add(customer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            assert bufferedReader != null;
            bufferedReader.close();
        }
        return customerList;

    }



}

