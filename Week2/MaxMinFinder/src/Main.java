import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};

        Scanner scan=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz:");
        int a =scan.nextInt();
        int closestSmaller=-1;
        int closestLarger=-1;

        for (int i : list) {
            if (i<a && (closestSmaller==-1 || i>closestSmaller)) {
                closestSmaller=i;
            }
            if (i>a && (closestLarger==-1 || i< closestLarger)) {
                closestLarger=i;
            }
        }
        System.out.println("Minimum Değer " + closestSmaller);
        System.out.println("Maximum Değer " + closestLarger);
    }
}
