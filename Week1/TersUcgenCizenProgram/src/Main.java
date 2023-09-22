import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner inp=new Scanner(System.in);
        System.out.print("Ters Üçgen Oluşturmak İçin Bir Sayı Giriniz..:");
        n= inp.nextInt();
        int sum=1;

        for (int i = n ; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}