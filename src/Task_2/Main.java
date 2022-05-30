package Task_2;

public class Main {
    public static void main(String[] args) {


    WorkerByHour workerByHour = new WorkerByHour(75,80);
    WorkerStaticSalary workerStaticSalary = new WorkerStaticSalary(10000);
    System.out.println("WorkerByHour salary after "+workerByHour.getHoursWork()+" hours in a month worked by "+ workerByHour.getPriceByHour()+"dollars in hour salary: "+workerByHour.Salary());
    System.out.println("WorkerStatic Salary: "+workerStaticSalary.Salary());
    }
}

