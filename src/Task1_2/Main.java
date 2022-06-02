package Task1_2;

public class Main {
    public static void main(String[] args) {
        CofeeRobot cofeeRobot = new CofeeRobot();
        RobotCoocker robotCoocker = new RobotCoocker();
        RobotDancer robotDancer = new RobotDancer();
        Robot [] robots = new Robot[3];
        robots[0] =  cofeeRobot;
        robots[1] = robotCoocker;
        robots[2] = robotDancer;
        for (Robot a:robots
             ) {System.out.println(a.Work());

        }
    }
}
