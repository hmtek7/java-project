package day09_nestedIfElse;

import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        double num= sc.nextDouble();

        if (num%2==0){
            if (num%10==0){
                System.out.println("Sayiniz onun katı");
            }else{
                System.out.println("sayiniz onun katı degil");
            }

        }else{
            if (num<0){
                System.out.println("Sayiniz negatif");
            }else{
                System.out.println("Sayiniz pozitif");
            }
        }


    }
}
