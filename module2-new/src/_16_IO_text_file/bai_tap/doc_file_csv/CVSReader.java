package _16_IO_text_file.bai_tap.doc_file_csv;

import java.io.*;

public class CVSReader {
    public static void main(String[] args) {

        String csvFile = "T:\\C0720G1-Huynh_duc_hiep\\module2-new\\src\\_16_IO_text_file\\bai_tap\\doc_file_csv\\danhsachquocda.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] country = line.split(cvsSplitBy);
                FileWriter myWriter = new FileWriter("filetestIOFile.txt");

                System.out.println("Country [code= " + country[4] + " , name= " + country[5] +", phone = "+country[3]+", DNS 1= " +country[0]+", DNS 2= "+country[1]+"]");

              //  myWriter.write(String.valueOf(country));
                myWriter.write("Country [code= " + country[4] + " , name= " + country[5] +", phone = "+country[3]+", DNS 1= " +country[0]+", DNS 2= "+country[1]+"]");
                myWriter.close();



            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}

