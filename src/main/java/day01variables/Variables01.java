package day01variables;

public class Variables01 {

    //Variable nasil olusturulur?

    //1) Access Modifier   2)Data Type   3)Variable name   4) =       5) Value   6) ;
    // Java da , ";" ingilizcedeki "." gibidir.
    // ingilizcede "cümle" deriz, java da "statement" deriz
    // "=" sembolu "Assignment (atama) Operator" olarak adlandirilir.
    // "Assignment Operator" sagdaki degeri alir soldaki variable in icine atar.

    public int age = 13;

    public int height = 183;

    // Java da Data Type leri

    /*
                    Primitive Data Types
    1)int: Integer in kisaltmasi. Integer tam sayi demektir. 32 bit kullanir.
           Matematik de tam sayilarin basi ve sonu yoktur, fakat JAVA da vardir.
           En kücük int = -2,147,483,648
           En büyük int =  2,147,483,647

    2)byte: Tamsayilar icin kullanilir. 8 bit kullanir.
            En kücük byte -128
            En büyük byte 127

    3)short: Tam sayilar icin. 16 bit kullanir.
            En kücük short -32768
            En büyük short 32767

    4)long: Tam sayilar icindir. Integer dan büyüktür. 64 bit kullanir.

    5)float: Ondalikli sayilar icindir, virgülden sonra 7 basamak icerir
             float degerlerinde sona f veya F konulmalidir

    6)double: Ondalikli sayilar icindir, virgülden sonra 16 basamak icerir

    7)Boolean: "true" veya "false" icin kullanilir, 1 bit kullanir.

    8)char: Tek karakterler icin kullanilir, 16 bit kullanir.
            A, c, 2, ? ....
            char lara deger verirken "" icinde yazilmalidir

            Note: Java buyuk ve kucuk harflere duyarlidir.

     Note : Numeric data types : byte < short < int < long < float < double
            Numeric olmayan Data types : boolean ve Char

                    Non-Primitive Data Types
     String: Isim adres kimlik numarasi gibi bir veya birden fayla karakter iceren degerlerde kullanilir.
             String degerleri cift tirnak icinde kullanilir.
             String olusturdugunuzda size bir sürü method verilir.

             Primitive ile Non-Primitive arasindaki farklar nelerdir?
             1)non-primitive data type'larinda degerin yaninda method`lar vardir
               Primitive data typelarinda ise sadece deger vardir.
             2)Primitive data typelari Java tarafindan olusturulmustur ve toplam 8 tanedir.
               Non-Primitive data typelari Java tarafindan ve kendimiz olusturabiliriz.
             3)Primitive data typleri kücük harfle baslar, non-primitivler büyük harfle baslar.
             4)Primitive data typler memoryde farkli yer kaplar, non primitivler ayni yer kaplar.

     */

    public byte price = 12;

    public short populationOfVillage = 23000;

    /*
        "long" dememize ragmen Java verilen sayiyi integer kabul eder.
        bu yuzden long bir variable a integer disinda bir deger verilirse sonuna L veya l koyunuz.
        eger long integer degerinin icindeyse L koymaya gerek kalmaz
     */
    public long populationOfWorld = 700000000000L;
    public long x = 1234;

    public float priceOfShirt = 13.99F;
    public double weightOfCell = 0.000002323;

    public boolean isOld = true;
    public boolean isRich = false;

    public char aChar = 'A';

    public String name = "Ilyas";

    // main method arabanin motoru gibidir
    // main method calismadan hicbir method calismaz.
    public static void main(String[] args) {
    }

}