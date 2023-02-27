package chapter04;

public class Java02_Object_2 {
    public static void main(String[] args) {

        Teacher t = new Teacher();
        t.name = "zhangsan";
        t.teach();

        Student s = new Student();
        s.name = "lisi";
        s.study();
    }
}
class Teacher {
    String name;
    void teach() {
        System.out.println(name + "老师在讲课");
    }
}
class Student {
    String name;
    void study() {
        System.out.println("学生" + name + "在听课");
    }
}
