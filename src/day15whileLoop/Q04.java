package day15whileLoop;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // Kullanicidan toplanmak uzere sayilar isteyin
        // sayi adedi 10'u gecerse ve toplam 500'u gecerse
        // "Bu kadar sayi yeter"
        // ".. adet sayi girdin, toplami ..." yazdirin
        Scanner sc= new Scanner(System.in);

        int sayi=0;
        int adet=0;
        int toplam=0;
        while (adet<10&&toplam<=500){
            System.out.println("Toplamak icin sayi giriniz ");
            sayi=sc.nextInt();
            toplam+=sayi;
            adet++;

        }
        System.out.println("Bu kadar sayi yeter "+adet+
                " adet sayi girdin, girdiginiz sayilarin toplami "+toplam);
    }
}
