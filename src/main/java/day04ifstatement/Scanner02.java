package day04ifstatement;

import java.util.Scanner;

public class Scanner02 {

    /*
    char Variable lari matematiksel islemlerle kullanirsaniz, Java onlari ASCII degerlerini kullanir.
    Java da "+" sembolun iki anlami vardir. Toplama ve Birlestirme islemi.Java + sembolünü görünce
    önce toplama yapmaya calisir, yapamazsa birlestirme islemini yapar. "String" kullanimi birlestirmeyi saglar.
     */

    public static void main(String[] args) {

//        // Kullanicidan ilk ve soy isim aliniz, ilk ve soy isimin sadece ilk harflerini yazdiriiniz.
          Scanner input = new Scanner(System.in);
//
//        System.out.println("ilk isminizi giriniz");
//        char ilk = input.next().charAt(0);// A
//
//        System.out.println("soy isim giriniz");
//        char son = input.next().charAt(0);// C
//
//        System.out.println(ilk + son); // 132 "ASCI" degeri... Matamatiksel islem konuldugu icin Asci verir.
//        System.out.println("" + ilk + son);// basta String kullanilirsa, + isareti birlestirme olarak okunur.


        // 2.yol

        System.out.println("Tam isminizi giriniz");
        String tamIsim = input.nextLine(); // Ilyas Okutan

        char ilkHarf = tamIsim.charAt(0);
        char soyIsimIlkHarf = tamIsim.split(" ")[1].charAt(0);
        System.out.println(""+ ilkHarf + soyIsimIlkHarf);
    }
}
