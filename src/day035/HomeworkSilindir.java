package day035;

public class HomeworkSilindir extends HomeworkDaire{
    private double yukseklik;

    HomeworkSilindir(double yaricap, double yukseklik)
    {
        super(yaricap);
        setYukseklik(yukseklik);

    }

    public void setYukseklik(double yukseklik) {
        if (this.yukseklik<0)
        {
            this.yukseklik=0;
        }
        this.yukseklik=yukseklik;
    }

    public double getYukseklik() {
        return yukseklik;
    }
    double getHacim()

    {
        return super.getAlan()*this.yukseklik;
    }

    @Override
    public double getAlan() {
        return 2*super.getYaricap()*super.getYaricap()*Math.PI+2*super.getYaricap()*this.getYukseklik()*Math.PI;

        //2 * yaricap * yaricap * PI + 2 * PI * yaricap * yukseklik
    }
}
