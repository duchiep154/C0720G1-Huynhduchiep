package _quan_ly_danh_SV.common;

import _quan_ly_danh_SV.models.Student;

import java.util.Comparator;

public class SapXeptheoten implements Comparator<Student> {
    private static final String DAU_CACH = " ";
    public static String getLastNameIndex(String name) {
        int lastNameIndex = name.lastIndexOf(DAU_CACH) + 1;
        String tenSV = name.substring(lastNameIndex);
        return tenSV;
    }

    public static int getBirthYear(String birthday){
        int birthYear = Integer.parseInt(birthday.substring(6));
        return birthYear;
    }




    @Override
    public int compare(Student student1, Student student2) {
        String tenSV1=getLastNameIndex(student1.getHoTen());
        String tenSV2=getLastNameIndex(student2.getHoTen());
        int soSanhTen = tenSV1.compareTo(tenSV2);
        if(soSanhTen == 0) {
            int birthYear1 = getBirthYear(student1.getNgaySinh());
            int birthYear2 = getBirthYear(student2.getNgaySinh());
            return birthYear1 - birthYear2;
        }
        return soSanhTen;
    }
}
