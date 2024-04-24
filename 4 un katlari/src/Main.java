import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int sayi ,toplam =0;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Sayı giriniz : ");
            sayi = scanner.nextInt();
            if (sayi %4==0) {
                toplam += sayi;
            }
        }while (sayi % 2 == 0);

        System.out.println("Toplam :" + toplam);
    }
}