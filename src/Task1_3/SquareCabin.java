package Task1_3;

public class SquareCabin extends Dwelling {
    public double Lenth;
    SquareCabin(int resident,double lenth) {
        super(resident);
        BuildingManerial  ="Wood";
        Capacity = 6;
        this.Lenth = lenth;
    }
    @Override
    public double floorArea(double lenth) {
        return super.floorArea(lenth)*lenth;
    }

    @Override
    public String ToString() {
        return super.ToString()+"\n"+"S = "+floorArea(Lenth)+"\n"+"Has room: " + HasRoom();
    }
}