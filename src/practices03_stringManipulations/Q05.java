package practices03_stringManipulations;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        // Soru 4) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz ");
        String isim = scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz ");
        String soyisim = scan.nextLine();

        if (isim.length()==soyisim.length()){
            System.out.println("Isim ve soyisiminiz aynı uzunlukta");
        } else if (isim.length()>soyisim.length()){
            System.out.println("Isminiz , soyisminizden daha uzun");

        }else{
            System.out.println("Soyisminiz, isminizden daha uzun");
        }
    }

}
