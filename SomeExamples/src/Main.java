import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int index;
        System.out.println("Bir sayı giriniz.");
        index= scan.nextInt();
        int sum=0;

        for (int i = 0; i < index; i++) {
            if(i%3==0 || i%4==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}
