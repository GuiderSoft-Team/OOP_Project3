package day035;

public class MainApp {
    public static void main(String[] args) {
        LazerYazici yazici=new LazerYazici(50,-1000,true);
//        System.out.println(yazici.tonerEkle(20));
//        System.out.println(yazici.tonerEkle(-200));
        System.out.println(yazici.kagitYukle(300));
        System.out.println(yazici.kagitYukle(100));
        System.out.println("Yazdırılan kağıt miktarı = "+yazici.yazdir(-11));
    }
}
