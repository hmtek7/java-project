package day11_switchStatements;

public class Q02 {
    public static void main(String[] args) {
        int gunNo=4;
        switch (gunNo) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta ici");
                break;
            case 6:
            case 7:
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("gecerli gun nosu girin");
        }
    }
}
