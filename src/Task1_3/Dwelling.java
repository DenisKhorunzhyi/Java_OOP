package Task1_3;

public class Dwelling {
    public String BuildingManerial;
    public int Capacity;
    private final int Resident;
    Dwelling (int resident)
    { this.Resident = resident; }
    public boolean HasRoom(){
        return Resident<Capacity;
    }
    public double floorArea  (double lenth)
    {
        return lenth;}
    public String ToString()
    {return "Material: "+ BuildingManerial +"\n"+"People count: "+""+ Resident+"\n"+"Capacity: "+Capacity;}
}
