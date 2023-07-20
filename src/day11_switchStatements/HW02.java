package day11_switchStatements;

import java.util.Scanner;

public class HW02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Mesleginizi SDET kısaltmasına gore giriniz ");
        char meslek=sc.next().charAt(0);
        switch (meslek){
            case 'S':
                System.out.println("Software");break;
                case 's':
                System.out.println("Software");break;
                case 'D':
                System.out.println("Developer");break;
                case 'd':
                System.out.println("Developer");break;
                case 'E':
                System.out.println("Engineer");break;
                case 'e':
                System.out.println("Engineer");break;
                case 'T':
                System.out.println("In testing");break;
                case 't':
                System.out.println("In testing");break;
            default:
                System.out.println("Dogru meslek kısaltmasını giriniz");
        }
    }
}
