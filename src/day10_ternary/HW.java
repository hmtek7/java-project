package day10_ternary;

import java.util.Scanner;

public class HW {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int uzunluk,genislik;
        System.out.println("Uzunlugu girin");
        uzunluk=sc.nextInt();
        System.out.println("genisligi girin");
        genislik=sc.nextInt();

        String sonuc= uzunluk==genislik? "şekil karedir":"şekil dikdörtgendir";
        System.out.println("sonuc = " + sonuc);
    }
}
