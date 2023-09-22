import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Tam Sayı Giriniz: ");
        int tamSayi = input.nextInt();

        System.out.print("Bir Ondalıklı Sayı Giriniz: ");
        double ondalikliSayi = input.nextDouble();

        double tamSayiDouble = (double) tamSayi;

        int ondalikliSayiInt = (int) ondalikliSayi;

        System.out.println("Tam Sayı (int): " + tamSayi);
        System.out.println("Tam Sayı (double): " + tamSayiDouble);
        System.out.println("Ondalıklı Sayı (double): " + ondalikliSayi);
        System.out.println("Ondalıklı Sayı (int): " + ondalikliSayiInt);
    }
}
