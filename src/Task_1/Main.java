package Task_1;

public class Main {

    public static void main(String[] args) {
	Rose rose = new Rose();
    Tulip tulip = new Tulip();
    May_Lily may_lily = new May_Lily();
    Bouquet bouquet = new Bouquet();
    bouquet.AddFlower(rose);
    bouquet.AddFlower(tulip);
    bouquet.AddFlower(may_lily);
    System.out.println(bouquet);
    }
}
