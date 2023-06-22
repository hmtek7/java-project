package day08_elseIf;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double aKenari,bKenari,cKenari;
        System.out.println("A kenarını giriniz");
        aKenari= sc.nextDouble();
        System.out.println("B kenarını giriniz");
        bKenari= sc.nextDouble();
        System.out.println("C kenarını giriniz");
        cKenari= sc.nextDouble();

        if (aKenari==bKenari&&bKenari==cKenari){
            System.out.println("eşkenar ucgendir.");
        }else{
            System.out.println("eşkenar ucgen degildir.");
        }

    }
}
