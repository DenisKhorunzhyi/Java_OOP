package Task_1;

import java.util.ArrayList;

public class Bouquet {
    float Price = 0;
    ArrayList<Flower> bouquet;

    Bouquet() {
        bouquet = new ArrayList<>();
    }

    public void AddFlower(Flower flower) {
        bouquet.add(flower);
    }

    public void RemoveFlower(Flower flower) {
        bouquet.remove(flower);
    }

    public float getPrice() {
        for (Flower flower : bouquet
        ) {
            Price += flower.getPrice();
        }
        return Price;
    }

    @Override
    public String toString() {
        StringBuilder Information= new StringBuilder("Bouquet contains: \n");
        String Type;
        for (Flower flower:bouquet
             ) {Type = flower.getClass().toString().split("\\.")[1];
            Information.append(Type).append(", Color: ").append(flower.getColor()).append("\n");

        }
        Information.append("Price: ").append(getPrice());
        return Information.toString();
    }
}
