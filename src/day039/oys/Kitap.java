package day039.oys;

public class Kitap {
    private String adi;
    private String yazari;
    private int sayfaAdedi;

    public Kitap(String adi, String yazari, int sayfaAdedi) {
        this.adi = adi;
        this.yazari = yazari;
        this.sayfaAdedi = sayfaAdedi;
    }

    @Override
    public String toString() {
        return String.format("%s - %s (%d)",adi,yazari,sayfaAdedi);
    }
}
