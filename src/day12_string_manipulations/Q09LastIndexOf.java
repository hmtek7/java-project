package day12_string_manipulations;

import java.util.Scanner;

public class Q09LastIndexOf {
    public static void main(String[] args) {
        //     Kullanicidan bir cumle ve bir kelime isteyin,
        //        kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
        //        - Girilen kelime cumlede kullanilmamis.
        //        - Girilen kelime cumlede 1 kere kullanilmis.
        //        - Girilen kelime cumlede 1’den fazla kullanilmis.

        Scanner sc= new Scanner(System.in);
        System.out.println("Bir cumle giriniz");
        String cumle= sc.nextLine();
        System.out.println("Bir kelime giriniz");
        String kelime= sc.next();
        int ilkIndex=cumle.indexOf(kelime);
        int sonIndex=cumle.lastIndexOf(kelime);
        if (ilkIndex<0){
            System.out.println("Kelime cumlede kullanilmamis");
        } else if (ilkIndex==sonIndex){
            System.out.println("Girilen kelime cumlede 1 kere kullanilmis");

        }else{
            System.out.println("Girilen kelime cumlede birden fazla kullanilmis");
        }
    }
}
