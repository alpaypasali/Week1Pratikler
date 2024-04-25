import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Basamak Sayısını Giriniz: ");
        int sayi = input.nextInt();


        for (int i = sayi; i >= 1; i--) {

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}