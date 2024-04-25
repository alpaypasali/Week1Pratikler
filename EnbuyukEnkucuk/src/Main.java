import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Girmek istediğiniz sayı miktarını giriniz : ");
        int n = scanner.nextInt();
        int [] diziler = new int[n];

        for(int i = 0 ; i < n ;i++){

            System.out.print(i+1 +". sayıyı giriniz : ");
            diziler[i] = scanner.nextInt();


        }

        int max = 0;
        int min=0;

        for(int i = 0 ; i < n ; i++){

            if(i == 1){
                max=diziler[i];
                min=diziler[i];

            }

            if (diziler[i]>max)
                max=diziler[i];

            if (diziler[i]<min)
                min=diziler[i];



        }

        System.out.println("girdiginiz" + n +" sayi icinden en buyuk olani: "+max);
        System.out.println("girdiginiz" + n + " sayi icinden en kucuk olani: "+min);

    }
}