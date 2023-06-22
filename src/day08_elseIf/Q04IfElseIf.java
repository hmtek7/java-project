package day08_elseIf;

import java.util.Scanner;

public class Q04IfElseIf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double ilkSayi,ikinciSayi;
        System.out.println("İlk sayıyı giriniz");
        ilkSayi=sc.nextDouble();
        System.out.println("İkinci sayıyı giriniz");
        ikinciSayi=sc.nextDouble();

        if (ilkSayi>0&&ikinciSayi>0){
        System.out.println("Sayiların toplamı: "+(ilkSayi+ikinciSayi));


    } else if (ilkSayi<0&&ikinciSayi<0){
            System.out.println("Sayiların carpimi"+(ilkSayi*ikinciSayi));
        } else if (ilkSayi*ikinciSayi<0){
            System.out.println("farklı işaretlerde sayilarla islem yapamazsın");

        } else{
            System.out.println("Sıfır carpmaya göre yutan elemandır");

        }

    }
    }
