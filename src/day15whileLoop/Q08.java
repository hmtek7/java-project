package day15whileLoop;

import java.util.Scanner;

public class Q08 { public static void main(String[] args) {
    //ex: kullanicidan alinan sayinin carpim tablosunu ekrana yazdirin
    Scanner scan=new Scanner(System.in);
    System.out.println("Lutfen  sayi giriniz");
    int sayi= scan.nextInt();
    int n=1;
    while(n<=10){
        System.out.println(sayi+"X"+n+"="+sayi*n);
        n++;

    }


}
}
