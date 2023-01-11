package day02methodcreation;

public class Car {

    public String marka = "Honda";
    public int fiyat = 20000;

    public static void main(String[] args) {

        //object nasil olusturulur?
        //1)Class ismini yaziniz 2)Ohjeye ismini veriniz 3) =  4) "new" keyword u kullan 5) Class ismi parantezle beraber(Constructor)
        Car                     myHonda              =          new                         Car();
        System.out.println(myHonda.fiyat);//20000
        System.out.println(myHonda.marka);//Honda
        myHonda.hareketEt();
        myHonda.dur();


        //methodCreation clasindan object olusturduk
        MethodCreation obj = new MethodCreation();
        System.out.println(obj.toplamaYap(3,5));
    }

    public void hareketEt(){
        System.out.println("honda guzel hareket eder");
    }

    public void dur(){
        System.out.println("honda guvenli durur");
    }



}
