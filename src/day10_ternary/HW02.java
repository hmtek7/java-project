package day10_ternary;

import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz");
        int sayi= sc.nextInt();
        String sonuc= sayi>=100 && sayi<=999? "Sayiniz uc basamaklıdır":"Sayiniz uc basamaklı degildir";
        System.out.println(sonuc);
    }
}
