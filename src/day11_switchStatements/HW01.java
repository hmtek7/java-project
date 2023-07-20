package day11_switchStatements;

import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Bir ay numarası giriniz");
        int ayNo= sc.nextInt();
        switch (ayNo){
            case 1:
                System.out.println("Ocak");
                break;
                case 2:
                System.out.println("Şubat");
                break;
                case 3:
                System.out.println("Mart");
                break;
                case 4:
                System.out.println("Nisan");
                break;
                case 5:
                System.out.println("Mayıs");
                break;
                case 6:
                System.out.println("Haziran");
                break;
                case 7:
                System.out.println("Temmuz");
                break;
                case 8:
                System.out.println("Agustos");
                break;
                case 9:
                System.out.println("Eylul");
                break;
                case 10:
                System.out.println("Ekim");
                break;
                case 11:
                System.out.println("Kasim");
                break;
                case 12:
                System.out.println("Aralik");
                break;
            default:
                System.out.println("Doğru bir ay numarası girin");
        }

    }
}
