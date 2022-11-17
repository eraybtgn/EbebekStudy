import java.util.Scanner;
    // Güzel oldu :)
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 ;
        int num2 ;
        int sum  = 1;
        int sum2 = 1;
        int sum3 = 1;
        int total;
        System.out.println("Kombinasyon hesaplama uygulamamıza hoşgeldiniz.\n Lütfen kombinasyon değerlerini giriniz.");
        System.out.print("İlk değer:");
        num1 = scan.nextInt();
        System.out.print("İkinici değer:");
        num2 = scan.nextInt();
        for (int i = 1; i <= num1; i++) {
            sum = i*sum;
        }

        for (int j = 1; j <= num2 ; j++) {
            sum2 = j*sum2;
        }

        for (int z = 1; z <=(num1-num2); z++) {
            sum3 = z*sum3;
        }

        total = sum/(sum2*sum3);
        System.out.println("Sonuç: "+total);
    }
}
