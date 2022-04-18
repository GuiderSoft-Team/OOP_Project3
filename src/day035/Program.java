package day035;

public class Program {


    public static void main(String[] args) {
        //Encapsulation: Kodlarımızı ve verilerimizi koruma altına almak için kullanılır.
        /*
            public: tüm dünyanın erişimine açık
            protected: kendi paket (package) ve kendisinin alt sınıflarından
            private: sadece kendi sınıfının içinden erişilebilir
            (default): aynı paket içerisinden erişilebilir
         */


        Kitap kitap1=new Kitap("Kaşağı","Ömer Seyfettin",-300);
        kitap1.setIsim("Kaşağı");
//        kitap1.yazar="Ömer Seyfettin";
        kitap1.setSayfaAdedi(300);
//        kitap1.sayfaAdedi=-300;
        System.out.println(kitap1.getSayfaAdedi());
        System.out.println(kitap1.getIsim());

    }
}
