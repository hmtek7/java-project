package day16doWhileLoop;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
              /*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur"
         mesaji vererek islemi tamamlayiniz
          */
        Scanner sc=new Scanner(System.in);
        int sayac=0;//4
        do {
            if (sayac==4){
                System.out.println("hesabiniz bloke olmustur, lutfen adminle iletisime geciniz");
                break;
            }
            System.out.println("Usernamenizi giriniz");
            String userName=sc.next();

            System.out.println("Passwordunuzu giriniz");
            String password=sc.next();
            if (userName.equals("admin")&&password.equals("pwd123")){
                System.out.println("Giris basarili, Hesabiniza hosgeldiniz!");
                break;
            }
            sayac++;
        }while(true);

    }



}
