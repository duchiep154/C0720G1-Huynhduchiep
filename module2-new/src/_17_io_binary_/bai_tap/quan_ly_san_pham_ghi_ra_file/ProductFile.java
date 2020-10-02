package _17_io_binary_.bai_tap.quan_ly_san_pham_ghi_ra_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductFile {
    public static final String PRODUCT_FILE_NAME="T:\\C0720G1-Huynh_duc_hiep\\module2-new\\src\\_17_io_binary_\\bai_tap\\quan_ly_san_pham_ghi_ra_file\\ProductFile.txt";
    FileInputStream fis;
    FileOutputStream fos;
    ObjectInputStream ois;
    ObjectOutputStream oos;


    public void write(List<Product> productsList){

        try {
            fos = new FileOutputStream(new File(PRODUCT_FILE_NAME));
            oos = new ObjectOutputStream(fos);
            oos.writeObject(productsList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(oos);
        }
    }
    public List<Product> reader(){
        List<Product> productList  = new ArrayList<>();


        try {
            fis = new FileInputStream(new File(PRODUCT_FILE_NAME));
            ois = new ObjectInputStream(fis);
            productList = (List<Product>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            closeStream(fis);
            closeStream(ois);

        }
        return productList;
    }

    /**
     * close input stream
     *
     * @param is: input stream
     */
    private void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * close output stream
     *
     * @param os: output stream
     */
    private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
