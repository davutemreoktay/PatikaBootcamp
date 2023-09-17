import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumYili = input.nextInt();

        String zodyakIsareti = "";

        switch (dogumYili % 12) {
            case 0:
                zodyakIsareti = "Maymun";
                break;
            case 1:
                zodyakIsareti = "Horoz";
                break;
            case 2:
                zodyakIsareti = "Köpek";
                break;
            case 3:
                zodyakIsareti = "Domuz";
                break;
            case 4:
                zodyakIsareti = "Fare";
                break;
            case 5:
                zodyakIsareti = "Öküz";
                break;
            case 6:
                zodyakIsareti = "Kaplan";
                break;
            case 7:
                zodyakIsareti = "Tavşan";
                break;
            case 8:
                zodyakIsareti = "Ejderha";
                break;
            case 9:
                zodyakIsareti = "Yılan";
                break;
            case 10:
                zodyakIsareti = "At";
                break;
            case 11:
                zodyakIsareti = "Koyun";
                break;
        }

        System.out.println("Çin Zodyağı Burcunuz: " + zodyakIsareti);
    }
}
