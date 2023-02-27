package chapter05;

public class Java03_Object {
    public static void main(String[] args) {

        // TODO 常见类和对象
        // 数组
//        String[] nums = new String[3];
//        //nums[0] = 1;
//        for (Object num : nums) {
//            System.out.println(num);
//        }
//        String[] names = {"zhangsan", "lisi", "wangwu"};
//        System.out.println(names);
//        for (String name : names) {
//            System.out.println(name);
//        }
//        System.out.println(names.length);
        // 二维数组
        //String[][] names = {{"zhangsan", "lisi", "wangwu"}, {"zhangsan", "lisi"}, {"zhangsan"}};

        // 标准的二维数组
        String[][] namess = new String[3][3];

        namess[0][1] = "zhangsan";

        //System.out.println(namess[1][1]);
        for ( int row = 0; row < 3; row++ ) {
            for ( int col = 0; col < 3; col++ ) {
                System.out.print(namess[row][col] + "  ");
            }
            System.out.println();
        }
    }
}
