package day15whileLoop;

import java.util.Scanner;

public class Q06 {
    //Kullanicidan bir sayi alin
    // ve bu sayiyi tam bolen sayilari
    //ve toplam kac tane olduklarini ekranda yazdirin
    public static void main(String[] args) {
        //Kullanicidan bir sayi alin
        // ve bu sayiyi tam bolen sayilari
        //ve toplam kac tane olduklarini ekranda yazdirin
        Scanner sc=new Scanner(System.in);
        System.out.println("bir pozitif tamsayi giriniz");
        int sayi=sc.nextInt();
        int bolen=1;
        int sayac=0;

        while (bolen<=sayi){
            if (sayi%bolen==0){
                System.out.println(bolen+" ");
                sayac++;
            }
            bolen++;
        }
        System.out.println("");
        System.out.println(sayi+ " sayisinin "+sayac+" adet tam boleni vardir");
    }
}
