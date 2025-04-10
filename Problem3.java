import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        
        if (a % 2 == 0) {
            a--;
        }

        for (int i = 1; i <= a * 2 - 1; i += 2) {
            System.out.print(i);
            if (i < a * 2 - 1) {
                System.out.print(", ");
            }
        }

    }
}
