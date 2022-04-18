package day035;


public class Kitap {
    private String adSoyad;
    private String yazar;
    private int sayfaAdedi;


    public Kitap(String isim, String yazar, int sayfaAdedi) {
        this.adSoyad = isim;
        this.yazar = yazar;
        setSayfaAdedi(sayfaAdedi);
    }

    public int getSayfaAdedi() {
        return sayfaAdedi;
    }

    public void setSayfaAdedi(int sayfaAdedi) {
        if(sayfaAdedi>0) {
            this.sayfaAdedi = sayfaAdedi;
        }
    }

    public String getIsim() {
        return adSoyad;
    }

    public void setIsim(String isim) {
        this.adSoyad = isim;
    }
}
