package atm_project;

import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        /*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
     çıkış işlemlerinin yapıldıgı
      bie ATM app. code create ediniz
     */
        Scanner sc= new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("  -TEK BANKA HOŞGELDİNİZ-  ");
        System.out.println("*****************************");

        int sayac=0;//4

        do {
            if (sayac==4){
                System.out.println("hesabiniz bloke olmustur, lutfen adminle iletisime geciniz");
                break;
            }
            System.out.println("Usernamenizi giriniz");
            String userName=sc.next();

            System.out.println("Passwordunuzu giriniz");
            String password=sc.next();

            if (userName.equals("admin")&&password.equals("pwd123")){
                System.out.println("Giris basarili, Hesabiniza hosgeldiniz!");
                System.out.println("Bakiye sorgulama : 1\nPara Cekme : 2\nPara Yatirma : 3\nCikis : 4\nYapacaginiz İslemi Seciniz: ");
                int islem=sc.nextInt();
                int bakiye=1000;

                switch (islem) {
                    case 1 -> System.out.println("Mevcut bakiyeniz: " + bakiye);
                    case 2 -> {
                        System.out.println("Cekilecek miktari giriniz: ");
                        int cekilecekMiktar = sc.nextInt();
                        if (cekilecekMiktar > bakiye) {
                            System.out.println("Dur, o kadar paran yok");
                        } else {
                            bakiye -= cekilecekMiktar;
                            System.out.println("yeni bakiyeniz: " + bakiye);
                        }
                    }
                    case 3 -> {
                        System.out.println("Yatıracaginiz miktarş giriniz");
                        int yatirilicakTutar = sc.nextInt();
                        bakiye += yatirilicakTutar;
                        System.out.println("yeni bakiyeniz: " + bakiye);

                    }
                    case 4 -> System.out.println("Bankamizi kullandiginiz icin tesekkurler, yine bekleriz");
                    default -> System.out.println("Hatali giris yaptınız");

                }
            }
            sayac++;

        }while(true);

    }


    }

