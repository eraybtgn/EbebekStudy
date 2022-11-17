import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        double total=0;


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir sayi giriniz:");
        num = scan.nextInt();

        for (double i = 1; i <= num; i++) {

            total += 1 / i;
        }
        System.out.println(total);
    }
}
