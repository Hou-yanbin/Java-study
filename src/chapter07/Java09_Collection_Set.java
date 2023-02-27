package chapter07;

import java.util.ArrayList;
import java.util.HashSet;

public class Java09_Collection_Set {
    public static void main(String[] args) {

        // TODO 集合 - Collection - Set
        // HashSet : Hash + Set
        // Hash : 哈希算法，散列算法
        // ArrayList : 数组
        // LinkedList :
        HashSet set = new HashSet();
        // TODo 增加数据
        set.add("zhangsan");
        set.add("zhangsan");
        set.add("lisi");
        set.add("wangwu");

        // TODo 修改数据

        // TODo 删除数据
        //set.remove("wangwu");

        // TODo 查询数据
        for (Object o : set) {
            System.out.println(o);
        }

        System.out.println(set);
    }
}
