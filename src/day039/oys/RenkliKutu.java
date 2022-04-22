package day039.oys;

public class RenkliKutu extends Kutu{
    private String renk;

    public RenkliKutu(int genislik, int yukseklik, int derinlik, String renk) {
        super(genislik, yukseklik, derinlik);
        this.renk = renk;
        System.out.println("Renklikutu parametreli çağrıldı.");
    }

    @Override
    public String toString() {
        return String.format("%s %s",super.toString(),renk);
    }
}
