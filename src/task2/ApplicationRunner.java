package task2;

public class ApplicationRunner {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(3, 4, 5);
        figures[1] = new Rectangle(5, 10);
        figures[2] = new Circle(7);
        figures[3] = new Rectangle(8, 3);
        figures[4] = new Circle(4);

        double totalPerimeter = 0;

        for (Figure figure : figures) {
            figure.printInfo();
            System.out.println();

            totalPerimeter += figure.getPerimeter();
        }

        System.out.println("Sum of the perimeters of all figures: " +totalPerimeter);
    }
}
