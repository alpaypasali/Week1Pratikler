import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean runnig = true;
        Scanner scanner = new Scanner(System.in);
        String kullanıcıAdı , sifre;
        System.out.println("Lütfen kullanıcı adı giriniz! :");
        kullanıcıAdı = scanner.next();
        System.out.println("Lütfen şifre giriniz! :");
        sifre = scanner.next();


        System.out.println("Şifrenizi Güncellemek İster misiniz? : Y / N");
        char secilen = scanner.next().charAt(0);
        if(secilen == 'N' || secilen == 'n')
            return;
        else{

            while (runnig){
                String  yeniSifre="";
                System.out.println("Lütfen yeni şifre giriniz! :");
                yeniSifre = scanner.next();

                if(sifre.equals(yeniSifre)){


                    System.out.println("Son şifreden farklı olmalı, lütfen başka şifre giriniz!:");

                }
                else{


                    System.out.println("Şifre oluşturuldu!");
                    runnig = false;
                }





            }

        }



    }


}