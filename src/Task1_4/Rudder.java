package Task1_4;

public class Rudder {
    private double Radius;
    private String Material;
    Rudder(double radius, String Material){
        setMaterial(Material);
        setRadius(radius);
    }


    public void setRadius(double radius) {
        Radius = radius;
    }

    public double getRadius() {
        return Radius;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }
    public String toString(){
        return "Radius = "+ getRadius()+",Rudder Material = "+getMaterial();}
}
