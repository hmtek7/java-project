package day12_string_manipulations;

import java.util.Scanner;

public class Q12Starts_Ends_With {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("cumle giriniz");
        String cumle=sc.nextLine();
        System.out.println("kelime giriniz");
        String kelime= sc.next();

        if (cumle.startsWith(kelime)){
            System.out.println("girilen kelime: "+kelime+ "ile basliyor");
        }else{
            System.out.println("girilen kelime: "+kelime+ "ile baslamiyor");
        }

        if (cumle.endsWith(kelime)){
            System.out.println("girilen kelime: "+kelime+ "ile bitiyor");
        }else{
            System.out.println("girilen kelime: "+kelime+ "ile bitmiyorm");
        }
    }
}
