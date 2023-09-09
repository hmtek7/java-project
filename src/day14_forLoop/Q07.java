package day14_forLoop;

public class Q07 {
    public static void main(String[] args) {
       int toplam=0;
        for (int i = 3; i <7 ; i++) {
            toplam+=i;

        }
        System.out.println(toplam);

        int carpim=1;
        for (int i = 6; i >=3 ; i--) {
            carpim*=i;

        }
        System.out.println(carpim);
    }
}
