package day03_scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Ilk sayiyi giriniz");
        int sayi1= input.nextInt();

        System.out.println(" Ikinci sayiyi giriniz");
        int sayi2=input.nextInt();

        System.out.println(sayi1 +sayi2);
        System.out.println(sayi1 -sayi2);
        System.out.println(sayi1 *sayi2);
        System.out.println(sayi1 /sayi2);
    }
}
