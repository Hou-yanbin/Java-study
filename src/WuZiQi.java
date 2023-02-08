import java.util.Scanner;

public class WuZiQi {
    static int[][] map = new int[32][32];
    static int line = '0';
    static int white = '1';
    static int black = '2';

    public static void main(String[] args) {
        System.out.println("五子棋");
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        WuZiQi wu = new WuZiQi();
        for (int i = 0; i <map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = sc.nextInt();
            }

            if (flag) {
                if (wu.Judge(map) == 1 || wu.Judge(map) == 2) {
                    System.out.println("true");

                } else
                    System.out.println("flase");
            }
        }
    }

        //判断输赢
        public static int Judge(int[][] map){
            int result = 0;    //返回结果
            //逐行扫描
            for (int i = 0; i < map.length; i++) {
                int count = 1;
                int value = map[i][0];
                for (int j = 1; j < 10; j++) {
                    if (map[i][j] == value) {
                        count++;
                    }
                    if (map[i][j] != value) {
                        count = 1;
                        value = map[i][j];
                    }
                    if (count == 5 && value == black) {    //5个1相连
                        result = 1;
                    }
                    if (count == 5 && value == white) {    //5个2相连
                        result = 2;
                    }
                }
            }
            //逐列扫描
            for (int j = 0; j < map.length; j++) {
                int count = 1;
                int value = map[j][0];
                for (int i = 1; i < 10; i++) {
                    if (map[i][j] == value) {
                        count++;
                    }
                    if (map[i][j] != value) {
                        count = 1;
                        value = map[i][j];
                    }
                    if (count == 5 && value == black) {    //5个1相连
                        result = 1;
                    }
                    if (count == 5 && value == white) {    //5个2相连
                        result = 2;
                    }
                }
            }
            //斜线扫描
            for (int i = 0; i < map.length - 4; i++) {
                int count = 1;
                int value = map[0][i];
                int x = 0;
                int y = i;
                for (int j = 1; j < map.length - i; j++, x++, y++) {
                    if (map[x + 1][y + 1] == value) {
                        count++;
                    }
                    if (map[x + 1][y + 1] != value) {
                        count = 1;
                        value = map[x + 1][y + 1];
                    }
                    if (count == 5 && value == black) {    //5个1相连
                        result = 1;
                    }
                    if (count == 5 && value == white) {    //5个2相连
                        result = 2;
                    }
                }
            }
            for (int i = 1; i < map.length - 4; i++) {
                int count = 1;
                int value = map[i][0];
                int x = i;
                int y = 0;
                for (int j = 1; j < map.length - i; j++, x++, y++) {
                    if (map[x + 1][y + 1] == value) {
                        count++;
                    }
                    if (map[x + 1][y + 1] != value) {
                        count = 1;
                        value = map[x + 1][y + 1];
                    }
                    if (count == 5 && value == black) {    //5个1相连
                        result = 1;
                    }
                    if (count == 5 && value == white) {    //5个2相连
                        result = 2;
                    }
                }
            }
            return result;
        }
    }

