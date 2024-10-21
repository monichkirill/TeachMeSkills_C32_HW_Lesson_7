package task2;

public abstract class Figure {
    abstract double getArea();
    abstract double getPerimeter();

    void printInfo() {
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
