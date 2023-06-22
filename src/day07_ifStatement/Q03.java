package day07_ifStatement;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Gün isimlerinden birinin ilk harfini yazınız");

        char basHarf= scan.next().toUpperCase().charAt(0);

        if (basHarf=='P'){
            System.out.println("Pazartesi, Pazar, Perşembe");

        }
        if (basHarf=='S'){
            System.out.println("Salı");

        }
        if (basHarf=='C'){
            System.out.println("Carsamba, Cuma, Cumartesi");

        }
        if (basHarf!='C' && basHarf!='P'&& basHarf !='S'){
        System.out.println("Gecersiz bir harf girdiniz, lütfen gün isimlerinin birininbaş harfini girin");
    }

}}
