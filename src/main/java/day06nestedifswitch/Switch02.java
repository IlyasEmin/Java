package day06nestedifswitch;

import java.util.Scanner;

public class Switch02 {

    public static void main(String[] args) {

        /*
        Kullaniciya ay ismini sorunuz ve kullanicinin verdigi ay isminden son aya kadar ekrana yaziniz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Ay ismini giriniz");
        String ayIsmi = input.next().toLowerCase();

        switch (ayIsmi){
            case "ocak":
                System.out.println("Ocak");
            case "subat":
                System.out.println("Subat");
            case "Mart":
                System.out.println("Mart");
            case "nisan":
                System.out.println("Nisan");
            case "mayis":
                System.out.println("Mayis");
            case "haziran":
                System.out.println("Haziran");
            case "temmuz":
                System.out.println("Temmuz");
            case "agusos":
                System.out.println("Agustos");
            case "eylül":
                System.out.println("Eylül");
            case "ekim":
                System.out.println("Ekim");
            case "kasim":
                System.out.println("Kasim");
            case "aralik":
                System.out.println("Aralik");
                break;
            default:
                System.out.println("gecerli ay ismi giriniz");
        }

    }
}
