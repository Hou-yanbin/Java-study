package study01;

import java.util.HashSet;

public class HashCodeorEquals {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        User9 user1 = new User9();
        user1.setId(1001);
        user1.setName("zhangsan");
        System.out.println(user1.hashCode());

        User9 user2 = new User9();
        user2.setId(1001);
        user2.setName("wangwu");
        System.out.println(user2.hashCode());

        User9 user3 = new User9();
        user3.setId(1002);
        user3.setName("lisi");
        System.out.println(user3.hashCode());

        set.add(user1);
        set.add(user2);
        set.add(user3);

        System.out.println(set);

    }
}

