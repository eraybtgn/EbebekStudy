import java.util.Scanner;

/*
Burçlarla aram pek iyi değildir eğer burcunuz farklı çıktıysa şaşırmayın,
belkide gerçek burcunuz odur.
*/
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day,month;
        System.out.println("Hangi burç olduğunuzu bulan programa hoşgeldiniz.");
        System.out.println("-------------------------------------------------");
        System.out.println("Lütfen hangi ayda doğduğunuzu giriniz.");
        month = scan.nextInt();
        System.out.println("Lütfen hangi gün doğdunuzu giriniz.");
        day = scan.nextInt();
        if (month==12){
            if (day<=21){
                System.out.println("Senin burcun yay");
            } else if (day>21) {
                System.out.println("Oğlak burcusunuz.");
            }
        } else if (month==11) {
            if (day<=21){
                System.out.println("Senin burcun akrep");
            }else if (day>21) {
                System.out.println("Yay burcusunuz.");
            }
        } else if (month==10) {
            if (day<=21){
                System.out.println("Senin burcun terazi");
            }else if (day>21) {
                System.out.println("Balık burcusunuz.");
            }
        } else if (month==9) {
            if (day<=21){
                System.out.println("Senin burcun başak");
            }else if (day>21) {
                System.out.println("Koç burcusunuz.");
            }
        } else if (month==8) {
            if (day<=21){
                System.out.println("Senin burcun aslan.");
            }else if (day>21) {
                System.out.println("Boğa burcusunuz.");
            }
        }else if (month==7) {
            if (day<=21){
                System.out.println("Senin burcun yengeç");
            }else if (day>21) {
                System.out.println("İkizler burcusunuz.");
            }
        } else if (month==6) {
            if (day<=21){
                System.out.println("Senin burcun ikizler");
            }else if (day>21) {
                System.out.println("Yengeç burcusunuz.");
            }
        } else if (month==5) {
            if (day<=21){
                System.out.println("Senin burcun boğa");
            }else if (day>21) {
                System.out.println("Aslan burcusunuz.");
            }
        } else if (month==4) {
            if (day<=21){
                System.out.println("Senin burcun koç.");
            }else if (day>21) {
                System.out.println("Başak burcusunuz.");
            }
        }else if (month==3) {
            if (day<=21){
                System.out.println("Senin burcun balık");
            }else if (day>21) {
                System.out.println("Terazi burcusunuz.");
            }
        } else if (month==2) {
            if (day<=21){
                System.out.println("Senin burcun kova");
            }else if (day>21) {
                System.out.println("Akrep burcusunuz.");
            }
        } else if (month==1) {
            if (day<=21){
                System.out.println("Senin burcun oğlak");
            }else if (day>21) {
                System.out.println("Yay burcusunuz.");
            }
        }
    }
}
