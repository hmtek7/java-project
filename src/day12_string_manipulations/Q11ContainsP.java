package day12_string_manipulations;

import java.util.Scanner;

public class Q11ContainsP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("E-mail adresinizi yazınız");
        String email=sc.next();
        int uzunluk=email.length();
        int index=email.lastIndexOf("@gmail.com");
        if ((!email.contains("@gmail.com"))&&email.contains("@")){
            System.out.println("Lutfen gmail adresi giriniz");
        } else if (index==uzunluk-10){
            System.out.println("email adresiniz kaydedildi");

        }else{
            System.out.println("lutfen yazimi kontrol edin");
    }
}
}
