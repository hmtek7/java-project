package day10_ternary;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*

         Kullanıcıdan bir pozitif tamsayı girmesini isteyin, o pozitif tamsayı 3 basamaklı ise
         ekrana “3 Basamaklı” yazdırın.
         3 basamaklı degilse çift olup olmadigini kontrol edin.
         Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
         Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
         */
        Scanner sc=new Scanner(System.in);
        int sayi;
        System.out.println("pozitif tam sayi giriniz");
        sayi=sc.nextInt();

     /*   if (sayi>=100&&sayi<=999){
            System.out.println("uc basamalı");
        }else{
            if (sayi%2==0){
                System.out.println("3 basamaklı olmayan çift sayı");
            } else{
                System.out.println("3 basamaklı olmayan tek sayı");

            }
        }


      */
        String sonuc= (sayi>=100&&sayi<=999)? "uc basamakli":((sayi%2==0)?"3 basamaklı olmayan çift sayı":
                "3 basamaklı olmayan tek sayı");
        System.out.println(sonuc);

    }

}
