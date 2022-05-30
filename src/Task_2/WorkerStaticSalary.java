package Task_2;

public class WorkerStaticSalary implements ISalary {
    private final double Salary;

    WorkerStaticSalary(double Salary) {
        this.Salary = Salary;

    }

    WorkerStaticSalary() {
        this.Salary = 6500;

    }

    @Override
    public double Salary() {
        return 7500;
    }
}
