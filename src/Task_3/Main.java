package Task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calc calc = new Calc();
        double rez=0;
        System.out.println("Enter A: ");
        double a = scanner.nextDouble();
        System.out.println("Enter B: ");
        double b = scanner.nextDouble();
        try {
            rez = calc.Add(a,b);
            if(a<0&&b<0)throw new IllegalArgumentException();
            else if(a==0&b!=0||a!=0&b==0)throw new ArithmeticException();
            else if(a==0&&b==0)throw new IllegalAccessException();
            else if(a>0&&b>0){throw new MyExeption();}

        }
        catch (MyExeption e){}
        catch (IllegalAccessException e){}
        catch (ArithmeticException e){}
        catch (IllegalArgumentException e){}
        finally {
            System.out.println("Rezult = "+rez);
        }
        try {
            rez = calc.Min(a,b);
            if(a<0&&b<0)throw new IllegalArgumentException();
            else if(a==0&b!=0||a!=0&b==0)throw new ArithmeticException();
            else if(a==0&&b==0)throw new IllegalAccessException();
            else if(a>0&&b>0){throw new MyExeption();}

        }
        catch (MyExeption e){}
        catch (IllegalAccessException e){}
        catch (ArithmeticException e){}
        catch (IllegalArgumentException e){}
        finally {
            System.out.println("Rezult = "+rez);
        }
        try {
            rez = calc.Mult(a,b);
            if(a<0&&b<0)throw new IllegalArgumentException();
            else if(a==0&b!=0||a!=0&b==0)throw new ArithmeticException();
            else if(a==0&&b==0)throw new IllegalAccessException();
            else if(a>0&&b>0){throw new MyExeption();}

        }
        catch (MyExeption e){}
        catch (IllegalAccessException e){}
        catch (ArithmeticException e){}
        catch (IllegalArgumentException e){}
        finally {
            System.out.println("Rezult = "+rez);
        }
        try {
            rez = calc.Devide(a,b);
            if(a<0&&b<0)throw new IllegalArgumentException();
            else if(a==0&b!=0||a!=0&b==0)throw new ArithmeticException();
            else if(a==0&&b==0)throw new IllegalAccessException();
            else if(a>0&&b>0){throw new MyExeption();}

        }
        catch (MyExeption e){}
        catch (IllegalAccessException e){}
        catch (ArithmeticException e){}
        catch (IllegalArgumentException e){}
        finally {
            System.out.println("Rezult = "+rez);
        }
    }

}
