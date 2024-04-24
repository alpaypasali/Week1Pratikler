import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String burc="";
        System.out.print("Doğduğunuz ay :  ");
       int ay = scanner.nextInt();
        if(!(ay<=12 && ay>=1)){
            System.out.println("Geçersiz bir ay girdiniz.\n Program Sonlandırıldı.");
            return;
        }

        System.out.println("Lütfen doğduğunuz günü yazınız");
        int gun=scanner.nextInt();


        if (ay == 1)
        {
            if (gun >21)
                burc="Kova";
            else
                burc="Oğlak";
        }
        if(ay == 2){
            if(gun > 20) burc = "Balık  ";
            else  burc = "Kova ";

        }
        if(ay == 3){

            if(gun > 21) burc = "Koç";
            else  burc = "Balık ";
        }

        if(ay == 4){

            if(gun > 21) burc = "Boğa";
            else  burc = "Koç ";
        }

        if(ay == 5){

            if(gun > 21) burc = "İkizler";
            else  burc = "Boğa ";
        }

        if(ay == 6){
            if(gun > 22) burc = "Yengeç";
            else  burc = "İkizler";
        }

        if(ay == 7){
            if(gun > 22) burc = "Aslan";
            else  burc = "Yengeç";
        }

        if(ay == 8){
            if(gun > 21) burc = "Başak";
            else  burc = "Aslan";
        }

        if(ay == 9){
            if(gun > 22) burc = "Terazi";
            else  burc = "Başak";
        }

        if(ay == 10){
            if(gun > 22) burc = "Akrep";
            else  burc = "Terazi";
        }

        if(ay == 11){
            if(gun > 21) burc = "Yay";
            else  burc = "Akrep";
        }

        if(ay == 12){
            if(gun > 21) burc = "Oğlak";
            else  burc = "Yay";
        }

        System.out.println("Burcunuz :  "+ burc);
    }
}