import java.util.Scanner;

public class Problem1 {
    public static double calculate(double a, double b, String operation) {
        double result;

        if (operation.equalsIgnoreCase("add")) {
            result = a + b;
        } else if (operation.equalsIgnoreCase("subtract")) {
            result = a - b;
        } else if (operation.equalsIgnoreCase("multiply")) {
            result = a * b;
        } else if (operation.equalsIgnoreCase("divide")) {
            if (b == 0) {
                return 0;
            } else {
                result = a / b;
            }
        } else {
            return 0;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();

        double b = scanner.nextDouble();

        String op = scanner.next();

        double output = calculate(a, b, op);
        System.out.println("Result: " + output);

    }
}
