package day038;


import java.util.Arrays;
import java.util.Collections;

public class MainApp {
    public static void main(String[] args) {
        int[] sayilar={3,5,1,2,9,4};

        System.out.println(Arrays.toString(sayilar));
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));

        String[] isimler={"Mehmet","Ahmet","Hasan","Zeynep","Ayşe"};
        System.out.println(Arrays.toString(isimler));
        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));

        Kitap[] kitaplar={
                new Kitap("Java 5","Herbert Schild",700),
                new Kitap("C# 4.0","Herbert Schild",200),
                new Kitap("Javascript Kitabı","Anonim",150),
                new Kitap("Python'a Giriş","Cenk Serdengeçti",350)
        };
        System.out.println(Arrays.toString(kitaplar));
        Arrays.sort(kitaplar);
//        System.out.println(Arrays.toString(kitaplar));

        for (Kitap kitap:kitaplar){
            System.out.println(kitap);
        }
    }

}
