package study01;

public class Java12_Object_Extends_1 {
    public static void main(String[] args) {
        // TODO ������� - Extends - �̳�
        // �����������ຬ����ͬ�����ԣ���ô���Բ�������Ĺؼ��ֽ�������
        // super & this.
        Child1 c = new Child1();
        //System.out.println(c.name);
        c.test();

    }
}
class Parent1 {
    String name = "zhangsan";
}
class Child1 extends Parent1 {
    String name = "lisi";
    void test() {
        System.out.println(super.name);
        System.out.println(this.name);
        System.out.println(name);

    }
}
