package chapter07;

import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;

public class Java11_Collection_Map {
    public static void main(String[] args) throws Exception  {

        // TODO 集合 - Map
        // HashMap : Hash + Map
        // 数据存储是无序
        HashMap map = new HashMap();

        // 添加数据:put
        // 修改数据，put方法也可以修改数据，返回值就是被修改的值
        map.put("zhangsan", "1");
        System.out.println(map.put("zhangsan", "4"));
        map.put("lisi", "2");
        map.put("wangwu", "3");

        // TODO 查询数据
        System.out.println(map.get("zhangsan"));

        // TODO 删除数据
        map.remove("zhangsan");

        System.out.println(map);

    }
}
