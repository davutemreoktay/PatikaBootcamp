import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sınır Sayısını Giriniz:");
        n= inp.nextInt();

        for (int i=1; i<= n; i*=20){
            System.out.println(i);
        }
    }
}