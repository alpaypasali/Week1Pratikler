import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Üssü alınacak sayıyı giriniz :");
            int sayi1 = scanner.nextInt();
            System.out.println("Üssü olacak sayıyı giriniz :");
            int sayi2 = scanner.nextInt();

            int total =1 ;

            for(int i = 0 ; i < sayi2 ; i++){

                total *= sayi1;

            }

            System.out.println( sayi1+"^ =" + total );
    }
}