import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int a, b;
        System.out.print("Enter the base number: ");
        a = keyboard.nextInt();
        System.out.print("Enter the power: ");
        b = keyboard.nextInt();
        int result = recursivePow(a, b);
        System.out.println("Result: " + result);
        keyboard.close();
    }


    public static int recursivePow(int a, int b) {
        if (a == 0) {
            return 0;
        }

        if (a != 0 && b == 0) {
            return 1;
        }

        return recursivePow(a, b - 1) * a;
    }
}
