package chapter07;

import java.util.*;

public class Java12_Collection_Map_3 {
    public static void main(String[] args) throws Exception  {

        // TODO 集合 - 问题
        // 1. java.lang.IllegalArgumentException
        //    设定集合容量时，如果参数为负数，就会发生错误
        //ArrayList list = new ArrayList(-1);

        // 2. java.util.NoSuchElementException
        //    从链表结构中获取数据，如果没有数据的场合，那么会发生异常
        //LinkedList list = new LinkedList();
        //System.out.println(list.getFirst());

        // 3. java.lang.IndexOutOfBoundsException
        // 从集合中获取数据，索引不是按照底层的数据结构设定，而是按照数据的个数决定
//        ArrayList list = new ArrayList();
//        list.add("zhangsan");
//        list.get(3);

        // 4 java.util.ConcurrentModificationException
        // 对Map集合进行操作过程中，对数据进行了修改，就会发生错误。
        HashMap map = new HashMap();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");

        Set set = map.keySet();
        for ( Object key : set ) {
            if ( "b".equals(key) ) {
                map.remove(key);
            }
            System.out.println(map.get(key));
        }


    }
}
