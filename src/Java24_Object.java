public class Java24_Object {
    public static void main(String[] args) {
        Me me = new Me();
        me.sayHello(new Zhangsan());
    }

}

abstract class Person24{
public abstract String name();

}
class Me{
    public void sayHello(Person24 person){
        System.out.println("hello ..." + person.name());
    }
}

class Zhangsan extends Person24{
    public String name(){
        return "zhangsan";
    }
}