package day18arraylistspassbyvalue;

public class MethodOverloading01 {
    /*
        1)Method isimleri ayni olmalidir
        2)Method parametleri farkli olmalidir
            i)sayilari degisebilir
            ii)data tipleri degistirilebilir
            iii)farkli data tiplerinde, yerlerini degistirebilirsiniz
       3) Method ismi + parametreler = Mehod Signature
       4) Signature disindaki degisikliklikler farklilik olarak kabul edilmez.
     */
    public static void main(String[] args) {

        add(3,5);
        add(3,5.0);

    }

    public static void add(int a, int b){
        System.out.println(a+b);
    }

    public static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public static void add(int a, double b){
        System.out.println(a+b);
    }

    public static void add(double a, int b){
        System.out.println(a+b);
    }




}
