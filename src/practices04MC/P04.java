package practices04MC;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
/*      TASK :
        Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        ceviren bir method yaziniz.

 */
        Scanner sc=new Scanner(System.in);
        System.out.println("Cevirim yapacaginiz islemi seciniz" +
                "\nSaati saniyeye cevirmek icin 1" +
                "\nMili kilometreye cevirmek icin 2" +
                "\nKilogramı grama cevirmek icin 3e basınız");
        int islem=sc.nextInt();

        System.out.println("Miktarı giriniz");
        double miktar= sc.nextDouble();

        makine(islem,miktar);
    }
    public static void makine(int islem,double miktar){
        switch (islem){

        case 1 -> System.out.println(miktar * 60*60);
        case 2-> System.out.println(miktar*1.61);
        case 3-> System.out.println(miktar*1000);
            default -> System.out.println("yanlis giris yaptiniz lutfen dogru bir giris yapiniz");

    }


    }
}
