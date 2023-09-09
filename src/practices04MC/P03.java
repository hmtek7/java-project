package practices04MC;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
    	/*
        	//mod
        	//length()
        	//concat()
        	//substring()
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina
		 yerlestiremedik" yazdirinan bir method oluşturun
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/

        Scanner sc=new Scanner(System.in);
        System.out.println("ilk ismi giriniz");
        String isim1=sc.next();

        System.out.println("Ikinci ismi giriniz");
        String isim2=sc.next();

        ikiIsmiBirlestir(isim1,isim2);



    }

    private static void ikiIsmiBirlestir(String name1,String name2) {
        if(name1.length()%2==0){
            System.out.println(name1.substring(0,name1.length()/2).concat(name2).concat(name1.substring(name1.length()/2)));
        }else {
            System.out.println(name1+ " cift sayili olmadigi icin ortasina\n" +
                    "\t\t yerlestiremedik");

        }

    }
}

