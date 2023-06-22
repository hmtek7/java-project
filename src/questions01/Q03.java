package questions01;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        //Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
        Scanner scan= new Scanner(System.in);
        double kilo,boy,vki;
        System.out.println("Kilonuzu giriniz: ");
        kilo =scan.nextDouble();

        System.out.println("boyunuzu cm olarak girin");
        boy= scan.nextDouble();
        boy=boy/100;

        vki= kilo/(boy*boy);
        System.out.println(" Vucut kutle indeksiniz: "+ vki);
    }
}
