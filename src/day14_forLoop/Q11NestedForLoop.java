package day14_forLoop;

public class Q11NestedForLoop {
    public static void main(String[] args) {
        // 1'den 4'e kadar sayilari yan yana aralarinda bir bosluk birakarak yazdirin
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }
    }
}
