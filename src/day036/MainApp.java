package day036;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        //3. Polymorphism (Çok biçimlilik)
        //Metotların overload edilmesi
        //Metotların override edilmesi

        Hayvan hayvan1=new Hayvan();
        hayvan1.setIsim("Hayvan 2");
        hayvan1.setYas(5);
        hayvan1.setAgirlik(3.5);
        Hayvan hayvan2=new Hayvan("Hayvan 2",5,3.5);

//        hayvan1.beslen();
//        hayvan1.sesVer();
//
//        hayvan2.beslen();
//        hayvan2.sesVer();


        Kedi kedi1=new Kedi();

        Hayvan hayvan=new Kedi();
        Kedi k=(Kedi)hayvan;

        Object obj4=new Kedi();
        Hayvan hayvan5=(Hayvan)obj4;
        Kedi k2=(Kedi)hayvan5;
        Kedi k1=(Kedi) obj4;





        if (hayvan1.equals(hayvan2)){
            System.out.println("İki hayvan aynı.");
        }else {
            System.out.println("İki hayvan farklı");
        }
        System.out.println(hayvan1);
        System.out.println(hayvan2);
    }
}
