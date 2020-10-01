package _16_IO_text_file.ly_thuyet.demo_ly_thuyet;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CharacterStream {

    public static final String FILE_PATH = "T:\\C0720G1-Huynh_duc_hiep\\module2-new\\src\\_16_IO_text_file\\ly_thuyet\\demo_ly_thuyet\\student.csv";

    public static List<Student> readFile(){
        List<Student> studentList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            BufferedReader buffReader = new BufferedReader(fileReader);
            String line;
            String[] temp;
            Student student;
            while ((line = buffReader.readLine())!=null){
                temp = line.split(",");
                student = new Student(Integer.parseInt(temp[0]),temp[1]);
                studentList.add(student);
            }
            buffReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return studentList;
    }


    public static void writeFile(Student student) {
        try {
            String line = student.getId() + "," + student.getName()+"\n";
            FileWriter fileWriter = new FileWriter(FILE_PATH,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(line);
            //bufferedWriter.newLine();

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
//        writeFile(new Student(1, "Tu"));
//        writeFile(new Student(2, "Luyen"));

        List<Student> studentList = readFile();
        for (Student student:studentList){
            System.out.println(student);
        }
    }
}
