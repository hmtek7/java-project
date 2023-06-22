package day04_datCasting;

public class Q02ExplicitDataCasting {

    public static void main(String[] args) {

        short num1=1234;
        double num2=num1;
        System.out.println("num2 = " + num2);

        int sayi= (int) num2;
        System.out.println("sayi = " + sayi);


        int sayi2=129;
        byte sayi4=(byte) sayi2;
        System.out.println("sayi4 = " + sayi4);

    }
}
