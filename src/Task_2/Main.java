package Task_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);
        {
            System.out.print("Enter A: ");
            try {
                a = scanner.nextInt();

            } catch (InputMismatchException e) {
                a = 0;
                System.out.println("Число должны быть целые");

            }
            System.out.println("Чётное? " + IsDouble(a));
            System.out.print("Enter В: ");
            try {
                b = scanner.nextInt();

            } catch (InputMismatchException e) {
                System.out.println("Число должны быть целые");
                b = 0;
            }
            System.out.println("Чётное? " + IsDouble(b));
        }
    }


    private static boolean IsDouble(int a) {
        if (a % 2 == 0) return Boolean.TRUE;
        else {
            return Boolean.FALSE;
        }
    }


}
