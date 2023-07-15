package day10_ternary;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int sayi;
        System.out.println("Bir sayi giriniz");
        sayi=sc.nextInt();

        String sonuc= sayi>=0? (sayi<10? "Rakam":"Pozitif sayi"):"Negatif sayi";
        System.out.println(sonuc);
    }
}
