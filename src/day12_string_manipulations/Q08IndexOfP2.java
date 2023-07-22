package day12_string_manipulations;

import java.util.Scanner;

public class Q08IndexOfP2 {
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
        int index= cumle.indexOf(kelime);
        if (index<0){
            System.out.println("Girilen kelime cumlede kullanilmamistir.");
        } else if (cumle.indexOf(kelime,index+1)==-1){
            System.out.println("kelime cumlede bir kere kullanilmis");

        }else{
            System.out.println("Birden fazla kullanilmis");
        }

    }
}
