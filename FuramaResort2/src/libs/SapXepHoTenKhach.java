package libs;

import models.Customer;

import java.util.Comparator;

public class SapXepHoTenKhach implements Comparator<Customer> {

    private static final String DAU_CACH = " ";
    public static String getLastNameIndex(String name) {
        int lastNameIndex = name.lastIndexOf(DAU_CACH) + 1;
        String tenkhach = name.substring(lastNameIndex);
        return tenkhach;
    }

    public static int getBirthYear(String birthday){
        int birthYear = Integer.parseInt(birthday.substring(6));
        return birthYear;
    }


    @Override
    public int compare(Customer customer1, Customer customer2) {
        String tenKhach1 = getLastNameIndex(customer1.getHoTen());
        String tenKhach2 = getLastNameIndex(customer2.getHoTen());
        int soSanhTen = tenKhach1.compareTo(tenKhach2);
        if(soSanhTen == 0) {
            int birthYear1 = getBirthYear(customer1.getNgaySinh());
            int birthYear2 = getBirthYear(customer2.getNgaySinh());
            return birthYear1 - birthYear2;
        }
        return soSanhTen;
    }
}
