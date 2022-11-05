import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i1;
        int i2;
        int i3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayıları küçükten büyüğe sıralayan program.");
        System.out.println("--------------------------------------------");
        System.out.println("Lütfen 3 adet sayı giriniz.");
        i1 = scan.nextInt();
        i2 = scan.nextInt();
        i3 = scan.nextInt();
        if (i1 < i2 && i1 < i3){
            System.out.println(i1);
            if (i2<i3){
                System.out.println(i2);
                System.out.println(i3);
            }else {
                System.out.println(i3);
                System.out.println(i2);
            }
        } else if (i2<i1 && i2<i3) {
            System.out.println(i2);
            if (i1<i3){
                System.out.println(i1);
                System.out.println(i3);
            }else {
                System.out.println(i3);
                System.out.println(i1);
            }
        }else {
            System.out.println(i3);
            if (i2<i1){
                System.out.println(i2);
                System.out.println(i1);
            }else {
                System.out.println(i1);
                System.out.println(i2);
            }
        }
    }
}
