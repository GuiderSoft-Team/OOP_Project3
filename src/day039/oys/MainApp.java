package day039.oys;

public class MainApp {



    public static void main(String[] args) {
        Kare kare1=new Kare(7.0);
        Dikdortgen dikdortgen1=new Dikdortgen(6,4);
        showInfo(kare1);
        System.out.println();
        showInfo(dikdortgen1);

        Sekil sekil1=new Kare(6.0);
        Sekil sekil2=new Dikdortgen(5.0,3.0);

        ((Kare) sekil1).setKenar(7.0);

        showInfo(sekil1);

    }


    public static void showInfo(Sekil sekil){
        System.out.println("Alan = "+sekil.alanHesapla());
        System.out.println("Çevre = "+sekil.cevreHesapla());
    }


}
