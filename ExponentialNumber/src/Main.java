import java.util.Scanner;
 // @eraywest
public class Main {
    public static void main(String[] args) {
        int num1, num2,sum=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("üslü sayı alma programımıza hoşgeldiniz.\n Lütfen üslü almak istediğiniz sayıyı giriniz.");
        System.out.print("İlk değer:");
        num1 = scan.nextInt();
        System.out.println("Lütfen Kaç üssü almak istediğinizi giriniz.");
        System.out.print("İkinici değer:");
        num2 = scan.nextInt();
        for (int i = 1; i <=num2; i++) {
            sum=sum*num1;
            

        }
        System.out.println(sum);
    }
}
