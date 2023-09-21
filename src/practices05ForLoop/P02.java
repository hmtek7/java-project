package practices05ForLoop;

import java.util.Scanner;

public class P02 {
    //Kullanicidan 100’den kucuk bir tamsayi isteyin.
    // 1’den baslayarak girilen sayiya kadar(sayi dahil) 3’un ve 5in kati olan sayilari yazdirin.
    // sayi negtifse veya tam sayi degilse uyari verelim

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("100den kucuk bir tam sayi giriniz");
        double sayi=sc.nextDouble();
        int no= (int) sayi;
        if (sayi<0){
            System.out.println("Sayiniz negatif tekrar deneyin");
        }else if (sayi>100){
            System.out.println("sayiniz yuzden buyuk tekrar deneyin");

            }else{
            for (int i = 1; i <=sayi ; i++) {
                if (i%3==0&&i%5==0){
                    System.out.println(i);
                }
            }
        }
    }
}
