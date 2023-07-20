package day12_string_manipulations;

import java.util.Locale;

public class Q03ToUpper_LowerCase {
    public static void main(String[] args) {
        String str1="Elma";
        String str2="muzIk";
        System.out.println(str1.toUpperCase());
        String localTr =str2.toLowerCase(Locale.forLanguageTag("tr"));
        System.out.println(localTr);
    }
}
