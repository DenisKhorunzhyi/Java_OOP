package Task1_4;

public class Weel {
        private double Radius;
        Weel(double radius){
            setRadius(radius);
        }

        public void setRadius(double radius) {
            Radius = radius;
        }
        public double getRadius() {
            return Radius;
        }
        public String toString(){
            return "Weel radius ="+getRadius();
        }
}
