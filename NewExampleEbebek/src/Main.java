import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int index = scan.nextInt();
        int sum = 0;
        while (index%2!=1){
            index = scan.nextInt();
            if (index%2==0 && index%4==0){
                sum+=index;
            }
        }
        System.out.println(sum);
    }
}
