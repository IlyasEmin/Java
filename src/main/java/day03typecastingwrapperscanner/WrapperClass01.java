package day03typecastingwrapperscanner;

public class WrapperClass01 {

    public static void main(String[] args) {

        /*
             Java primitive lere method lar ekleyerek yeni bir yapi olusturdu, bu yapiya "Wrapper Class" denir.

             Primitive    Wrapper
                byte  >>   Byte
                short >>   Short
                int >>     Integer
                long >>    Long
                float >>   Float
                double >>  Double
                boolean >> Boolean
                char  >>   Character
         */

        byte primitiveByte = 12;// primitiveByte . konulduguunda method göremezsiniz.

        Byte wrapperByte = 12;// wrapperByte . konulduugunda bi sürü method görebilirsiniz.

        // Example : Byte data typendaki en kücük ve en büyük degerlerini ekrana yazdiramlim
        System.out.println(Byte.MIN_VALUE);//-128
        System.out.println(Byte.MAX_VALUE);//127

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        // Primitiveler nasil Wrapper lara cevirilir(Autoboxing)
        float f1 = 13.99F;
        Float wrapperF1 = f1;

        // Wrapper lar nasil Primitive cevirilir (Unboxing)
        Character w1= 's';
        char primitiveW1 = w1;

        // Note: Autoboxing ve Unboxing Java tarafindan otomatik olarak yapilir.




    }
}
