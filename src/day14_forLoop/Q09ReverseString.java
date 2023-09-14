package day14_forLoop;

public class Q09ReverseString {
    public static void main(String[] args) {
        String str="java";
       String reverseStr="";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverseStr+=str.charAt(i);

        }
        System.out.println(reverseStr);
    }
}
