import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Random r=new Random(); //random sınıfı
        int sicaklik=r.nextInt(40);

        System.out.println("Hava Durumu Tahmini Prgoramı");

        Map<String, Integer> etkinlik = new HashMap<>();
        etkinlik.put("Kayak" , 5);
        etkinlik.put("Sinema" , 15);
        etkinlik.put("Kayak" , 25);
        etkinlik.put("Yüzme" ,40);

        for (Map.Entry<String, Integer> entry : etkinlik.entrySet()) {
            String activity = entry.getKey();
            int etkinlikSicaklik = entry.getValue();

            if (etkinlikSicaklik >= sicaklik) {
                System.out.println("Hava sıcaklığı " + sicaklik + " derece olduğu için " + activity + " yapılabilir.");
                return;
            }
        }






    }
}