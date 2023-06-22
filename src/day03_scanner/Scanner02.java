package day03_scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Adinizi giriniz");
        String ad= scan.next();


        System.out.println("Soyadinizi giriniz");
        String soyad= scan.next();

        System.out.println("Yasinizi giriniz");
        int yas= scan.nextInt();

        System.out.println("Boyunuzu giriniz");
        double boy=scan.nextDouble();

        System.out.println("Sevdiginiz karakteri giriniz");
        char ch=scan.next().charAt(0);

        System.out.println("Adim: "+ad+" "+"Soyadim:"+soyad+" "+
                "Yasim: "+yas+" "+"Boyum: "+boy+" "+"Sevdigim karakter: "+ch);




    }



}
