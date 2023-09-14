package day14_forLoop;

import java.util.Scanner;

public class Q13 { public static void main(String[] args) {
    // Kullanicidan 10'dan kucuk pozitif bir tamsayi girmesini isteyin
    // girdigi sayiya gore asagidaki sekli yazdirin
    // orn : 3 girilirse
    // 1
    // 1 2
    // 1 2 3
    Scanner sc=new Scanner(System.in);
    System.out.println("10 dan kucuk bir pozitif sayi giriniz");
    int sayi=sc.nextInt();
    for (int i = 1; i <=sayi ; i++) {
        for (int j = 1; j <=i ; j++) {
            System.out.print(j+" ");

        }
        System.out.println("");


    }

}
}
