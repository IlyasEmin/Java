package day07ternarystringmanipulation;

public class NestedTernary01 {

    public static void main(String[] args) {

        /*
            Verilen yilin leap year olup olmadigini kontrol ediniz.
            i)Yil 100 e bolünürse 400 e de bölünmelidir
            ii)Yil 100 e bölünmezse 4 e bölünmelidir
         */

        int year = 1600;

        String leap = year%100==0 ? (year%400==0 ? "Leap year" : "leap year degil" ) : (year%4==0 ? "Leap year" : "leap year degil");
        System.out.println(leap);

        /*
            Asagidaki kurallara göre password un dogru olup olmadigini kontrol ediniz
            i)Sekiz karakterden fazla veya sekiz karakter varsa ilk harfi "i" olmalidir
            ii) Sekiz karakterden az ise ilk harfi "k" olmalidir
         */

        String pwd = "i2343456";
        char ilkHarf = pwd.charAt(0);
        String gecerli = pwd.length()<8 ? (ilkHarf=='K'? "gecerli" : "gecersiz") : (ilkHarf=='i' ? "Gecerli" : "gecersiz");
        System.out.println(gecerli);

    }
}
