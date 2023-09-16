package day16doWhileLoop;

import java.util.Scanner;

public class Q06 {
    //ex kullanicidan isimler aliniz ilk harfi buyuk olup olmadigini kontrol ediniz
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("İsim giriniz");
            char harf=sc.next().charAt(0);
            if (harf>='A'&&harf<='Z'){
                System.out.println("Başarlı giris");
            }else{
                System.out.println("Basarisiz giris");
                break;
            }
        }while (true);

    }
}
