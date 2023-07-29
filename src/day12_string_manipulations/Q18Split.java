package day12_string_manipulations;

import java.util.Arrays;

public class Q18Split {
    public static void main(String[] args) {
        String str="Hello World, hello Jupiter";
        String strArr []=str.split(",");
        System.out.println(Arrays.toString(strArr));
    }
}
