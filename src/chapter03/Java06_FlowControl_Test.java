package chapter03;

public class Java06_FlowControl_Test {
    public static void main(String[] args) {

        // TODO 流程控制 - 小练习
        // 九层妖塔
        /*
              *
             ***
            *****
           *******

           4 => 0 -> 3
           4 => 1 -> 2
           4 => 2 -> 1


         */
        /*
        // 打印第一层的数据
        for (int i = 0; i < 1; i++) {
            System.out.print("*");
        }
        System.out.println("");
        // 打印第二层的数据
        // println方法打印字符串之后，会自动添加换行符
        // print方法打印字符串后，不换行
        for (int i = 0; i < 3; i++) {
            System.out.print("*");
        }
        System.out.println("");
        // 打印第三层的数据
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }
        System.out.println("");
        // 打印第四层的数据
        for (int i = 0; i < 7; i++) {
            System.out.print("*");
        }
        System.out.println("");

         */
        // 0 -> 1
        // 1 -> 3
        // 2 -> 5
        // 3 -> 7
        // 4 -> 9
        int level = 3;
        for ( int j = 0; j < level; j++ ) {
            for ( int i = 0; i < (level-1) - j; i++ ) {
                System.out.print(" ");
            }
            for (int i = 0; i < j * 2 + 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
