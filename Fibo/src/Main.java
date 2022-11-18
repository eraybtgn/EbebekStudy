import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Fibonacci sayıları bulma

        int ilkSayi,sonSayi;
        int a = 0 , b = 1 , c = 0;
        int sayac = 1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen işlem yapmak istediğiniz fibonacci sayısını ilk aralığını giriniz : ");
        ilkSayi = scan.nextInt();

        System.out.print("Lütfen işlem yapmak istediğiniz fibonacci sayısını son aralığını giriniz : ");
        sonSayi = scan.nextInt();


        while(c<sonSayi) {
            c = a + b;
            if(c>ilkSayi && c<sonSayi) {
                System.out.println(sayac + ". Adımdaki Fibonacci sayı : " + c);
            }
            sayac++;
            a = b;
            b = c;


        }
    }
}
