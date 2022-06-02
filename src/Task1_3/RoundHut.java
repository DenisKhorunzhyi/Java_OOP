package Task1_3;

public class RoundHut extends Dwelling {
    private final double Radius;
    RoundHut(int resident,double radius) {
        super(resident);
        BuildingManerial  ="Straw";
        Capacity = 4;
        this.Radius = radius;
    }
    @Override
    public double floorArea(double radius) {
        return Math.PI*Radius*Radius;
    }

    @Override
    public String ToString() {
        return super.ToString()+"\n"+"S = "+floorArea(Radius)+"\n"+"Has room: " + HasRoom();
    }
}

