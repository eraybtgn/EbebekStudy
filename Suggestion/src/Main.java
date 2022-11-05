import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int heat;
        System.out.println("Hava durumuna göre öneri proramına hoşgeldiniz.");
        System.out.println("Bugün hava nasıl? ");
        heat=scan.nextInt();
        if (heat<5){
            System.out.println("Hava baya soğuk tam kayak yapmalıkkk.");
        } else if (heat>5 && heat<=15) {
            System.out.println("Bugün çok ılık ve yumuşak bir hava var hadi sinamaya gidelim.");
        } else if (heat>15 && heat<25) {
            System.out.println("Bu hava tam piknik havası.");
        } else if (heat>=25) {
            System.out.println("Hava baya sıcak hadi denize gidelim.");
        }

    }
}
