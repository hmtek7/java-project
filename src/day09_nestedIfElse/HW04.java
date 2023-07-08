package day09_nestedIfElse;

import java.util.Scanner;

public class HW04 {
    public static void main(String[] args) {
          /*
    Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
%20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
alirsa %15, yoksa %10 indirim yapin
     */
    /*
    1-urun adeti
    2-urunun fiyati
    3-musteri karti var mi?
    -->10 urunden fazla almissa %20
    yok ise
     %15 indirim yapin
    4-Musteri karti yoksa
  -->  10 urunden fazla alirsa %15
    --> yoksa %10 indirim yapin

     */
        Scanner sc = new Scanner(System.in);
        System.out.println("urun adetini giriniz");
        int adet = sc.nextInt();
        System.out.println("Urunun liste fiyatini giriniz");
        double listeFiyati = sc.nextDouble();
        System.out.println("Musteri kartiniz var mi?(Evet/Hayir ");
        String musteriKarti = sc.next();
        double indirimOrani;
        if (musteriKarti.equalsIgnoreCase("evet")) {
            if (adet >= 10) {
                indirimOrani = 0.2;
            } else {
                indirimOrani = 0.15;
            }
        } else {
            if (adet >= 10) {
                indirimOrani = 0.15;
            } else {
                indirimOrani = 0.1;
            }
        }
        double indirimMiktari = listeFiyati * indirimOrani;
        double odencekTutar = listeFiyati * indirimMiktari;


        System.out.println("indirimMiktari = " + indirimMiktari);
        System.out.println("odencekTutar = " + odencekTutar);

    }
}
