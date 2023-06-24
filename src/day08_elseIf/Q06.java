package day08_elseIf;

import java.util.Scanner;

public class Q06 {
     /*
     kullanicidan boyunu cm kilosunu ise kg cinsinden alip bmisini hesaplayan kodu yaziniz
Vücut kitle indeksi, vücut ağırlığının boy uzunluğunun
 karesine bölünmesiyle (kg/m²) hesaplanır.
18, 5 kg/m² ‘nin altındaki sonuçlar: İdeal kilonun altında
18, 5 kg/m² ile 24, 9 kg/m² arasındaki sonuçlar: İdeal kiloda
25 kg/m² ile 29, 9 kg/m² arasındaki sonuçlar: İdeal kilonun üstünde
30 kg/m² ile 39, 9 kg/m² arasındaki sonuçlar: İdeal kilonun çok üstünde (obez)
40 kg/m² üzerindeki sonuçlar: İdeal kilonun çok üstünde (morbid obez)

      */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double boy,kilo;
        System.out.println("Boyunuzu cm cinsinden giriniz");
        boy= sc.nextDouble();
        System.out.println("Kilonuzu kg cinsinden giriniz");
        kilo=sc.nextDouble();

        double vki= kilo/((boy/100)*(boy/100));

        if (vki>=18.5 && vki<=24.9){
            System.out.println("ideal kiloda");
        } else if (vki<18.5){
            System.out.println("ideal kilonun altında");

        } else if (vki>=25&&vki<29.9){
            System.out.println("İdeal kilonun üstünde");

        } else if (vki>=30&&vki<39.9){
            System.out.println("İdeal kilonun çok üstünde (obez)");

        }else{
            System.out.println("İdeal kilonun çok üstünde (morbid obez)");
        }

    }
}
