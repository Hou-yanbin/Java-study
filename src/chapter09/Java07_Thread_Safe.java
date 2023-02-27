package chapter09;

public class Java07_Thread_Safe {
    public static void main(String[] args) throws Exception {

        // TODO 线程安全
        // 所谓的线程安全问题，其实就是多个线程在并发执行时，修改了共享内存中共享对象的属性，导致的数据冲突问题
        User7 user = new User7();

        Thread t1 = new Thread(()->{
            user.name = "zhangsan";
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(user.name);
        });
        Thread t2 = new Thread(()->{
            user.name = "lisi";
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(user.name);
        });
        t1.start();
        t2.start();

        System.out.println("main线程执行完毕");


    }
}
class User7 {
    public String name;
}
