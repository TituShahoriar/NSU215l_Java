abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public String toString() {
        return "Color: " + color;
    }
}

class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public String toString() {
        return super.toString() + ", Length: " + length + ", Width: " + width + ", Area: " + getArea();
    }
}

class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public String toString() {
        return super.toString() + ", Base: " + base + ", Height: " + height + ", Area: " + getArea();
    }
}
