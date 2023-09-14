package day14_forLoop;

public class Q10 {
    public static void main(String[] args) {
        String str="Andromegarog;kşkmkş;ssman";
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (ch!='m'){
                System.out.print(ch);

            }
        }
    }
}
