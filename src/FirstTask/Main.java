package FirstTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Age = 0;
        String Email="";
        String Name;

            System.out.print("Введите имя: ");
            Name = scanner.next();
            while (Age == 0) {
                System.out.print("Введите возраст: ");
                try {
                    Age = scanner.nextDouble();
                    if (Age < 18) throw new UnderAgeExeption();
                } catch (UnderAgeExeption e) {
                    Age = 0;
                    break;
                }
            }
            while (Email.equals("")) {
                System.out.print("Enter Email: ");
                try {
                    Email = scanner.next();
                    if (!Email.contains("@")) throw new IncorrectEmailExeption();
                } catch (IncorrectEmailExeption e) {
                    Email = "";
                     break;
                }
            }
            Human human1 = new Human(Name, Age, Email);
            System.out.println(human1);




    }
}
