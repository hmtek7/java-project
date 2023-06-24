package day09_nestedIfElse;

import java.util.Scanner;

public class Q01NestedIf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz \nErkek icin ERKEK," +"Kadin icin KADIN seklinde yaziniz");

        String gender= sc.next().toUpperCase();
        System.out.println("Yasinizi giriniz");

        double yas=sc.nextDouble();


        if (gender.equalsIgnoreCase("erkek")){
            if (yas>=65){
                System.out.println("emekli olanilirsin");
            }else{
                System.out.println("emekli olamazsin");
            }
        } else if(gender.equalsIgnoreCase("kadin")) {
            if (yas>=60){
                System.out.println("emekli olabilirsin");
            }else{
                System.out.println("emekli olamazsın");
            }

        }else{
            System.out.println("Gecerli bir cinsiyet girin");
        }


    }
}
