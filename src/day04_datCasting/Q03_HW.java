package day04_datCasting;

import java.util.Scanner;

public class Q03_HW {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen adinizi girniz");
        String name=scan.next();


        System.out.println("En sevdiginiz karakteri giriniz");
        char ch=scan.next().charAt(0);


        System.out.println("Sicrayabildiginiz en yuksek yuksekligi giriniz");
        double height=scan.nextDouble();

        System.out.println("Adim: "+ name+" "+"En sevdigim karakter: "+ch+" "+
                "Ziplayabildigim en yuksek yukseklik: "+height);


        System.out.println("Ilk sayiyi girin");
        double num1=scan.nextDouble();

        System.out.println("Ikinci sayiyi girin");
        double num2= scan.nextDouble();


        System.out.println("Cevaplar:");
        System.out.println(num1+num2);
        System.out.println(num1*num2);



        System.out.println("Lutfen adinizi girniz");
        String ad=scan.next();


        System.out.println("soyismini gir");
        String soyisim=scan.next();


        System.out.println("Yasinizi girin");
        int yas=scan.nextInt();

        System.out.println("Isminiz: "+ad);
        System.out.println("Soyisminiz: "+soyisim);
        System.out.println("Yasiniz: "+yas);
        System.out.println("Kaydniniz basariyla tamamlanmistir.");

        System.out.println("İlk kenarı girin");
        int kenar1= scan.nextInt();

        System.out.println("İkinci kenarı girin");
        int kenar2= scan.nextInt();

        System.out.println("dikdörtgenin alanı: " + (kenar1*kenar2));

        System.out.println("Lutfen adinizi girniz");
        char ad1=scan.next().charAt(0);


        System.out.println("soyismini gir");
        String soyisim1=scan.next();


        System.out.println("Yasinizi girin");
        int yas1=scan.nextInt();

        System.out.println("girilen bilgiler "+ad1+" "+soyisim1+","+yas1);

        System.out.println("Çemberinizin yarı çapını girin");
        double cap= scan.nextDouble();

        System.out.println("Çemberin çevresi:" + (2*3.14*cap)+" "+"Çemberin alanı: "+ (Math.pow(cap,2)*3.14));



    }
}
