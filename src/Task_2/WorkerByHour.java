package Task_2;

public class WorkerByHour implements ISalary {
    private final double HoursWork;
    private final double PriceByHour;

    WorkerByHour(double PriceByHour, double Hours) {
        this.HoursWork = Hours;
        this.PriceByHour = PriceByHour;
    }

    WorkerByHour() {
        HoursWork = 100;
        PriceByHour = 75;
    }

    @Override
    public double Salary() {
        return PriceByHour*HoursWork;
    }

    public double getHoursWork() {
        return HoursWork;
    }

    public double getPriceByHour() {
        return PriceByHour;
    }
}
