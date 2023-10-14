package practices05ForLoop;

import java.util.Scanner;

public class P13 {
    public static void main(String[] args) {
        /*
           Bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse
        o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel sayi)
         */

       Scanner sc = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = sc.nextInt();
        System.out.println(perfectNumber(sayi) ? "Girdiginiz sayi mukemmel sayi" :
                "Girdiginiz sayi mukemmel sayi degildir");

    }

    private static boolean perfectNumber(int number) {
        int toplam = 0;
        boolean flag = false;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                toplam += i;
            }
        }
        if (toplam == number) {
            flag = true;
        }

        return flag;
    }
}
