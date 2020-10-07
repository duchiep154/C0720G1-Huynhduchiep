package Models;
//-	Riêng Phòng sẽ có thêm thông tin: Dịch vụ miễn phí đi kèm.

public class Room extends Services {
    ExtraServices extraServices;

    public Room(String id, String tenDichVu, String dienTichSuDung, String giaThue, String soLuongNguoiThue, String kieuThue, ExtraServices extraServices) {
        super(id, tenDichVu, dienTichSuDung, giaThue, soLuongNguoiThue, kieuThue);
        this.extraServices = extraServices;
    }

    @Override
    public String toString() {
        return "Room{" +
                ", id='" + id + '\'' +
                ", tenDichVu='" + tenDichVu + '\'' +
                ", dienTichSuDung='" + dienTichSuDung + '\'' +
                ", giaThue='" + giaThue + '\'' +
                ", soLuongNguoiThue='" + soLuongNguoiThue + '\'' +
                ", kieuThue='" + kieuThue + '\'' +
                ", extraServices=" + extraServices +
                '}';
    }

    public ExtraServices getExtraServices() {
        return extraServices;
    }

    public void setExtraServices(ExtraServices extraServices) {
        this.extraServices = extraServices;
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());

    }
}
