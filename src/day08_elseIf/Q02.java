package day08_elseIf;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        //             eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”,
        //            65’e esit veya buyukse “Emekli olabilirsin” yazdirin
        Scanner sc=new Scanner(System.in);
        System.out.println("Yaşınızı giriniz");
        int yas= sc.nextInt();

        if (yas<65){
            System.out.println("Emekli olamazsın,calismalisin");
        } else if (yas>=65&&yas<=100){
            System.out.println("emekli olabilirsin");

        } else {
            System.out.println("lütfen gecerli yas girin");

        }
    }
    }

