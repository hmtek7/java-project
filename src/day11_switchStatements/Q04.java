package day11_switchStatements;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sayi;
        System.out.println("bir sayi giriniz");
        sayi=sc.nextInt();

        switch (sayi){
            case 10:
                System.out.println("iki basamaklı en kucuk sayi");
                break;
            case 100:
                System.out.println("uc basamaklı en kucuk sayi");
                break;
            case 1000:
                System.out.println("dort basamaklı en kucuk sayi");
                break;
            default:
                System.out.println("girdiginiz sayiyi degistirin");
        }
    }
}
