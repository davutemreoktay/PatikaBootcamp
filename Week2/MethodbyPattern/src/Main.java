import java.util.Scanner;

public class Main {

    public static void pattern(int n){
        System.out.print(n+" ");
        if(n<=0) {
            return;
        }
        pattern(n-5);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int n =scan.nextInt();
        pattern(n);
    }
}