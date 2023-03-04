package study01;

import java.util.Objects;

public class User9 {

    public int id;
    public String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public boolean equals(Object o) {
//        System.out.println("User equals()....");
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User9 user9 = (User9) o;
//        return id == user9.id && Objects.equals(name, user9.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);  //��ͬ������ֵ�Ĺ�ϣֵһ��
//    }


    @Override
    public boolean equals(Object o) {
        System.out.println("User equals()....");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User9 user9 = (User9) o;
        return id == user9.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);//���ص�id 1032 1032 1033 ��ԭUser set��ֵ��ͬ
//        return id;//���ص�id 1001 1002 1003 ��ԭUser set��ֵһ��
    }

    @Override
    public String toString() {
        return "User9{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}




