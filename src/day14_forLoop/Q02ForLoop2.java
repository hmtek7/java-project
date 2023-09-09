package day14_forLoop;

public class Q02ForLoop2 {
    public static void main(String[] args) {
        for (int i = 14; i >=5 ; i-=2) {
            System.out.println(i+" ");

        }
        System.out.println("");
        for (int i = 14; i >=5 ; i--) {
            if (i%2==0){
                System.out.println(i+"");
            }

        }
    }
}
