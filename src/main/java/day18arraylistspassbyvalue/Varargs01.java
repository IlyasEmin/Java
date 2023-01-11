package day18arraylistspassbyvalue;

public class Varargs01 {

    /*
    1)Farkli sayilardaki parametlerle calisabilen bir method icin "varargs" kullanilir
    2)"array" kullanir.
    3)Varargs en sonda olmak üzere , baska data tipleri ile kullanilabilir.
    4)Bir method da birden fazla varargs olamaz
     */

    public static void main(String[] args) {

        int r1 = add(2,3);
        System.out.println(r1);//5

        int r2 = add(2,3,4);
        System.out.println(r2);//9

        int r3 = add(2,3,4,5,6);
        System.out.println(r3);//20

    }

//    // Iki sayinin toplamini return eden bir method
//    public static int add(int a, int b) {
//        return a + b;
//    }
//
//    // Uc sayinin toplamini return eden bir method
//    public static int add(int a, int b, int c) {
//        return a + b + c;
//    }


    // Istediginiz kadar sayiyi toplayan method
    public static int add(int... a) {
        int sum = 0;
        for (int w : a) {
            sum = sum + w;
        }
        return sum;
    }


}
