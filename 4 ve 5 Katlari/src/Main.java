import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        hesaplaVeYazdir(sayi);
    }

    public static void hesaplaVeYazdir(int limit) {
        System.out.println("4'ün ve 5'in kuvvetleri:");
        for (int i = 1; i <= limit; i++) {
            System.out.println("4^" + i + " = " +(int) Math.pow(4, i));

        }
        for (int i = 1; i <= limit; i++) {

            System.out.println("5^" + i + " = " + (int)Math.pow(5, i));
        }
    }
}