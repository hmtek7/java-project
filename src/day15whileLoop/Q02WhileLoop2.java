package day15whileLoop;

import java.util.Scanner;

public class Q02WhileLoop2 {
    // kullanicidan toplanmak uzere sayi isteyin
    // kullanici sifira basincaya kadar sayilari alip
    // toplamaya devap edin
    // kullanici sifira bastiginda,
    // o ana kadar sifir haric kac sayi girdigini ve girilen sayilarin toplamini yazdirin
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int toplam=0;
        int sayac=0;
        int sayi=1;
        while (sayi!=0){
            System.out.println("toplamak icin bir sayi giriniz \n bitirmek icin 0 a basiniz");
            sayi=sc.nextInt();
            toplam+=sayi;
            sayac++;
        }
        System.out.println("girilen sayiların toplami: "+toplam);
        System.out.println("girilen sayiların adeti: "+(sayac-1));
    }
}
