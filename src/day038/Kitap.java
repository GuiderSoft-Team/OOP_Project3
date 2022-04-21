package day038;

public class Kitap implements Comparable {
    private String adi;
    private String yazari;
    private int sayfaAdedi;

    public Kitap() {
    }

    public Kitap(String adi, String yazari, int sayfaAdedi) {
        this.adi = adi;
        this.yazari = yazari;
        this.sayfaAdedi = sayfaAdedi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getYazari() {
        return yazari;
    }

    public void setYazari(String yazari) {
        this.yazari = yazari;
    }

    public int getSayfaAdedi() {
        return sayfaAdedi;
    }

    public void setSayfaAdedi(int sayfaAdedi) {
        this.sayfaAdedi = sayfaAdedi;
    }

    @Override
    public String toString() {
        return "Kitap{" +
                "adi='" + adi + '\'' +
                ", yazari='" + yazari + '\'' +
                ", sayfaAdedi=" + sayfaAdedi +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        Kitap k=(Kitap) o;
//        return getSayfaAdedi()<k.getSayfaAdedi()?1:getSayfaAdedi()==k.getSayfaAdedi()?0:-1;
        return getAdi().compareTo(k.getAdi());
    }
}
