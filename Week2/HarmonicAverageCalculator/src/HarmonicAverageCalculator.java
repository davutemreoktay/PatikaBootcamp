import java.util.Scanner;

public class HarmonicAverageCalculator {

    public static double calculateHarmonicAverage(int[] numbers) {
        int n = numbers.length;
        double harmonicSum = 0.0;

        // Elemanların harmonik serisini hesapla
        for (int num : numbers) {
            if (num != 0) {
                harmonicSum += 1.0 / num;
            }
        }

        // Harmonik ortalama hesapla
        double harmonicAverage = n / harmonicSum;
        return harmonicAverage;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu girin: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Dizi elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            System.out.print("Eleman " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        double harmonicAverage = calculateHarmonicAverage(numbers);
        System.out.println("Harmonik Ortalama: " + harmonicAverage);

        scanner.close();
    }
}
