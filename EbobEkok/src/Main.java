import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("İlk sayıyı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();


        int a = sayi1;
        int b = sayi2;


        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        int ebob = a;


        int ekok = (sayi1 * sayi2) / ebob;


        System.out.println("EBOB : " + ebob);
        System.out.println("EKOK : " + ekok);
    }
}