package day06nestedifswitch;

import java.util.Scanner;

public class Switch03 {

    public static void main(String[] args) {

        //Note: Switch de (parantez icinde) sadece int, byte, short, char, String data tipleri kullanilabilir.
        //Note: Eger 3 den fazla ddurum varsa Switch tercih edilebilir.

        //Kullanicidan islem ve iki tane sayi alarak islemin sonucunu ekrana yazdiran bir hesap makinasi yapiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Islem giriniz + - * % ");
        char islem = input.next().charAt(0);

        System.out.println("ilk sayiyi giriniz");
        double ilk = input.nextDouble();

        System.out.println("ikinci sayiyi giriniz");
        double ikinci = input.nextDouble();

        switch (islem){

            case '+':
                System.out.println(ilk + ikinci);
                break;
            case '-':
                System.out.println(ilk - ikinci);
                break;
            case '*':
                System.out.println(ilk * ikinci);
                break;
            case '/':
                System.out.println(ilk / ikinci);
                break;
            case '%':
                System.out.println(ilk * ikinci / 100);
                break;
            default:
                System.out.println("tanimlanmamis islem");

        }
    }
}
