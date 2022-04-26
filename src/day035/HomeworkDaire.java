package day035;

public class HomeworkDaire {
    private double yaricap;

    HomeworkDaire(double yaricap)
    {
        setYaricap(yaricap);
    }

    public double getYaricap() {
        return this.yaricap;
    }

    public void setYaricap(double yaricap) {
        if (yaricap<0)
        {
            this.yaricap=0;
        }
        this.yaricap = yaricap;
    }
    public double getAlan()
    {
        return this.getYaricap()*this.getYaricap()*Math.PI;
    }
}

