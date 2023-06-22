package day05_increment_decrement;

public class Q03_Practice {
    public static void main(String[] args) {

        int a=10;
        System.out.println("a = " + ++a);
        int b=a++;
        System.out.println("b = " + b);
        int c=b++ +a;
        System.out.println("c = " + c);
        System.out.println("Toplam: "+ (a+b+c));
    }
}
