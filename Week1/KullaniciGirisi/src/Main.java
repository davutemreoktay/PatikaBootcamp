import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password, repin, yOrN, newpin;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız:");
        username = inp.nextLine();

        System.out.print("Şifreniz:");
        password = inp.nextLine();

        if (username.equals("deo") && password.equals("123")) {
            System.out.println("Giriş Başarılı");
        } else {
            System.out.println("Bilgileriniz Hatalı!");
            System.out.print("Parolanızı Sıfırlamak İster Misiniz? (E/H): ");
            yOrN = inp.nextLine();
            if (yOrN.equals("E")) {
                System.out.print("Yeni Şifreyi Giriniz..:");
                repin = inp.nextLine();
                System.out.print("Yeni Şifreyi Tekrar Giriniz:");
                newpin = inp.nextLine();

                if (repin.equals(newpin)) {
                    password = repin;
                    System.out.println("Yeni Şifreniz Başarıyla Oluşturuldu.");
                } else {
                    System.out.println("Şifreler Aynı Değil Tekrar Deneyin.");
                }
            } else {
                System.out.println("Şifre Sıfırlama İşlemi İptal Edildi.");
            }
        }
    }
}
