package questions02;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
        Scanner sc=new Scanner(System.in);
        int yas,kilo;
        System.out.println("Yasinizi giriniz");
        yas=sc.nextInt();
        System.out.println("Kİlonuzu giriniz");
        kilo=sc.nextInt();

        if (yas>0&&yas<18){
            System.out.println("Kan bagisi yapamaz");
        } else if (yas>=18){
            if (kilo>0&&kilo<50){
                System.out.println("18 yasindan buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz");
            } else if (kilo>=50){
                System.out.println("18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.");

            }else{
                System.out.println("kilonuzu yanlıs girdiniz");
            }


        } else{
            System.out.println("yasinizi yanlıs girdiniz");
        }



    }
}
