package questions01;

import java.util.Scanner;

public class Q09 {
    public static void main(String[] args) {
        /*

Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki
basamagindaki rakamlari toplamini bulunuz*
Ex :
input  : 12345
output : 12
*/

            Scanner scan= new Scanner(System.in);

            System.out.println("5 basamaklı bir sayı giriniz: ");
            int sayi = scan.nextInt();

            int ilkIki=sayi/1000;
            int sonIki=sayi%100;
            int ilkIkiToplam= (ilkIki%10)+(ilkIki/10);
            int sonIkiToplam= (sonIki%10)+(sonIki/10);
        System.out.println("ilk iki ve son iki basamağının toplamı: "+(ilkIkiToplam+sonIkiToplam));
    }
}
