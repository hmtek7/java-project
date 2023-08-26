package day13methodCreation;

import java.util.Scanner;

public class Q03McP {  //Kullanicidan iki sayi isteyin
    // sayilarin karelerini ve kuplerini toplayip yazdiran iki ayri method yazin
    // kullaniciya us sorun
    // 2 yazarsa kareleri toplamini yapan method, 3 yazarsa kupler toplamini yapan method calissin
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz");
        int sayi1=sc.nextInt();
        System.out.println("Ikinci sayiyi giriniz");
        int sayi2=sc.nextInt();
        System.out.println("girilen sayilarin kareler toplamini yapmak icin 2\n"+
                "kupler toplamini yapmak icin 3 e basiniz");
        int secim= sc.nextInt();
        switch (secim){
            case 2:
                karelerToplami(sayi1,sayi2);break;
            case 3:
                kuplerToplami(sayi1,sayi2);break;


        }
    }
    public static void kuplerToplami(int x,int y){
        int kupToplami=(x*x*x)+(y*y*y);
        System.out.println("kupler toplami: "+kupToplami);
    }
    public static void  karelerToplami(int sayi1,int sayi2){
        int kT= (sayi1*sayi1)+(sayi2*sayi2);
        System.out.println("kareler toplamı: "+kT);
    }
}
