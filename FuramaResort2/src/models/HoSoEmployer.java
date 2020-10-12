package models;
/*Task 11: (Sử dụng Stack)
Bộ phận nhân sự của Furama cần 1 cái tủ để đựng hồ sơ của nhân viên. Khi có nhân viên nào muốn tìm hồ sơ của mình thì bộ phận nhân sự sẽ lục trong tủ hồ sơ
Thực hiện yêu cầu sau:
1.	Tạo  một class là Tủ Hồ Sơ
2.	Sau đó dùng Stack để lưu trữ các hồ sơ
3.	Viết một hàm tìm kiếm hồ sơ nhân viên
*/

import commons.DocGhiFileCSV;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.Stack;

public class HoSoEmployer {
    public static Stack<Employer> stack=new Stack<>();



    public HoSoEmployer() throws IOException {
        List<Employer> employeeList = DocGhiFileCSV.docFileEmployer();
        for(Employer element : employeeList){
            stack.push(element);
        }
    }


}
