package day13methodCreation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // kullanıcıdan 2 sayi alin 4 islem yaptıirin
        Scanner sc=new Scanner(System.in);
        System.out.println("Birinci sayiyi giriniz");
        int sayi1=sc.nextInt();
        System.out.println("Ikinci sayiyi giriniz");
        int sayi2=sc.nextInt();
        System.out.println("girilen sayilarin  toplamini yapmak icin 1\n"+
                "cikarma yapmak icin 2\n bolme islemi icin 3\n carpma islemi icin ise 4 basiniz");
        int secim= sc.nextInt();
        switch (secim){
            case 1 ->System.out.println(toplama(sayi1, sayi2));
            case 2 ->System.out.println(cikarma(sayi1, sayi2));
            case 3 ->System.out.println(bolme(sayi1, sayi2));
            case 4 ->System.out.println(carpma(sayi1, sayi2));
            default -> System.out.println("Gecerli bir islem giriniz");
        }

}
public static int toplama(int a,int b){
        return a+b;

}
public static int cikarma(int a,int b){
        return a-b;
}
public static int bolme(int a,int b){
        return a/b;
}
public static int carpma(int a, int b){
        return a*b;
}
}
