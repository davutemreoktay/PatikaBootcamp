import java.util.Scanner;

public class Main {

    public static int pow(int taban,int us) {

        int result = 1;
        if (us == 0 && taban == 0) {
            System.out.println("Tanımsızdır.");
        } if (us == 0) {
            return 1;
        } else if (taban == 0) {
            return 0;
        }
        return result = taban * pow(taban, us - 1);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Taban Giriniz:");
        int taban= scan.nextInt();
        System.out.print("Üs giriniz:");
        int us= scan.nextInt();

        System.out.println("Sonuç:"+pow( taban, us));
    }
}