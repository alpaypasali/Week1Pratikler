import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        int sayi1, sayi2;

        while (running) {
            System.out.println("Lütfen İlk Sayıyı Giriniz.");
            sayi1 = scanner.nextInt();
            System.out.println("Lütfen İkinci Sayıyı Giriniz.");
            sayi2 = scanner.nextInt();
            System.out.println("\nLütfen yapmak istediğiniz işlemi seçiniz : ");
            System.out.println("1- Toplama\n2- Çıkarma\n3- Çarpma \n4- Bölme");
            System.out.print("Seçiminiz : ");
            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Toplama : " + (sayi1 + sayi2));
                    break;
                case 2:
                    System.out.println("Çıkarma : " + (sayi1 - sayi2));
                    break;
                case 3:
                    System.out.println("Çarpma : " + (sayi1 * sayi2));
                    break;
                case 4:
                    System.out.println("Bölme : " + (sayi1 / sayi2));
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz tekrar deneyiniz !");
                    break;
            }

            System.out.print("Devam etmek istiyormusunuz? Y / N :");

            char secilen = scanner.next().charAt(0);

            if (secilen == 'N' || secilen == 'n') {
                running = false;
            }

        }


    }
}


