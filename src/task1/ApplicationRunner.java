package task1;

import java.util.Scanner;

public class ApplicationRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter job code: \n1 - Director \n2 - Worker \n3 - Accountant");
        int jobCode = scanner.nextInt();

        JobTitle jobTitle = null;

        switch (jobCode) {
            case 1 -> jobTitle = new Director();
            case 2 -> jobTitle = new Worker();
            case 3 -> jobTitle = new Accountant();
            default -> System.out.println("Invalid job code");
        }

        if (jobTitle != null) {
            jobTitle.printJobTitle();
        }
    }
}
