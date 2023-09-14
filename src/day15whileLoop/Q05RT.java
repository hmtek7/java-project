package day15whileLoop;

import java.util.Scanner;

public class Q05RT {
    public static void main(String[] args) {
    //Kullanicidan bir sayi alin
    // ve bu sayinin rakamlari toplamini yazdirin
    Scanner sc=new Scanner(System.in);
    System.out.println("rakamlar toplami icin bir pozitif tamsayi giriniz");
    int sayi=sc.nextInt();
    int birlerBas=0;
    int rkmTop=0;
    int sayac=0;
    while (sayi>0){
        birlerBas=sayi%10;
        rkmTop+=birlerBas;
        sayi/=10;
//             sayac++;
    }
    System.out.println("rkmTop = " + rkmTop);
    System.out.println(sayac);

}
}
