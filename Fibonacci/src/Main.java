import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Eleman sayısını giriniz: ");
        int elemanSayisi = input.nextInt();

        System.out.println("Fibonacci serisi:");


        for (int i = 1; i <= elemanSayisi; ++i) {
            System.out.print(fibonacci(i) + " ");
        }


    }


    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}