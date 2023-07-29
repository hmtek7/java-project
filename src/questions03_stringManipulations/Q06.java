package questions03_stringManipulations;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        // Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 harfli bir kelime giriniz ");
        String kelime = scan.next();
        if(kelime.length()!=4){
            System.out.println("okuman yok mu :)");
        }else{
            String rStr= kelime.substring(3);
            rStr+=kelime.substring(2,3);
            rStr+=kelime.substring(1,2);
            rStr+=kelime.substring(0,1);

            System.out.println(rStr);
        }
    }
}
