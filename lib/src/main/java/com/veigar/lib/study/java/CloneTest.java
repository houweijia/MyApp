package com.veigar.lib.study.java;

/**
 * @description:浅拷贝 深拷贝
 * @author: houwj
 * @date: 2020/12/16
 */
public class CloneTest {
    public static void main(String[] args) {
        People people = new People();
        people.age = 1;
        people.name = "veigar";

        People cPeople = (People) people.clone();
        people.name = "二号";
        System.out.println("people=="+people.name);
        System.out.println("cPeople=="+cPeople.name);
    }


    public static class People implements Cloneable {
        int age;
        String name;

        @Override
        protected Object clone() {
            try {
                return super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            return null;

        }
    }

//    public static class People  {
//        int age;
//        String name;
//
//    }
}
