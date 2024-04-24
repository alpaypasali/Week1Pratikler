import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int atama;
        int [] sayilar = new int[3];

        for(int i = 0; i < 3; i++)
        {
            System.out.print( (i+1) + ". Sayıyı Giriniz: ");
            sayilar[i] = scanner.nextInt();
        }
        System.out.println("Küçükten Büyüğe Sıralama:");
        for(int i = 0; i < 2; i++)
        {
            for(int j = i+1; j < 3; j++)
            {
                if(sayilar[j] < sayilar[i]) {
                    atama = sayilar[i];
                    sayilar[i] = sayilar[j];
                    sayilar[j] = atama;
                }
            }
        }
        System.out.print("Sıralı Hali : ");
        for(int i = 0; i < 3; i++)
        {
            System.out.print( sayilar[i] + "-" ) ;
        }
    }
}