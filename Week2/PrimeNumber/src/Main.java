public class Main {

    public static boolean isPrime(int num, int divisor) {
        if (num <= 1) {
            return false;
        }
        if (divisor == 1) {
            return true;
        }
        if (num % divisor == 0) {
            return false;
        }

        return isPrime(num, divisor - 1);
    }

    public static void main(String[] args) {
        int numberToCheck = 21;
        boolean result = isPrime(numberToCheck, numberToCheck - 1);

        if (result) {
            System.out.println(numberToCheck + " bir asal sayıdır.");
        } else {
            System.out.println(numberToCheck + " bir asal sayı değildir.");
        }
    }
}
