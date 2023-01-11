package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner01 {

    // Scanner kullanicidan data almaya yarar.Kullanici ile etkilisim kurmaya yarar.
    // Scanner bir Java Class idir, bu class i kullanabilmek icin Import etmek gerekir.
    // Scanner Class i Javanin util kütüpanesindedir.

    public static void main(String[] args) {

        //Kullanicidan data almak icin yapilmasi gerekenler
        //1.Scanner Classindan object olusturun.
        Scanner input = new Scanner(System.in);

        //2.Kullaniciya ne yapacagini söyle
        System.out.println("Hey kullanici yasini gir...");

        //3. Kullanicidan aldiginiz data yi bir variable in icine koyun
        byte age = input.nextByte();

        System.out.println("hey kullanici senin yasin" + age);
    }
}
