package day039.oys;

public class Dikdortgen extends Sekil{
    private double genislik;
    private double yukseklik;

    public Dikdortgen(double genislik, double yukseklik) {
        this.genislik = genislik;
        this.yukseklik = yukseklik;
    }


    public double getGenislik() {
        return genislik;
    }

    public void setGenislik(double genislik) {
        this.genislik = genislik;
    }

    public double getYukseklik() {
        return yukseklik;
    }

    public void setYukseklik(double yukseklik) {
        this.yukseklik = yukseklik;
    }

    @Override
    double alanHesapla() {
        return genislik*genislik;
    }

    @Override
    double cevreHesapla() {
        return 2*(genislik+yukseklik);
    }
}
