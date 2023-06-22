package day05_increment_decrement;

import java.util.Scanner;

public class Q05_Practice {
    public static void main(String[] args) {
        /*Kullanıcıdan alınan üç basamaklı tam
         sayının rakamları toplamını hesaplayınız
         */
        Scanner scan=new Scanner(System.in);

        System.out.println("3 basamakli tam sayi giriniz");
        int sayi= scan.nextInt();

        int birlerBas=0;
        int toplam=0;
        int girilenSayi=sayi;

        birlerBas=sayi%10;
        toplam+=birlerBas;
        sayi/=10;

        birlerBas=sayi%10;
        toplam+=birlerBas;
        sayi/=10;

        birlerBas=sayi%10;
        toplam+=birlerBas;
        sayi/=10;

        System.out.println("girilen sayinin  = " + girilenSayi+" "+
                "Basamak toplamı: "+toplam);

    }
}
