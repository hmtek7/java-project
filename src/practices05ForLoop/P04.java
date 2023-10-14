package practices05ForLoop;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
          /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */
        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int sayi;

        for (int i = 1; i <= 5; i++) {
            System.out.println("bir sayi giriniz");
            sayi=scan.nextInt();
            if (sayi>5&&sayi<10){
                System.out.println("girdiginiz 5 ile 10 arasındaki sayilar isleme alinmayacaktir");
                continue;
            }
            toplam+=sayi;
        }
        System.out.println("toplam = " + toplam);
    }
}
