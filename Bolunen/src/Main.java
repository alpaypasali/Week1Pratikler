import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        int toplam = 0;
        int tane = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                tane++;
            }
        }

        int ortalma =  toplam / tane;

        System.out.println("0'dan " + n + "'e kadar olan 3 ve 4'e tam bölünen sayıların ortalaması: " + ortalma);

    }
}