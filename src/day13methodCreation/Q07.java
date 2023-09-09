package day13methodCreation;

import java.util.Scanner;

public class Q07 { /*
		 Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre
			- @ isareti icermiyorsa gecersiz email yazdirin
			- @gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin
			- @gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz”
		 */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Emailinizi giriniz");
        String email= sc.next();
        emailControl(email);
    }

    public static void emailControl(String email){
        if(!email.contains("@")){
            System.out.println("gecersiz email");

        } else if (!email.contains("@gmail.com")) {
            System.out.println("lutfen gmail adresinizi girin");

        } else if (!email.endsWith("@gmail.com")) {
            System.out.println("Yazimda bir sorun var, maili kontrol ediniz");

        }else{
            System.out.println("gecerli mail giris basarili");
        }

    }




}

