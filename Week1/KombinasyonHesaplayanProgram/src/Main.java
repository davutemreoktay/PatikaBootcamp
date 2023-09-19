import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, r;

        Scanner scan = new Scanner(System.in);

        System.out.print("Kombinasyonun İlk Değerini Giriniz..:");
        n = scan.nextInt();
        System.out.print("Kombinasyonun İkinci Değerini Giriniz:");
        r = scan.nextInt();
        int totaln = 1;
        int totalr = 1;
        int totalk = 1;

        for (int i = 1; i <= n; i++) {
            totaln = totaln * i;
        }
        for (int j = 1; j <= r; j++) {
            totalr = totalr * j;
        }
        for (int k = 1; k <= (n - r); k++) {
            totalk = totalk * k;
        }

        int kombinasyon = totaln / (totalr * totalk);
        System.out.println("Sonuç:" + kombinasyon);
    }
}
