import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] lessons = {"Matematik", "Fizik", "Kimya", "Turkce", "Muzik"};
        Map<String, Integer> mappedLessons = new HashMap<>();
        for (String lesson : lessons) {
            System.out.print(lesson + " dersi notunu girin: ");
            int note = scanner.nextInt();
            mappedLessons.put(lesson, note);


        }

        int total = 0;
        int sizeLesson = lessons.length;

        for (int notes : mappedLessons.values()) {
            total += notes;
        }

        double avarge = (double) total / sizeLesson;

        if (avarge < 55) {
            System.out.print("Sınıfta Kaldı");

        } else {
            System.out.print("Sınıftı Geçti");
        }

    }
}