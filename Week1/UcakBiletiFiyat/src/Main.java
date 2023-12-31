import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi (KM) giriniz: ");
        int mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini seçiniz (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int yolculukTipi = input.nextInt();

        double biletFiyati = mesafe * 0.10; 

        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
        } else {
            if (yas < 12) {
                biletFiyati *= 0.5;
            } else if (yas >= 12 && yas <= 24) {
                biletFiyati *= 0.9;
            } else if (yas >= 65) {
                biletFiyati *= 0.7;
            }

            if (yolculukTipi == 2) {
                biletFiyati *= 0.8;
            }

            System.out.println("Toplam Bilet Fiyatı: " + biletFiyati + " TL");
        }
    }
}
