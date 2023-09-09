package practices01;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        /*
      spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
         */
        Scanner scan = new Scanner(System.in);
        String isim, soyisim;
        System.out.println("İsminizi giriniz: ");
        isim = scan.next();
        System.out.println("Soyisminizi giriniz: ");
        soyisim = scan.next();

        double kilo,boy,devamSuresi;
        System.out.println("Kilonuzu giriniz: ");
        kilo= scan.nextDouble();
        System.out.println("Boyunuzu giriniz: ");
        boy= scan.nextDouble();
        System.out.println("Salona devam edeceğiniz ay süresini giriniz: ");
        devamSuresi= scan.nextDouble();
        double ucret= devamSuresi*20;
        System.out.println("Toplam ucretiniz = " + ucret);

    }
}
