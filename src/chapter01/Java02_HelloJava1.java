package chapter01;

import java.io.*;

public class Java02_HelloJava1 {
    public static void main(String[] args) {
        // TODO 文件复制
        File objectFile = new File("D:\\idea2022\\java-top-speed\\data\\object.dat");

        ObjectInputStream objIn = null;
        FileInputStream fileIn = null;
        try {
            fileIn = new FileInputStream(objectFile);
            objIn = new ObjectInputStream(fileIn);
            Object o = objIn.readObject();
            System.out.println(o);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if ( objIn != null ) {
                try {
                    objIn.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
class XXX implements Serializable {

}
