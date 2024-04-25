import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Faktoriyel hesaplanacak sayıyı giriniz! : ");
        int sayi = scanner.nextInt();
        int sonuc = FaktoriyelHesapla(sayi);

        System.out.println(sayi + "! = " + sonuc);


    }

    static  int FaktoriyelHesapla(int sayi){

        if(sayi <= 1)
            return  1;
        else
            return  FaktoriyelHesapla(sayi -1)*sayi;


    }
}