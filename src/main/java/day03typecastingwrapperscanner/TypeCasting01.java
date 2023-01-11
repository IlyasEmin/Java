package day03typecastingwrapperscanner;

public class TypeCasting01 {

    //Type Casting : Bir numeric data type diger numeric data type cevirmektir.
    //               byte < short < int < long < float < double
    // Auto widening : Kücükten büyüge
    // Explicit Narrowing : Büyükten kücüge

    public static void main(String[] args) {

        byte age = 23;
        int newAge = age;

        long population = 1234;
        int newPopulation = (int)population;

        //example 1: short u double a ceviren kodu yaziniz
        short numOfStudents = 235;
        double newNumOfStudents = numOfStudents;

        // example 2: float i byte yapan kodu yaziniz
        float price = 12.99F;
        byte newPrice = (byte)price;

        System.out.println(newPrice);//12 ==> Java ondalik sayiyi tam sayiya cevirken ondalik kismini siler.

        int number = 515;
        byte newNumber = (byte)number;
        System.out.println(newNumber); // 3 > Java 515 i 256ya(byte daki sayilarin toplami) böldü kalani return etti.

        int num = 510;
        byte newNum = (byte) num;
        System.out.println(newNum); // -2

    }

}
