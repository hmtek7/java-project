package day14_forLoop;

import java.util.Scanner;

public class Q12 {
    // kullanicidan 2 tam sayi isteyin
    // ilk sayidan baslayarak , ikinci sayiya kadar ucer, ucer yazdirin
    // (ikinci sayi dahil olmak zorunda degil)
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Birinci tam sayiyi girin");
        int sayi1=sc.nextInt();
        System.out.println("İkinci sayiyi girin");
        int sayi2= sc.nextInt();
if (sayi1<sayi2){
    for (int i = sayi1; i <=sayi2 ; i+=3) {
        System.out.println(i);
}
        }else if (sayi1>sayi2){
    for (int i = sayi1; i >=sayi2 ; i-=3) {

    }
        }else{
    System.out.println("verilen sayilar esittir");
        }
    }
}
