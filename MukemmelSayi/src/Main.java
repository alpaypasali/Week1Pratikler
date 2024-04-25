import  java.util.Scanner;  //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if(mukemmel(sayi)) System.out.println(sayi + " mükemmel sayıdır!");
        else System.out.println(sayi + " mükemmel sayı değildir!");
    }

    public static boolean mukemmel(int sayi) {
        if (sayi <= 1) return false;
        int toplam = 0;
        for (int i = 1; i<sayi; i++) {
            if(sayi % i == 0) toplam+=i;
        }
        return sayi == toplam ? true : false;
    }
}
