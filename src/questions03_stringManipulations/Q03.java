package questions03_stringManipulations;

public class Q03 {
    public static void main(String[] args) {
        // Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        //        String str1 = “$13.99”
        //        String str2 = “$10.55”
        //        ipucu : Double.parseDouble() methodunu kullanabilirsiniz.

        String str1 = "$13.99";
       String str2 = "$10.55";
       String fStr1=str1.replace("$","");
       double sayi1=Double.parseDouble(fStr1);
        String fStr2=str2.replace("$","");
        double sayi2=Double.parseDouble(fStr2);
        System.out.println("$"+(sayi1+sayi2));


    }
}
