package day06nestedifswitch;

public class NestedIf01 {

    public static void main(String[] args) {

        /*
        Password un ilk Harfi büyük harf ise
            A olursa gecerli degilse gecersiz password
        Password un ilk harfi kücük harf ise
            z olursa gecerli degilse gecersiz password

        Note = Java Nested kodlari calistirirken cok zaman harcar buna "Time Complexity" denir
         */

        String pwd = "Axy12!";

        char ilkHarf = pwd.charAt(0);

        if (ilkHarf>='A' && ilkHarf<='Z'){
            if (ilkHarf=='A'){
                System.out.println("Gecerli Password");
            }else {
                System.out.println("Gecersiz Password");
            }
        }else if (ilkHarf>='a' && ilkHarf<='z'){
            if (ilkHarf=='z'){
                System.out.println("gecerli Password");
            }else {
                System.out.println("gecersiz Password");
            }
        }else {
            System.out.println("ilk karakter harf olmalidir");
        }

    }
}
