package chapter08;

import java.io.File;

public class Java02_IO_File {
    public static void main(String[] args) throws Exception{

        // TODO Java IO - 文件流

        // TODO File : 文件类型（文件，文件夹），属于java.io
        // 创建文件对象, 使用文件路径关联系统文件
        String filePath = "D:\\idea2022\\java-top-speed\\data";
        File file = new File(filePath);
        System.out.println(file);
        // 文件对象的操作
//        // TODO 判断当前文件对象是否为文件
//        System.out.println(file.isFile());
//        // TODO 判断当前文件对象是否为文件夹
//        System.out.println(file.isDirectory());
//        // TODO 判断文件对象是否存在关联
//        System.out.println(file.exists());

        if ( file.exists() ) {
            // TODO 文件对象存在的情况
            System.out.println("文件对象存在");
            if (file.isFile()) {
                System.out.println("文件对象关联的是一个文件");
                System.out.println(file.getName());
                System.out.println(file.length());
                System.out.println(file.lastModified());
                System.out.println(file.getAbsolutePath());
            } else if ( file.isDirectory() ) {
                System.out.println("文件对象关联的是一个文件夹");
                System.out.println(file.getName());
                System.out.println(file.lastModified());
                System.out.println(file.getAbsolutePath());
                String[] list = file.list();
                System.out.println("文件夹中的文件：");
                for (String s : list) {
                    System.out.println(s);
                }
                System.out.println("文件夹中的文件对象：");
                File[] files = file.listFiles();
                for (File s : files) {
                    System.out.println(s);
                }
            }
        } else {
            // TODO 文件对象不存在的情况
            System.out.println("文件对象不存在，没有关联成功");
            // TODO 创建多级文件目录
            //file.mkdirs();
            // TODO 创建新文件
            //file.createNewFile();
        }
    }
}
