package day09_nestedIfElse;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Bir sifre giriniz");
       char ilkHarf= sc.next().charAt(0);
       if (ilkHarf>='A'&& ilkHarf<='Z'){
           if (ilkHarf=='A'){
               System.out.println("Gecerli sifre");
           }else{
               System.out.println("gecersiz sifre");
           }
       } else if (ilkHarf>='a'&&ilkHarf<='z'){
           if (ilkHarf=='z'){
               System.out.println("gecerli sifre");
           }else{
               System.out.println("gecersiz sifre");
           }

       }else{
           System.out.println("Sifrenizin gecerli olması icin harf ile baslayiniz");
       }
    }
}
