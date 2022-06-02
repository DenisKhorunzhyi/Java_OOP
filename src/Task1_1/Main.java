package Task1_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите ширину");
        double Width = scanner.nextDouble();
        System.out.println("Введите всоту");
        double High = scanner.nextDouble();
        {
            Rectangle rectangle = new Rectangle(Width, High);
            System.out.printf("Площа = %.2f, Периметр = %.2f", rectangle.Sqrt(), rectangle.Perimetr());
        }
        System.out.println("\nВведите радиус");
        double Radius = scanner.nextDouble();
        {
            Circle circle = new Circle(Radius);
            System.out.printf("Площа = %.2f, Довжина дуги = %.2f", circle.Sqrt(), circle.CircleLenth());
        }
    }}
