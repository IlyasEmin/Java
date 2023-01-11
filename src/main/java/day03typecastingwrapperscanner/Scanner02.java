package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //Example 1 : Sayilari kullanicidan alan ve toplama islemi yapan kodu yaziniz

        //1. Scanner Class dan  object olustur
        Scanner veri = new Scanner(System.in);

        //2. Kullanicya ne yapacagini söyle
        System.out.println("Ilk sayiyi giriniz");
        double sayi1 = veri.nextDouble();

        System.out.println("2. sayiyi gir");
        double sayi2 = veri.nextDouble();

        System.out.println(sayi1+sayi2);
    }

}
