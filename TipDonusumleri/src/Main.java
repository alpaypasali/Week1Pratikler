import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Tam sayı giriniz: ");
        int tamSayi = scanner.nextInt();

        System.out.print("Ondalıklı sayı giriniz: ");
        double ondalikliSayi = scanner.nextDouble();


        double tamSayiDouble = (double) tamSayi;
        System.out.println("Tam sayının double karşılığı: " + tamSayiDouble);


        int ondalikliSayiInt = (int) ondalikliSayi;
        System.out.println("Ondalıklı sayının tam sayı karşılığı: " + ondalikliSayiInt);
    }
}