package day09_nestedIfElse;

import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bugunun adını giriniz");
        String gun= sc.next();

        if (gun.equalsIgnoreCase("pazartesi")){
            System.out.println("Simdi calisma zamanı tatile 5 gun var");
        } else if (gun.equalsIgnoreCase("sali")){
            System.out.println("Simdi calisma zamanı tatile 4 gun var");

        } else if (gun.equalsIgnoreCase("carsamba")){
            System.out.println("Simdi calisma zamanı tatile 3 gun var");

        } else if (gun.equalsIgnoreCase("persembe")){
            System.out.println("Simdi calisma zamanı tatile 2 gun var");

        } else if (gun.equalsIgnoreCase("cuma")){
            System.out.println("Simdi calisma zamanı tatile 1 gun var");

        }else if (gun.equalsIgnoreCase("cumartesi")){
            System.out.println("Simdi dinlenme zamanı");

        } else if (gun.equalsIgnoreCase("pazar")){
            System.out.println("Simdi dinlenme zamanı");

        }else{
            System.out.println("hatalı gun adı girdiniz");
        }
    }
}
