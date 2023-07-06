package questions02;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
         /*  TASK :
		 *  Kullanicidan IT alanini bilgisini alarak console'a
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		bilgilileri yazdiriniz
		 */
        Scanner inp=new Scanner(System.in);
        System.out.println("qa\ndev\nba\npm\n Lutfen mesleginizi seciniz");
        String job=inp.nextLine();
        if (job.equalsIgnoreCase("qa")){
            System.out.println("Mesleginiz: Quality Analyst");
        } else if (job.equalsIgnoreCase("dev")){
            System.out.println("Mesleginiz: Developer");

        } else if (job.equalsIgnoreCase("ba")){
            System.out.println("Mesleginiz: Busines Analyst");

        } else if (job.equalsIgnoreCase("pm")){
            System.out.println("Mesleginiz: Project Manager");


        }else{
            System.out.println("hatalı secim yaptınız, seciminizi kontrol ediniz");
        }
    }
}
