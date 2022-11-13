import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Programa hoşgeldiniz.\n Lütfen bir değer giriniz");
        int index = scan.nextInt();
        int f1=4;
        int f2=5;       // Kod böyle yazılır @mütevaziEray
        for (int i = 1; i <= index; i++) {
            double number1 = Math.pow(f1,i);
            double number2 = Math.pow(f2,i);
            System.out.println("Dördün kuvvetleri. "+number1);
            System.out.println("Beşin kuvvetleri. "+number2);
        }
    }
}
