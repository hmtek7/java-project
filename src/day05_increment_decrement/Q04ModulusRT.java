package day05_increment_decrement;

public class Q04ModulusRT {
    public static void main(String[] args) {
        int sayi=1235;

        int birlerBas=0;
        int toplam=0;

        birlerBas= sayi%10;
        //toplam = birlerBas+toplam;

        toplam+=birlerBas;

        //sayi= sayi/10;
        sayi/=10;


        birlerBas=sayi%10;
        toplam=birlerBas+toplam;
       sayi= sayi/10;

       birlerBas=sayi%10;
       toplam+=birlerBas;
       sayi/=10;

        birlerBas=sayi%10;
        toplam+=birlerBas;
        sayi/=10;

        System.out.println(toplam);

    }
}
