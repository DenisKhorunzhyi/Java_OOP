package Task1_1;

public class Circle {
    private double radius;
    private double diametr;

    Circle(double radius) {
        this.radius = radius;
        this.diametr = radius * 2;
    }

    Circle() {
        this.radius = 40;
        this.diametr = radius * 2;
    }

    public double Sqrt() {
        return 2 * Math.PI * radius * radius;
    }

    public double CircleLenth() {
        return Math.PI * diametr;
    }

    public void SetRadius(double radius) {
        this.radius = radius;
        this.diametr = 2 * radius;
    }

    public double GettRadius() {
        return radius;
    }

    public double GetDiametr() {
        return diametr;
    }
}
