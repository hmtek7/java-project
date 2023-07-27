package day12_string_manipulations;

import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Buyuk yada kucuk kelimesini iceren bir cumle yaziniz");
        String cumle= sc.nextLine();
        if (cumle.contains("buyuk")){
            System.out.println(cumle.toUpperCase());

        } else if (cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());

        }else{
            System.out.println("Cumle buyuk ya da kucuk kelimesi icermiyor");
        }
    }
}
