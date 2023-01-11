package day18arraylistspassbyvalue;

public class PassByValue01 {

    public static void main(String[] args) {

        /*
        1)Java Varianle larin ojinal degerlerini korumak ister
        2)Variable methodlar icinde kullanildginda , Java methodun icine orjinal degeri koymaz, o degerin kopyasini uretir
        ve methoda o kopyayi yollar. Method kopya üstünde degisiklik yapar. Dolayisiyla orjinal korunmus olur.
        Bu sisteme "Pass By Value" denir.

        Kopyalama yerine reference veren programlara "Pass By Reference" denir.
         */

        int x = 5;//Gömlek

        //static method olan main methodu un icindeki hersey static olmalidir.
        change(x);//ögreci gömlegi
        System.out.println(x);//5

        int ucret = 100;

        int kopya = indirim(ucret);

        System.out.println(kopya);//90
        System.out.println(ucret);//100

    }

    public static void change (int a){
        System.out.println(a*3);
    }

    //void disindaki return typelarda method body si icinde "return" keyword kullanilmalidir
    public static int indirim (int gomlekucreti){
        return gomlekucreti -10;
    }

}
