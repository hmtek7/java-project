package day09_nestedIfElse;

import java.util.Scanner;

public class HW03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println(" Mesafeyi km cinsinden girin");
        double mesafe= sc.nextDouble();

        System.out.println("cm\n m\n Cevirmek istediginiz birimi secin");
        String cevrilen= sc.next();

        if (cevrilen.equalsIgnoreCase("cm")){
            System.out.println((mesafe*100000)+"cm");
        } else if (cevrilen.equalsIgnoreCase("m")){
            System.out.println((mesafe*1000) +"m");

        }else{
            System.out.println("İstediginiz birim sisteme kayıtlı degil");
        }

    }
}
