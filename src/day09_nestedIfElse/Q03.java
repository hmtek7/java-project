package day09_nestedIfElse;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        // Girdiği sayi 5’e bölünüyorsa son rakamını kontrol edin.
        // Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
        // Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        // Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
        Scanner sc=new Scanner(System.in);
        int sayi;
        System.out.println("Dort basamakli bir sayi giriniz");
        sayi=sc.nextInt();
        if (sayi<1000 || sayi>9999){
            System.out.println("lutfen 4 basamakli sayi girdiginize emin olun");

        }else{
            if (sayi%5==0){
                if (sayi%10==0){
                    System.out.println("5'e bolunen cift sayi");
                }else{
                    System.out.println("5'e bolunen tek sayi");
                }
            }else{
                System.out.println("tekrar deneyin");
        }
        }
    }
}
