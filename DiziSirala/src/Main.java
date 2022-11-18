import java.util.Arrays;
import java.util.Scanner;

    public class Main {
        static void shortArray(int[] array){
            int temp,spinValue;
            spinValue= array.length;
            while (spinValue > 1){
                for (int i=0;i<spinValue;i++){
                    for (int j=0; j<spinValue;j++){
                        if ((i != j) && (array[i] < array[j]) ){
                            temp=array[i];
                            array[i]=array[j];
                            array[j]=temp;
                        }
                    }
                }
                spinValue--;
            }
            System.out.println(Arrays.toString(array));



        }

        public static void main(String[] args) {
            int boundry,n=0,count=0;
            Scanner input=new Scanner(System.in);

            System.out.print("Dizinin Boyutunu Giriniz : ");
            boundry =input.nextInt();
            int[] array = new int[boundry];


            while (count < array.length){
                System.out.print("Dizinin "+(count+1)+". Elemanını Giriniz : ");
                n=input.nextInt();
                array[count]=n;
                count++;
            }

            System.out.println(Arrays.toString(array));
            shortArray(array);

        }
    }

