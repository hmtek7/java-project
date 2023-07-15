package day10_ternary;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch;
        System.out.println("Bir karakter girin");
        ch=sc.next().charAt(0);
     /*   if ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
            if (ch>=97&&ch<=122){
                System.out.println("kucuk harf");
            }else{
                System.out.println("buyuk harf");
            }

        } else {
            System.out.println("harf degil");
        }
      */
        String sonuc= ((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))?
                ((ch>=97&&ch<=122)?"kucuk harf":"buyuk harf"):"harf degil";
        System.out.println(sonuc);

    }
}
