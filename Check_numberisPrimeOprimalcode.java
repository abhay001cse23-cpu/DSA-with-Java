import java.util.Scanner;

public class Check_numberisPrimeOprimalcode {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("___welcome to code___");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " : is a prime number.");
        } else {
            System.out.println(n + " : is not a prime number.");
        }

        sc.close();
    }
}