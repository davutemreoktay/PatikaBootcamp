import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n;
        int first =0,second=1;

        Scanner inp=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz..:");
        n= inp.nextInt();

        System.out.print("Fibonacci Serisi:"+first+" "+second);
        for (int i=2;i<n;i++){
            int next=first+second;
            System.out.print(" "+next);
            first=second;
            second=next;
        }
        System.out.println();
    }
}