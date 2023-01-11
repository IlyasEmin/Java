package day02methodcreation;

public class MethodCreation {

    //main methodu icinde kullanacaginiz hersey "static" olmalidir
    public static void main(String[] args) {

       System.out.println(toplamaYap(1.2, 5));
       System.out.println(ucSayiyiCarp(2,1.5,6));
       System.out.println(ilkIkiyiToplaUcuncuIleCarp(2, 8, 3.2));
       // sout shortcut for system out println

    }

    // Example 1: Toplama yapan bir method olusturunuz.
    public static double toplamaYap (double a, double b){

        return a+b;
    }

    // Example 2: 3 sayiyi birbiri ile carpan bir method olusturunuz.
    public static double ucSayiyiCarp(double a, double b, double c){
        return a*b*c;
    }

    // Example 3: 3 sayida 2sini toplayip 3. ile carpan bir method olusturunuz.
    public static double ilkIkiyiToplaUcuncuIleCarp(double a, double b, double c){
        return (a+b) * c;
    }
}
