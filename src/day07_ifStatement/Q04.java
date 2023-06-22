package day07_ifStatement;

import java.util.Locale;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Gün isimlerinden birini yazınız");

        String gun = scan.next().toLowerCase();
        if (gun.equalsIgnoreCase("pazar")||
                gun.equalsIgnoreCase("cumartesi")){
            System.out.println(" Girdiğiniz gün haftasonudur");
        }//else{
           // System.out.println("girdiğiniz gün hafta içidir");
        if (gun.equalsIgnoreCase("pazartesi")||
                gun.equalsIgnoreCase("sali")||
                gun.equalsIgnoreCase("carsamba")||
                gun.equalsIgnoreCase("persembe")||
                gun.equalsIgnoreCase("cuma")){
            System.out.println("Girdiğiniz gün hafta içidir");
        }
    }
}
