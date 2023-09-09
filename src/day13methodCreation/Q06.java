package day13methodCreation;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println(" Adinizi giriniz");
        String isim=scan.next();
        System.out.println(" Tuttugunuz takimi giriniz");
        String takim=scan.next();
        System.out.println("Ugurlu sayinizi giriniz");
        int sayi=scan.nextInt();
        info(isim,takim,sayi);
        //email kontrolu yap
        //Q07den obje uretip methodu cagirip kullandik
        Q07 ec=new Q07();
        ec.emailControl("ali@gmail.com");
    }
    public static void info(String name,String takim, int sayi){
        System.out.println("Benim adim "+name.toUpperCase()+" "+" Tuttugum takim "+ takim.toUpperCase()+" "+"Ugurlu sayim "+sayi);

    }
}
