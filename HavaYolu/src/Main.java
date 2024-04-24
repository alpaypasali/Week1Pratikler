import  java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean runnig = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Patika Hava Yollarına Hoşgeldiniz");
        double mesafe  = 0;
        int yas  = 0, yolculukTipi = 0;
        while (runnig) {
            System.out.println("Lüften gitmek istediğiniz mesafayi giriniz :");
             mesafe = scanner.nextDouble();
            System.out.println("Lüften yaşınızı giriniz :");
             yas = scanner.nextInt();
            System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) :");
             yolculukTipi = scanner.nextInt();

            if (mesafe < 0 || yas < 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {


                System.out.println("Hatalı Veri Girdiniz ! Lütfen Tekrar giriniz!");


            }
            else
                runnig = false;
        }

         int fiyat = (int)FiyatHesapla(mesafe);

        int indirimOrani = IndirimOrani(yas);

        double indirimliFiyat = fiyat - (int)IndirimHesapla(fiyat,indirimOrani);

        if(yolculukTipi == 2){


           double biletIndirimi  = indirimliFiyat *   0.20 ;

             indirimliFiyat = indirimliFiyat - biletIndirimi;

        }
        int tutar =(int) indirimliFiyat * yolculukTipi;

        System.out.println("Toplam Tutar :" + tutar);



    }


    static double FiyatHesapla(double km){

        return km * 0.10;

    }
    static  double IndirimHesapla(double fiyat , double oran){


        return  fiyat * oran / 100;
    }
    static  int IndirimOrani(int yas){

        if(yas < 12){

            return 50;
        } else if (yas < 24) {


            return  10;

        } else if (yas >= 65) {
            return  30;
        }
        {

           return  1;
        }

        }



}