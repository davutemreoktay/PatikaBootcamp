import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir indeks girin: ");
        int index = scanner.nextInt();

        try {
            int result = getElementAtIndex(arr, index);
            System.out.println("Dizi[" + index + "] = " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Belirtilen indeks dizi boyutunun dışındadır.");
        }
    }

    public static int getElementAtIndex(int[] arr, int index) {
        if (index >= 0 && index < arr.length) {
            return arr[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
