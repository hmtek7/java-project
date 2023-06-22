package day08_elseIf;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Bir karakter giriniz");
        char ch=sc.next().charAt(0);

        if ((ch>='A'&& ch<='Z') ||(ch>='a'&& ch<='z')){
            System.out.println("girdiğiniz"+ ch+ "harftir");

    }else{
            System.out.println("girdiğiniz"+ ch+ "harf değildir");
}
}}
