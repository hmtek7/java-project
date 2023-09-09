package practices02;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int gun, ay, yil;
        System.out.println("Tarihi gün, ay, yıl seklinde yaziniz");
        System.out.println("Gun");
        gun=sc.nextInt();
        if (gun>0&&gun<=31){
            System.out.println(gun);
        }else {
            System.out.println("hatali giris yaptiniz");
        }


        System.out.println("Ay");
        ay= sc.nextInt();
        if (ay>0&&ay<=12){
            System.out.println(ay);
        }else {
            System.out.println("hatali giris yaptiniz");
        }



        System.out.println("Yil");
        yil= sc.nextInt();
        if (yil>0){
            System.out.println(yil);
        }else {
            System.out.println("hatali giris yaptiniz");
        }
        System.out.println("Ay/Gun/yil "+ay+"/"+gun+"/"+yil);
        System.out.println("Yil/Ay/Gun "+yil+"/"+ay+"/"+gun);

    }
}
