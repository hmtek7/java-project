package practices04MC;

import java.util.Scanner;

public class P05 { /*  TASK :
 * girilen String icinde "xyz" dizimi var ise true degilse false return eden method create ediniz.
 *
 * input      output
 * axyzm  ==   true
 * xyz    ==   true
 * x.yz   ==   false
 * xyaz   ==   false
 */
    public static void main(String[] args) {


    Scanner sc=new Scanner(System.in);
        System.out.println("Bir String ifade giriniz");
    String str=sc.next();

        System.out.println(xyzVarMi(str));

}

    private static boolean xyzVarMi(String str) {
        boolean flag=false;
        if (str.contains("xyz")){
            flag=true;
        }
        return flag;
    }

    /*
    private static boolean xyzVarMi(String str) {
        if(str.contains("xyz")){
            return true;
        }else {
            return false;
        }
    }

     */

}

