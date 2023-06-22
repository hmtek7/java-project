package questions01;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println(" a kenarının uzunlunğunu girin");
        int a= scan.nextInt();


        System.out.println(" b kenarının uzunlunğunu girin");
        int b= scan.nextInt();

        double hipotenus = Math.sqrt((a*a)+(b*b));

    }
}
