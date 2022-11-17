import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int old, km;
        double price;
        double perPrice = 0.10;
        int trip;
        System.out.println("Bilet fiyatı öğrenme uygulamamıza hoşgeldiniz\n"
                            +"Lütfen gerekli bilgileri giriniz");
        System.out.print("Yaşınız:");
        old = scan.nextInt();
        System.out.print("Kaç km mesafe:");
        km = scan.nextInt();
        System.out.println("Gidiş dönüş birlikte mi alınacak ?\n"
                            +"Evet ise 1'e, Hayır ise 2'ye basın.");
        System.out.print("Yanıt:");
        trip = scan.nextInt();
        switch (trip){
            case 1:
                if (old<12){
                    price=((perPrice*km)/2)*3/5;
                    System.out.println("Fiyat: "+price);
                } else if (12<old && old<=24) {
                    price=(((perPrice*km)*4/5-(perPrice*km*1/10)));
                    System.out.println("Fiyat: "+price);
                } else if (65<old) {
                    price=(((perPrice*km)*4/5-(perPrice*km*3/10)));
                    System.out.println("Fiyat: "+price);
                }else {
                    price=(((perPrice*km)*4/5));
                    System.out.println("Fiyat: "+price);
                }
                break;
            case 2:
                if (old<12){
                    price=((perPrice*km)/2);
                    System.out.println("Fiyat: "+price);
                } else if (12<old && old<24) {
                    price=(((perPrice*km)-(perPrice*km*1/10)));
                    System.out.println("Fiyat: "+price);
                } else if (65<old) {
                    price=(((perPrice*km)-(perPrice*km*3/10)));
                    System.out.println("Fiyat: "+price);
                }else {
                    price=(perPrice*km);
                    System.out.println("Fiyat: "+price);
                }
                break;
        }

    }
}
