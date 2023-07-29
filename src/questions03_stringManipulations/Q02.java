package questions03_stringManipulations;

public class Q02 {
    public static void main(String[] args) {
        // Soru 1) String methodlarini kullanarak “  Java ogrenmek123 Cok guzel@  ”
        // String’ini “Java ogrenmek cok guzel.” sekline getirin.
        String str=  "  Java ogrenmek123 Cok guzel@   "  ;
        String fStr= str.trim().replaceAll("[0-9]","").replace("@",".").replaceFirst("C","c");
        System.out.println(fStr);
    }
}
