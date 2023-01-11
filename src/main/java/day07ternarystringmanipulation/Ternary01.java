package day07ternarystringmanipulation;

public class Ternary01 {

    public static void main(String[] args) {

        //Example 1: Bir sayinin pozitif mi negativ mi oldugunu yazdiran kodu yaziniz

        //1.yol

        int a = -12;

        if (a>0){
            System.out.println("pozitif");
        }else {
            System.out.println("negativ");
        }

        //2.yol Ternary
               //      Conditon ? dogru ise : yanlis ise
        String sonuc = a>0 ?      "positiv" : "negativ";
        System.out.println(sonuc);

        //Example 2: Iki sayidan kücük olani secen kodu yaziniz

        int b = 12;
        int c = 23;

        int min = b<c ? b : c;
        System.out.println(min);

        //Example 3: Verilen sayinin mutlak degerini hesaplayan kodu yaziniz
        //           Pozitiv sayilarin ve sifirin mutlak degeri kendileridir
        //           Negativ sayilarin mutlak degeri -1 ile carpilmis halleridir

        int d = -45;
        int abs = d<0 ? -1*d : d;
        System.out.println(abs);

        //Example 4: Iki sayi ayni isaretli ayni ise sayilari carp, farkli ise islem yapamam mesaji ver

        int e= 12;
        int f= 10;

        // Ternary farkli data tiplerinde sonuc return ederse sonucun data tipini "Object" yapmalisiiniz.
        Object islem = (e>0 && f>0) || (e<0 && f<0) ? e*f : "islem yapamam";
        System.out.println(islem);

        // Note: Java da her class in en az bitane "parent" kilasi vardir.
        // Sadece Object class in parent class i yoktur
    }
}
