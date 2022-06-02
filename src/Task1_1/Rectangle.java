package Task1_1;

public class Rectangle {
        private double widht;
        private double high;

        Rectangle(double widht, double high) {
            this.high = high;
            this.widht = widht;
        }

        Rectangle() {
            this.high = 100;
            this.widht = 200;
        }

        public double Sqrt() {
            return widht * high;
        }

        public double Perimetr() {
            return 2 * (widht + high);
        }

        public void SetWidth(double widht) {
            this.widht = widht;
        }

        public void SetHigth(double hight) {
            this.high = hight;
        }

        public double GettWidth() {
            return widht;
        }

        public double GetHigth() {
            return high;
        }
}
