package chapter05;

public class Java03_Object_Test {
    public static void main(String[] args) {

        // TODO 常见类和对象
        // 二维数组
        /*

          九层妖塔
            *
           ***
          *****
         *******
         */
        // 1 => 1
        // 2 => 3
        // 3 => 5
        // 4 => 7

        // 1 => 0
        // 2 => 1
        // 3 => 2
        // 4 => 3

        // 0 =>   8
        // 1 =>  789
        // 2 => 678910

        int row = 9;
        int col = 2 * (row - 1) + 1;

        String[][] nineTower = new String[row][col];

        for ( int i = 0; i < row; i++ ) {
            for ( int j = 0; j < col; j++ ) {
                if ( j >= ( row - 1 ) - i && j <= ( row - 1 ) + i  ) {
                    nineTower[i][j] = "*";
                } else {
                    nineTower[i][j] = " ";
                }
            }
        }

        for ( int i = 0; i < row; i++ ) {
            for ( int j = 0; j < col; j++ ) {
                System.out.print(nineTower[i][j]);
            }
            System.out.println();
        }
    }
}
