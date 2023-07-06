package questions02;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        /*  TASK :
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz.
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
	    INFO :
	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük,
	     * herhangi iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c
	     b+c>a>b-c
		a=b=c ise es kenar ucgen
	 */
        Scanner sc= new Scanner(System.in);
        System.out.println("Üç tane pozitif tam sayi giriniz");
       int a,b,c;
       a= sc.nextInt();
       b= sc.nextInt();
       c= sc.nextInt();
       if ((a+b)>c&&c>(a-b)&&(a+c)>b&&(a-c)<b&&(b+c)>a&&a>(b-c)){
           if (a==b&&a==c){
               System.out.println("eskenar ucgendir");

       } else{
               System.out.println("eskenar ucgen degildir");
           }

       }else{
           System.out.println("ucgen degildir");
       }

    }
}
