package day12_string_manipulations;

import java.util.Scanner;

public class Q15Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Isminizi giriniz");
        String isim=sc.next();
        System.out.println("Soyisminizi giriniz");
        String soyIsim=sc.next();
        System.out.println("16 haneli KK numaranizi bosluk birakmadan giriniz");
        String kkNo=sc.next();
        String formatliIsim=isim.substring(0,1).toUpperCase()
                +isim.substring(1).replaceAll("[a-zA-Z]","*");
        String fSoyisim=soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("[a-zA-Z]","*");
        //String KKFormat="**** **** ****"+kkNo.substring(12);
        String KKFormat=kkNo.substring(0,12).replaceAll("[0-9]","*")+kkNo.substring(12);
        System.out.println(formatliIsim);
        System.out.println(fSoyisim);
        System.out.println(KKFormat);
    }
}
