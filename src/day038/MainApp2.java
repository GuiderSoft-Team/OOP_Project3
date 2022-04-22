package day038;

import day039.oys.A;

import java.util.Arrays;


public class MainApp2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Ikili[] ikililer={
                new Ikili(5,4),
                new Ikili(7,8),
                new Ikili(1,5),
                new Ikili(11,6),
                new Ikili(4,4)
        };


        Ikili ikili2= (Ikili) ikililer[0].clone();
        ikili2.setX(6);
        System.out.println(ikili2);
        System.out.println(Arrays.toString(ikililer));
        Arrays.sort(ikililer);
        System.out.println(Arrays.toString(ikililer));

        A a1=new A();

        a1.y=15;//public olduğu için erişim var
        //a1.z=5; protected olduğundan başka packe içerisinden erişilemiyor.
        //a1.t=7; (default) erişim belirteci olduğundan erişim yoktur
    }
}
