package day07_ifStatement;

import java.util.Scanner;

public class Q02IfElse02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int sayi=scan.nextInt();
        if (sayi%2==0) {
            System.out.println(sayi+" sayisi cift sayidir");
        }else{
            System.out.println(sayi+" sayisi tek sayidir");
        }
    }
}
