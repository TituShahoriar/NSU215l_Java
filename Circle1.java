public class Circle1 {
        private double radius;
        private String color;

        public Circle1() {
            this.radius = 5.0;
            this.color = "red";
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double getArea() {
            return Math.PI * radius * radius;
        }

        public double getPerimeter() {
            return 2 * Math.PI * radius;
        }

        public static void main(String[] args) {
            Circle1 circle = new Circle1();
            System.out.println("Area: " + circle.getArea());
            System.out.println("Perimeter: " + circle.getPerimeter());
            System.out.println("Color: " + circle.getColor());
        }
}
