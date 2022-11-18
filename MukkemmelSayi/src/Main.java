import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b=0;
        System.out.print("Bir Sayı Giriniz:");
        a= input.nextInt();

        for(int i=1;i<a;i++){
            if(a%i==0){
                b+=i;
            }
        }
        if(b==a){
            System.out.print(a+" mükemmel sayıdır.");
        }else{
            System.out.print(a+" mükemmel sayı değildir.");
        }

    }
}
