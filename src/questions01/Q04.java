package questions01;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*

Kullanicidan alacaginiz vize ve final notlarini
vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz*/


        Scanner scan = new Scanner(System.in);

        int vize1,vize2,finalNotu;

        System.out.println("1. vize notunu giriniz");
        vize1 =scan.nextInt();

        System.out.println("2. vize notunu giriniz");
        vize2 =scan.nextInt();

        System.out.println("final sınavınızın notunu giriniz");
       finalNotu =scan.nextInt();

       double sonuc= ((vize1+vize2)/2*0.3+(finalNotu*0.7));
        System.out.println("ders notu ortalamanız: "+sonuc);


    }
}
