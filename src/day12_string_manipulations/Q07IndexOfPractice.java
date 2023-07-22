package day12_string_manipulations;

import java.util.Scanner;

public class Q07IndexOfPractice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Bir cumle giriniz");
        String cumle=sc.nextLine();
        System.out.println("bir harf giriniz");
        char harf=sc.next().toUpperCase().charAt(0);
        int index=cumle.indexOf(harf);

        if (index==-1){
            System.out.println("Girdiginiz harf cumlede yok");
        }else{
            System.out.println("Girdiginiz harf cumlede: "+index+ "indexte yer alir");
        }
    }
}
