package day039.oys;

public class Kutu {
    private int genislik;
    private int yukseklik;
    private int derinlik;

    public Kutu(int genislik, int yukseklik, int derinlik) {
        this.genislik = genislik;
        this.yukseklik = yukseklik;
        this.derinlik = derinlik;
        System.out.println("Kutu Parametreli constructor çağrıldı.");
    }

    public Kutu() {
         this(1,1,1);
        System.out.println("Kutu Parametresiz constructor çağrıld.");
    }

    @Override
    public String toString() {
        return String.format("Kutu %dx%dx%d",genislik,yukseklik,derinlik);
    }
}
