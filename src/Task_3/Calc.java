package Task_3;

public class Calc {
    public double add(double a,double b) throws IllegalAccessException, MyExeption {
    checking(a,b);
       return a+b;
    }
    public double min(double a,double b) throws IllegalAccessException, MyExeption {
        checking(a,b);
        return a-b;
    }
    public double mult(double a,double b) throws IllegalAccessException, MyExeption {
        checking(a,b);
        return a*b;
    }
    public double devide(double a,double b) throws IllegalAccessException, MyExeption {
        checking(a,b);
        return a/b;
    }
    public void checking(double a, double b) throws IllegalAccessException, MyExeption {
        if(a<0&&b<0)throw new IllegalArgumentException();
    else if(a==0&b!=0||a!=0&b==0)throw new ArithmeticException();
    else if(a==0&&b==0)throw new IllegalAccessException();
    else if(a>0&&b>0){throw new MyExeption();}
    }


}
