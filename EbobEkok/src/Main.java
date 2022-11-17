import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2;
        int ebob,ekok,kalan,bolunen,bolen;
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa hoşgeldiniz.");
        System.out.println("İki sayı giriniz");
        System.out.print("Sayi:");
        num1=sc.nextInt();
        System.out.print("Sayi2:");
        num2=sc.nextInt();
        if (num1>num2)
        {
            bolunen=num1;
            bolen=num2;
        }
        else
        {
            bolunen=num2;
            bolen=num1;
        }
        kalan=bolunen%bolen;
        while(kalan!=0)
        {
            bolunen=bolen;
            bolen=kalan;
            kalan=bolunen%bolen;
        }
        ebob = bolen;
        ekok = num1*num2/ebob;
        System.out.println(num1+" ve "+num2+" bu sayıların EBOB'u = "+ebob);
        System.out.println(num1+" ve "+num2+" bu sayıların EKOK'u = "+ekok);
    }
}
