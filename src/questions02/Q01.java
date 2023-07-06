package questions02;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */
        Scanner sc= new Scanner(System.in);
        System.out.println("Toplama icin 1\n cikarma islemi icin 2\n carpma islemi icin 3\n bolme islemi icin 4");
        int islem=sc.nextInt();
        double sayi1,sayi2;

        System.out.println("iki tam sayi giriniz");
        sayi1 = sc.nextDouble();
        sayi2 = sc.nextDouble();

        if(islem==1){
            System.out.println(sayi1+sayi2);
        } else if (islem==2){
            System.out.println(sayi1-sayi2);

        }else if (islem==3){
            System.out.println(sayi1*sayi2);


    }else if (islem==4){
            System.out.println(sayi1/sayi2);
}else{
            System.out.println("hatali islem yaptınız, isleminizi kontrol ediniz");
        }
}
}
