package study01;

public class Java22_Object {
    public static void main(String[] args) {

        // TODO ������� - �ӿ�
        // ��ν�Ľӿڣ����Լ����Ϊ����
        // �����﷨ �� interface �ӿ����� { �������ԣ��������Ϊ }
        // �ӿ���ʵ�ǳ����
        // ��������Ա���Ϊ�̶�ֵ�����Ҳ����޸ġ�
        // ���Ժ���Ϊ�ķ���Ȩ�ޱ���Ϊ�����ġ�
        // ����Ӧ���Ǿ�̬��
        // ��ΪӦ���ǳ����
        // �ӿں�������������Ķ���
        // �ӿڿ��Լ̳������ӿ�
        // ��Ķ�����Ҫ��ѭ�ӿڣ���java�У������ѭ����֮Ϊʵ��(implements)������Ҫʵ�ֽӿ�,���ҿ���ʵ�ֶ���ӿ�
        Computer c = new Computer();
        Light light = new Light();
        c.usb1 = light;
        Light light1 = new Light();
        c.usb2 = light1;
        c.powerSupply();

    }

}
interface USBInterface {

}
interface USBSupply extends USBInterface {
    public void powerSupply();
}
interface USBReceive extends USBInterface {
    public void powerReceive();
}
class Computer implements USBSupply {

    public USBReceive usb1;//
    public USBReceive usb2;

    public void powerSupply() {
        System.out.println("�����ṩ��Դ");
        usb1.powerReceive();
        usb2.powerReceive();
    }
}
class Light implements USBReceive {
    public void powerReceive() {
        System.out.println("��ƽ�����Դ");
    }
}