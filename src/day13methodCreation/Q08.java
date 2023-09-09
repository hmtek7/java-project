package day13methodCreation;

import java.util.Scanner;

public class Q08 {
    /*
		 Kullanicidan bir sayi alin.
		 Bu sayinin tek mi cift mi oldugunu,
		 sifirdan buyuk mu kucuk mu oldugunu,
		 ayrica ve
		 sayi 100’den buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
		 	100’den kucukse sadece 1’ler basamagini yazdiran 3 method olusturun.
		 */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz");
        int sayi=sc.nextInt();

        tekcift(sayi);
        buyukKucuk(sayi);
        yuzdenBuyuk(sayi);
    }

    public static void tekcift(int sayi){
        if (sayi%2==0){
            System.out.println("Sayi cift sayidir.");

        }else if (sayi%2!=0||sayi%2==(-1)){
            System.out.println("sayi tek sayidir");

        }else{
            System.out.println("gecersiz ifade girdiniz");
        }

    }
    public static void buyukKucuk(int sayi){
        if (sayi>0){
            System.out.println("Sayiniz pozitif bir sayi");
        } else if (sayi<0){
            System.out.println("Sayiniz negatif bir sayi");

        }else{
            System.out.println("Sayiniz pozitif veya negatif degil");
        }
    }
    public static void yuzdenBuyuk(int sayi){
        if (sayi>100){
            int birlerBasamagi=0;
            int rakamlarToplami=0;

            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;
            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;
            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;
            System.out.println("Basamak rakamlarının toplami: "+rakamlarToplami);


        }else if (sayi<100){

            int birlerBasamagi=sayi%10;
            System.out.println("birler basamagi: "+birlerBasamagi);
        }else{
            System.out.println("gecersiz sayi");
        }
    }
}
