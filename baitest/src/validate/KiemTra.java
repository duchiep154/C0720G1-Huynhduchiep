package validate;

import java.util.Scanner;

public class KiemTra {
    static Scanner input=new Scanner(System.in);
    private static final String REGEX_TEN ="^[\\w\\s]{4,50}$";
    private static final String REGEX_NGAYSINH = "^((0[1-9])|([1-2][0-9])|(3[0-1]))[/]((0[1-9])|(1[0-2]))[/]((19[0-9]{2})|(200[0-2]))$";
    private static final String REGEX_SODIENTHOAI = "^090\\d{7}$|091\\d{7}$";
    public static boolean kiemTraSoNguyen(String chon) {
        return chon.matches("^\\d+");
    }
    public static String kiemTraHoTen() throws TenException {
        String hoTen;
        do {
            try{
                System.out.print("Nhập Họ và Tên sinh viên: ");
                hoTen = input.nextLine();
                //^[A-Z]([a-z]*)([\s][A-Z]([a-z]*))+$ : Họ Tên Không Dấu
                if (hoTen.matches(REGEX_TEN)){
                    break;
                }else throw new  TenException("ten ko hop le");
            }catch (TenException e){
                System.out.println("loi"+ e.getMessage());

            }

        } while (true);
        return hoTen;
    }
    public static String kiemTraNgaySinh() throws NgaySinhException {
        String ngaySinh;
        do {
            try{
                System.out.print("Nhập ngày tháng năm sinh: ");
                ngaySinh = input.nextLine();
                if (ngaySinh.matches(REGEX_NGAYSINH)){
                    break;
                } else throw new NgaySinhException("ngay sinh ko hop le") ;

            }catch (NgaySinhException e){
                System.out.println("nhap sai vui long nhap lai");
            }

        } while (true);
        return ngaySinh;
    }
    public static String kiemTraSoDT() throws SoDienThoaiException {
        String soDT;
        do {
            try {
                System.out.println("nhap so dt ");
                soDT=input.nextLine();
                if (soDT.matches(REGEX_SODIENTHOAI)){
                    break;

                }else throw new SoDienThoaiException();

            }catch (SoDienThoaiException e){
                System.out.println( "nhap sai vui long nhap lai");

            }


        }while (true);
        return soDT;
    }
}
