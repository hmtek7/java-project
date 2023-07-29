package day12_string_manipulations;

public class Q14Replace_ReplaceAll {
    public static void main(String[] args) {
        String str="Bugun hava cok guzel";
        String newStr=str.replace('u','U');
        System.out.println("newStr = " + newStr);
        System.out.println(str.replace("hava","**JAVA**"));
//replaceAll()
        /*
 \\s :    bosluk (space)
\\D : rakamlar disindaki tum karakterler
\\d : rakamlar (0-9)
\\W : harfler ve rakamlar disindaki tum karakterler
\\w : harfler ve rakamlar (a-z , A-Z, 0-9)
\\S : bosluk disindaki tum karakterler
         */

        /*
        En cok kullanilan Regexler
        1) Tum rakamlar ==> [0-9]
        2) Tum kucuk harfler ==> [a-z]
        3) Tum buyuk harfler ==> [A-Z]
        4) Tum harfler ==> [a-zA-Z]
        5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
        6) Tum noktalama isaretleri ==> \\p{Punct}
        7) Tum sesli harfler ==> [aeiouAEIOU]

         ^ ==> den farkli, haricinde
        1) Tum rakamlar Haric ==> [^0-9]
        2) Tum kucuk harfler Haric ==> [^a-z]
        3) Tum buyuk harfler Haric==> [^A-Z]
        4) Tum harfler Haric==> [^a-zA-Z]
        5) Tum harfler ve rakamlar Haric==> [^a-zA-Z0-9]
        6) Tum noktalama isaretleri Haric==> [^\p{Punct}]   // ya da  ^\P{P} ?
        7) Tum sesli harfler Haric==> [^aeiouAEIOU]

         */
String yas= "Duydun mu Ali kaptan 3 yasindaymis";
        System.out.println(yas.replaceAll("[0-9]", "otuz"));

        System.out.println(yas.replaceAll("[^0-9]", "*"));
    }
}
