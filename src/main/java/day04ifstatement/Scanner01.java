package day04ifstatement;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {
        //Kullanicidan personal bilgilerini aliniz ve ekrana yazdiriniz


          Scanner input = new Scanner(System.in);

//        1.yol

//        System.out.println("ilk isminizi giriniz...");
//        String ilkIsim = input.next();//next methodu kulllanicidan String datasi alir
//
//        System.out.println("ikinci isminizi giriniz...");
//        String ikinciIsim = input.next();
//
//        System.out.println("soy isminizi giriniz...");
//        String soyIsim = input.next();
//
//        System.out.println("kimlik no giriniz");
//        String kimlikNo = input.next();
//
//        System.out.println(ilkIsim  + " " + ikinciIsim + " " + soyIsim);
//        System.out.println(kimlikNo);

        // 2.yol

//        System.out.println("isimlerinizi giriniz");
//        String ilk = input.next();
//        String orta = input.next();
//        String soy = input.next();
//        String kimlik = input.next();
//
//        System.out.println( ilk +" "+ orta +" " + soy);
//        System.out.println(kimlik);

        // 3.yol

        System.out.println("Isimlerinizi giriniz");
        String tamIsim = input.nextLine(); // nextline kullanicadan gelen Stringin tamamini alir.
        System.out.println(tamIsim);

        System.out.println("kimlik no giriniz");
        String kimlikno = input.next();
        System.out.println(kimlikno);
    }
}
