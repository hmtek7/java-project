package questions01;

import java.util.Scanner;

public class Q08 {
    /*

Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki
basamagindaki rakamlari toplamini bulunuz*
Ex :
input  : 12345
output : 12
*/
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("5 basamaklı bir sayı giriniz: ");
      String sayi = scan.next();

      int ilkİki= Integer.parseInt(sayi.substring(0,1))+Integer.parseInt(sayi.substring(1,2));
      int sonİki= Integer.parseInt(sayi.substring(3,4))+Integer.parseInt(sayi.substring(4,5));
        System.out.println(ilkİki+sonİki);
    }
}
