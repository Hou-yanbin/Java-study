package chapter07;

import java.util.HashMap;
import java.util.Hashtable;

public class Java11_Collection_Map_2 {
    public static void main(String[] args) throws Exception  {

        // TODO 集合 - Map
        // Hashtable
        Hashtable table = new Hashtable();
        table.put(null, null);
        HashMap map = new HashMap();
        map.put(null, null);
//        table.put()
//                table.get()
//                        table.remove()
        // TODO 1. 实现方式不一样的 ： 继承父类不一样
        // TODO 2. 底层结构的容量不同： HashMap(16), Hashtable(11)
        // TODO 3. HashMap的K,V都可以为null, Hashtable的K, V不能是null
        // TODO 4. HashMap的数据定位采用的是Hash算法，但是Hashtable采用的就是hashcode
        // TODO 5. HashMap的性能较高，但是Hashtable较低

    }
}
