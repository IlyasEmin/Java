package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        // Example 1: Diktörgen en ve boyunu alip alan ve cevresini hesaplayan Code yaziniz

        Scanner input = new Scanner(System.in);

        System.out.println("dikdörtgenin kisa kenarini giriniz");
        int en = input.nextInt();

        System.out.println("dikdörtgenin uzun kenarini giriniz");
        int boy = input.nextInt();

        System.out.println("Alan " + en*boy);
        System.out.println("Cevre " + 2* (en+boy));
    }
}
