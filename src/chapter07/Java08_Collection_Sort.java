package chapter07;

import java.util.ArrayList;
import java.util.Comparator;

public class Java08_Collection_Sort {
    public static void main(String[] args) {

        // TODO 集合 - Collection - List
        // Sort排序
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(3);
        list.add(2);
        // 1,3,2

        // 1,2,3

        // List对象进行排序，需要传递一个实现了比较器接口的对象
        list.sort(new NumberComparator());

        System.out.println(list);
    }
}
class NumberComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if ( o1 < o2 ) {
            return 1;
        } else if ( o1 == o2 ) {
            return 0;
        } else {
            return -1;
        }
    }
}
