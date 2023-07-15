package day10_ternary;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        //verilen karakteri inceleyin,
        // kucuk harf ise consola “Kucuk Harf” ,
        // buyuk harfse consola “Buyuk Harf”
        // yoksa “girdiginiz karakter harf degil” yazdirin.

        Scanner sc=new Scanner(System.in);
        System.out.println("Bir karakter giriniz");
        char ch=sc.next().charAt(0);

       String sonuc=  ch>='a'&&ch<='z'?("kucuk harf"):(ch>='A'&&ch<='Z'? "buyuk harf":"girdiginiz karakter harf degil");
        System.out.println("sonuc = " + sonuc);
    }
}
