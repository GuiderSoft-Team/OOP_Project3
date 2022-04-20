package day037;



public class MainApp {
    public static void main(String[] args) {
        /*
            Soyut sınıflar: Örnekleri oluşturulamaz.
            Kalıtım yoluyla (extends) alt sınıf oluşturulabilir.
            İçerisinde gövdeli ve gövdesiz metotlar bulunabilir.
            Gövdesiz metotlar, alt sınıfa ne yapması gerektiğini söyler
            ama nasıl yapması gerektiğini söylemez.
         */
        /*
            Interface: Çok biçimliliği sağlamak için kullanılan sınıf benzeri yapılardır.
            Gövdeli metotları bulunmaz. Yani bütün metotları abstract'tır.
            Kendisini implemente (uygulayacak, gerçekleştirecek) edecek alt sınıflara
            ne yapacaklarını bildiriyor ama nasıl yapacaklarına karışmıyor.
         */

/*        Hayvan hayvan1=new Hayvan("Hayvan 1",5,12.0);
        hayvan1.beslen();
        Aslan aslan1=new Aslan();
        aslan1.yuz();
        Kaplan kaplan1=new Kaplan();
        Balina balina1=new Balina();
        balina1.yuz();

        Yuzucu yuzucu1=new Aslan();
        Yuzucu yuzucu2=new Balina();

        Hayvan hayvan2=new Kaplan();
        ((Kaplan)hayvan2).avlan();

        Yuzucu yuzucu3=new Balina();*/


        Yuzucu[] yuzuculer=new Yuzucu[3];
        yuzuculer[0]=new Balina();
        yuzuculer[1]=new Aslan();
        yuzuculer[2]=new Balina();

        for (Yuzucu yuzucu:yuzuculer){
            yuzucu.yuz();
        }


    }
}
