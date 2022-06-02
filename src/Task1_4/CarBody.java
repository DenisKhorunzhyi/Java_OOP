package Task1_4;

public class CarBody {
    private double Length;
    private double Weigh;
CarBody(double length,double weigh){
    setLength(length);
    setWeigh(weigh);
}
    public double getLength() {
        return Length;
    }

    public double getWeigh() {
        return Weigh;
    }
    public void setLength(double length) {
        Length = length;
    }
    public void setWeigh(double weigh) {
        Weigh = weigh;
    }
    public String toString(){
        return "Length = "+ getLength()+", Weigh = "+getWeigh();}
}
