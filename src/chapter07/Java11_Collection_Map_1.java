package chapter07;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Java11_Collection_Map_1 {
    public static void main(String[] args) throws Exception  {

        // TODO 集合 - Map
        HashMap<String, String> map = new HashMap();

        // 添加数据
        // 修改数据
//        map.put("a", "0");
//        Object oldVal = map.put("a", "1");
//        //System.out.println(oldVal);
//        // 添加数据
//        map.putIfAbsent("b", "2");
//        map.putIfAbsent("b", "3");
//
//        Object b = map.replace("c", "4");
//        System.out.println(b);

        map.clear();
        map.put("zhangsan", "1");
        map.put("lisi", "2");
        map.put("wangwu", "3");

        // TODO 获取map集合中所有的key
//        Set set = map.keySet();
//        for (Object k : set) {
//            System.out.println(map.get(k));
//        }
//        System.out.println(map.containsKey("zhangsan"));
//
//        Collection values = map.values();
//        map.containsValue("1")
//
//        System.out.println(map);

        // TODO 获取键值对对象
//        Set<Map.Entry<String, String>> entries = map.entrySet();
//        for (Map.Entry<String, String> entry : entries) {
//            System.out.println(entry.getKey() + "=" + entry.getValue());
//        }

//        map.remove("zhangsan");
        map.remove("zhangsan", "1");

//        map.size()
//                map.isEmpty()
//                        map.clear();
//        map.clone()

        System.out.println(map);

    }
}
