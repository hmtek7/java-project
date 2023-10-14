package practices05ForLoop;

public class P07 {
    public static void main(String[] args) {
        int weeks=3;
        int days=7;
        for (int i = 1; i <=weeks ; i++) {
            System.out.print("Week: "+i);
            for (int j = 1; j <=days ; j++) {
                System.out.println("days: "+j);
            }
        }
    }
}
