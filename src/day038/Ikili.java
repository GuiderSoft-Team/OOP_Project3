package day038;

public class Ikili implements Comparable<Ikili>,Cloneable {
    private int x;
    private int y;

    public Ikili() {
    }

    public Ikili(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d;%d)",x,y);
    }

    @Override
    public int compareTo(Ikili o) {
        double thisOrt=(x+y)/2.0;
        double oOrt=(o.getX()+o.getY())/2.0;
        return thisOrt<oOrt?-1:thisOrt==oOrt?0:1;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return new Ikili(x,y);
    }
}
