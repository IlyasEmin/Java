package day10stringmanipulations;

public class StringManipulations01 {

    public static void main(String[] args) {

        String a = "Java kolaydir";

        boolean b = a.startsWith("va", 2);
        System.out.println(b);//true

        String c = a.replaceFirst("a", "*");
        System.out.println(c);// J*va kolaydir

        String d = a.concat(" anladin mi?");
        System.out.println(d);// Java kolaydir anladin mi?

        String e = "   Tom Hanks   ";
        System.out.println(e);// "    Tom Hanks    "

        String f = a.trim();
        System.out.println(f);// "Tom Hanks"

        String h = "Java";
        String i = "Java";

        int k = h.compareTo(i);
        System.out.println(k);

        String n = a.repeat(3);
        System.out.println(n);




    }
}
