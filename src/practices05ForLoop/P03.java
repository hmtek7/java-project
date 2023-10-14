package practices05ForLoop;

import java.util.Scanner;

public class P03 {
      /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)
         */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin yaziniz");
        String str = scan.nextLine();
// Bugün hava oldukca güzel.-> 2
        int aMiktar = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a') {
                aMiktar++;
            } else if (str.toLowerCase().charAt(i) == 'c') {
                break;
            }
        }
        System.out.println("girdiginiz metindeki c karakaterine kadar olan a adeti: "+ aMiktar);

    }
}
