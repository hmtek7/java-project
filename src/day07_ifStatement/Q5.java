package day07_ifStatement;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
double kenarBir,kenarIki;
        System.out.println("İlk kenarı giriniz");

        kenarBir= scan.nextDouble();

        System.out.println("İkinci kenarı giriniz");
        kenarIki= scan.nextDouble();

        if(kenarIki==kenarBir){
            System.out.println("Karedir");
        }else{
            System.out.println("dikdörtgendir");
        }


    }
}
