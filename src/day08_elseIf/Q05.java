package day08_elseIf;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Notunuzu 100 puan üzerinden girin");
        int not=scan.nextInt();

        if (not<0||not>100){
            System.out.println("lütfen gecerli not giriniz");
        } else if (not>=50&&not<60){
            System.out.println("C");

        } else if (not>=60&&not<80){
            System.out.println("B");

        }else if(not>=80){
            System.out.println("A");
        } else if (not<50){
            System.out.println("D");


        }

    }
}
