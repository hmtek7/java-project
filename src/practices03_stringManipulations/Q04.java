package practices03_stringManipulations;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*
         Soru 3) Kullanicidan isim isteyin. Eger

isim “a” harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
isim “a” ve  “Z” harfi iceriyorsa “Girdiginiz isim a ve Z harfi iceriyor”
ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin

         */
        Scanner sc= new Scanner(System.in);
        System.out.println("Isminizi giriniz");
        String isim=sc.next();

        if (isim.contains("a")&&isim.contains("Z")){
            System.out.println("Girdiginiz isim a ve Z harfi iceriyor");
        } else if (isim.contains("a")){
            System.out.println("Girdiginiz isim a harfi iceriyor");

        } else if (isim.contains("Z")){
            System.out.println("Girdiginiz isim Z harfi iceriyor");

        }else{
            System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
        }
        /* Scanner sc= new Scanner(System.in);
        System.out.println("Isminizi giriniz");
        String isim=sc.next();

        if (isim.contains("a")||isim.contains("A")&&isim.contains("z")||isim.contains("Z")){
            System.out.println("Girdiginiz isim a ve Z harfi iceriyor");
        } else if (isim.contains("a")||isim.contains("A")){
            System.out.println("Girdiginiz isim a harfi iceriyor");

        } else if (isim.contains("z")||isim.contains("Z")){
            System.out.println("Girdiginiz isim Z harfi iceriyor");

        }else{
            System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
        }

         */
    }
}
