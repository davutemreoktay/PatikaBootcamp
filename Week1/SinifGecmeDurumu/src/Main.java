import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, bio, kimya, geo;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunu Giriniz: ");
        mat = input.nextInt();

        System.out.print("Fizik Notunu Giriniz: ");
        fizik = input.nextInt();

        System.out.print("Biyoloji Notunu Giriniz: ");
        bio = input.nextInt();

        System.out.print("Kimya Notunu Giriniz: ");
        kimya = input.nextInt();

        System.out.print("Geometri Notunu Giriniz: ");
        geo = input.nextInt();

        if (mat >= 0 && mat <= 100 && fizik >= 0 && fizik <= 100 && bio >= 0 && bio <= 100 && kimya >= 0 && kimya <= 100 && geo >= 0 && geo <= 100) {
            double average = (mat + fizik + bio + kimya + geo) / 5;
            System.out.println("Ortalamanız: " + average);

            if (average <= 55) {
                System.out.println("Sınıfta Kaldınız.");
            } else {
                System.out.println("Geçtiniz.");
            }
        } else {
            System.out.println("Notlar 0 ile 100 arasında olmalıdır.");
        }
    }
}
