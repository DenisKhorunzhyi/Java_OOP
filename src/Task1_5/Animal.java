package Task1_5;

public class Animal {
    private double Yers;
    private String AnimalType;
    private double AnnimalSpeed;
    Animal(String AnimalType, double Years, double AnimalSpeed)
    {
        setAnimalType(AnimalType);
        setAnnimalSpeed(AnimalSpeed);
        setYers(Years);
    }

    public double getYers() {
        return Yers;
    }

    public String getAnimalType() {
        return AnimalType;
    }

    public void setAnimalType(String animalType) {
        AnimalType = animalType;
    }

    public double getAnnimalSpeed() {
        return AnnimalSpeed;
    }

    public void setAnnimalSpeed(double annimalSpeed) {
        AnnimalSpeed = annimalSpeed;
    }

    public void setYers(double yers) {
        Yers = yers;
    }

    @Override
    public String toString() {
        return "Назва тварини = "+AnimalType+" Швидкість тварини = " +AnnimalSpeed+" км/год "+"Вік тварини = " +Yers;
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Леопард",7,70);
        System.out.println(animal);
        animal.setAnimalType("Бик");
        animal.setYers(14);
        animal.setAnnimalSpeed(2);
        System.out.println(animal);
    }
}
