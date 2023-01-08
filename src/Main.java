import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the user input.
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        float f = scanner.nextFloat();
        double d = scanner.nextDouble();

        // Casts int to float.
        float x = (float) a;

        // Casts float to int.
        int y = (int) f;

        // Casts double to float.
        float z = (float) d;

        // Prints the value of x, y and z.
        System.out.println("x=" + x + " y=" + y + " z=" + z);
    }
}