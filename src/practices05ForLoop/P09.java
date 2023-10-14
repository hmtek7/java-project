package practices05ForLoop;

public class P09 {
    public static void main(String[] args) {
        /*

         * * * * *
         * * * *
         * * *
         * *
         *
         seklini gosteren kodu yaziniz
          */
        int rows=5;
        for (int i = rows; i >=1 ; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println("");

        }
    }
}
