package day035;

public class LazerYazici {
    private final int MAKS_TONER_SEVIYESI=100;
    private final int MAKS_KAGIT_MIKTARI=500;
    private int tonerSeviyesi;
    private int kagitAdedi;
    private boolean ciftYonluBaski;

    public LazerYazici(int tonerSeviyesi, int kagitAdedi, boolean ciftYonluBaski) {
        tonerEkle(tonerSeviyesi);
        kagitYukle(kagitAdedi);
        this.ciftYonluBaski = ciftYonluBaski;
    }

    public int tonerEkle(int miktar) {
        if(miktar>0&&miktar<=MAKS_TONER_SEVIYESI&&tonerSeviyesi+miktar<=MAKS_TONER_SEVIYESI){
            tonerSeviyesi+=miktar;
        }else if(tonerSeviyesi+miktar>MAKS_TONER_SEVIYESI){
            tonerSeviyesi=MAKS_TONER_SEVIYESI;
        }
        return tonerSeviyesi;
    }

    public int kagitYukle(int miktar) {
        if(miktar>0&&kagitAdedi+miktar<=MAKS_KAGIT_MIKTARI){
            kagitAdedi+=miktar;
        }else if(kagitAdedi+miktar>MAKS_KAGIT_MIKTARI){
            kagitAdedi=MAKS_KAGIT_MIKTARI;
        }
        return kagitAdedi;
    }
    //şart?case1:case2;
    public int yazdir(int sayfaAdedi){
        if (sayfaAdedi<=0) return 0;
        return ciftYonluBaski?sayfaAdedi/2+sayfaAdedi%2:sayfaAdedi;
    }
}
