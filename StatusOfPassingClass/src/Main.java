import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math;
        int phys;
        int turk;
        int chem;
        int musi;
        int sum;
        boolean isUnder = false;

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen matematik notunu giriniz.");
        while (isUnder==false){
            math = scan.nextInt();
            if (math<=100 && math>=0){
                if(math>=55){
                    System.out.println("Geçtiniz tebrikler..");
                }
                else{
                    System.out.println("Maalesef ortalamanın altındasınız ve kaldınız..");
                }
                isUnder=true;
            }else {
                System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz.");
            }
        }
        isUnder = false;
        while (isUnder==false){
            System.out.println("Lütfen fizik notunu giriniz.");
            phys = scan.nextInt();
            if (phys<=100 && phys>=0){
                if(phys>=55){
                    System.out.println("Geçtiniz tebrikler..");
                }
                else{
                    System.out.println("Maalesef ortalamanın altındasınız ve kaldınız..");
                }
                isUnder=true;
            }else {
                System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz.");
            }
        }
        isUnder = false;
        while (isUnder==false){
            System.out.println("Lütfen türkçe notunu giriniz.");
            turk = scan.nextInt();
            if (turk<=100 && turk>=0){
                if(turk>=55){
                    System.out.println("Geçtiniz tebrikler..");
                }
                else{
                    System.out.println("Maalesef ortalamanın altındasınız ve kaldınız..");
                }
                isUnder=true;
            }else {
                System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz.");
            }
        }
        isUnder = false;
        while (isUnder==false){
            System.out.println("Lütfen kimya notunu giriniz.");
            chem = scan.nextInt();
            if (chem<=100 && chem>=0){
                if(chem>=55){
                    System.out.println("Geçtiniz tebrikler..");
                }
                else{
                    System.out.println("Maalesef ortalamanın altındasınız ve kaldınız..");
                }
                isUnder=true;
            }else {
                System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz.");
            }
        }
        isUnder = false;
        while (isUnder==false){
            System.out.println("Lütfen müzik notunu giriniz.");
            musi = scan.nextInt();
            if (musi<=100 && musi>=0){
                if(musi>=55){
                    System.out.println("Geçtiniz tebrikler..");
                }
                else{
                    System.out.println("Maalesef ortalamanın altındasınız ve kaldınız..");
                }
                isUnder=true;
            }else {
                System.out.println("Lütfen 0 ile 100 arasında bir değer giriniz.");
            }
        }

    }
}
