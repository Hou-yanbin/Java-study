//package chapter04;
//
//public class Java22_Object {
//    public static void main(String[] args) {
//
//        // TODO 面向对象 - 接口
//        // 所谓的接口，可以简单理解为规则
//        // 基本语法 ： interface 接口名称 { 规则属性，规则的行为 }
//        // 接口其实是抽象的
//        // 规则的属性必须为固定值，而且不能修改。
//        // 属性和行为的访问权限必须为公共的。
//        // 属性应该是静态的
//        // 行为应该是抽象的
//        // 接口和类是两个层面的东西
//        // 接口可以继承其他接口
//        // 类的对象需要遵循接口，在java中，这个遵循，称之为实现(implements)，类需要实现接口,而且可以实现多个接口
//        study01.Computer c = new study01.Computer();
//        study01.Light light = new study01.Light();
//        c.usb1 = light;
//        study01.Light light1 = new study01.Light();
//        c.usb2 = light1;
//        c.powerSupply();
//
//    }
//
//}
//interface USBInterface {
//
//}
//interface USBSupply extends study01.USBInterface {
//    public void powerSupply();
//}
//interface USBReceive extends study01.USBInterface {
//    public void powerReceive();
//}
//class Computer implements study01.USBSupply {
//
//    public study01.USBReceive usb1;
//    public study01.USBReceive usb2;
//
//    public void powerSupply() {
//        System.out.println("电脑提供能源");
//        usb1.powerReceive();
//        usb2.powerReceive();
//    }
//}
//class Light implements study01.USBReceive {
//    public void powerReceive() {
//        System.out.println("电灯接收能源");
//    }
//}