package chapter08;

import java.io.*;

public class Java04_IO_File_Copy_Buffer {
    public static void main(String[] args){

        // TODO Java IO - 文件复制 - 缓冲

        // TODO 数据源文件对象
        File srcFile = new File("D:\\idea2022\\java-top-speed\\data\\word.txt");
        // TODO 数据目的地文件对象(自动生成)
        File destFilt = new File("D:\\idea2022\\java-top-speed\\data\\word.txt.copy");

        // TODO 文件输入流（管道对象）
        FileInputStream in = null;
        // TODO 文件输出流（管道对象）
        FileOutputStream out = null;

        // TODO 缓冲输入流（管道对象）
        BufferedInputStream buffIn = null;
        // TODO 缓冲输出流（管道对象）
        BufferedOutputStream buffOut = null;

        // TODO 缓冲区（水桶）
        byte[] cache = new byte[1024];

        try {
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(destFilt);

            buffIn = new BufferedInputStream(in);
            buffOut = new BufferedOutputStream(out);

            // TODO 打开阀门，流转数据（输入）
            //
            int data = -1;
            while ( (data = buffIn.read(cache)) != -1 ) {
                buffOut.write(cache, 0, data);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if ( buffIn != null ) {
                try {
                    buffIn.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if ( buffOut != null ) {
                try {
                    buffOut.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
