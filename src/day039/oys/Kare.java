package day039.oys;

public class Kare extends Sekil{
    private double kenar;

    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
        this.kenar = kenar;
    }

    public Kare(double kenar) {
        this.kenar = kenar;
    }

    @Override
    double alanHesapla() {
        return kenar*kenar;
    }

    @Override
    double cevreHesapla() {
        return 4*kenar;
    }
}
