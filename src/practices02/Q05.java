package practices02;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        	/* TASK :
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada
		   hatali giris seklinde code create ediniz
		 */
        Scanner sc= new Scanner(System.in);
        System.out.println("bir harf giriniz");



        char ch=sc.next().charAt(0);

        if (ch>='a'&&ch<='z'){
            System.out.println("girdiginiz: "+ch+ " harfi kucuk harftir");
        } else if (ch>='A'&&ch<='Z'){
            System.out.println("girdiginiz: "+ch+ " harfi buyuk harftir");

        }else{
            System.out.println("hatali giris yaptiniz");
        }
    }
}
