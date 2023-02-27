package Java07_Object_Method_Param;

public class java3 {
    public static void main(String[] args) {
        User01 user01 = new User01();
        user01.printUser(19, "jack");


    }
}
class User01{
    void printUser(int age, String... name){
        System.out.println(name+","+age);
    }
}