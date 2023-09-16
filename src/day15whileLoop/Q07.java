package day15whileLoop;

import java.util.Scanner;

public class Q07 {
    // kullanicidan bir sayi alip faktoriyelini bir method create ederek bulunuz
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi= sc.nextInt();
        faktoriyel(sayi);
    }

    public static void faktoriyel(int sayi){
       int n=1;
        while (sayi>0){
            n*=sayi;
            sayi--;

        }
        System.out.println(n);
    }
}
