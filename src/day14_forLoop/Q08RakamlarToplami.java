package day14_forLoop;

import java.util.Scanner;

public class Q08RakamlarToplami {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz");
        int sayi=sc.nextInt();
        sayi=Math.abs(sayi);
        int birlerBas=0;
        int rakamlarToplami=0;
        for (int i = sayi; i >0 ; i--) {
            birlerBas=sayi%10;
            rakamlarToplami+=birlerBas;
            sayi/=10;


        }
        System.out.println(rakamlarToplami);
    }
}
