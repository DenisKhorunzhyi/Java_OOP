package FirstTask;

public class Human {
    private final String Name;
    private final String Email;
    private final Double Age;
Human(String Name,double Age,String Email){
    this.Age = Age;
    this.Name = Name;
    this.Email = Email;
}

    @Override
    public String toString() {
        return "Human{" +
                "Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                ", Age=" + Age +
                '}';
    }
}

