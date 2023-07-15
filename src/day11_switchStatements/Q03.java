package day11_switchStatements;

public class Q03 {
    public static void main(String[] args) {
        char not='A';
        switch (not){
            case 'A':
                System.out.println("85-100 arası");
                break;
                case 'B':
                System.out.println("60-85 arası");
                break;
                case 'C':
                System.out.println("50-60 arası");
                break;
                case 'D':
                System.out.println("0-50 arası");
                break;
            default:
                System.out.println("gecersiz not");

        }
    }
}
