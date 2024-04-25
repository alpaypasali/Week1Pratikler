import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Bir sayı giriniz :");
            int sayi = scanner.nextInt();
            int toplam = 0;
            while (sayi > 0) {

                toplam += sayi % 10;
                sayi /= 10;


            }
        System.out.println("Girilen sayinin rakamlarının toplamı : " + toplam);
        }
    }
