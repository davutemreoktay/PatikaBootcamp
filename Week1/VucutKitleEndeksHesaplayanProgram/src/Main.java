import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kg,m;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde/nokta yerine virgül kullanınız) giriniz:");
        m= inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz:");
        kg=inp.nextDouble();

        double vucudKitleIndeksi=kg/(m*m);
        System.out.println("Vücut Kitle İndeksiniz:"+ vucudKitleIndeksi);

    }
}