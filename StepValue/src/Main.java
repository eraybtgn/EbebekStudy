import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hoşgeldiniz.");
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3, num4, num5=0;
        System.out.println("Lütfen bir değer giriniz.");
        System.out.print("Değer:");
        num1 = scan.nextInt();
        num5+= num1%10;
        num1= num1/10;
        num5+=num1%10;
        num1=num1/10;
        num5+=num1%10;
        num1=num1/10;
        num5+=num1%10;
        System.out.println(num5);
    }
}
