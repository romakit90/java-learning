package lesson06.forloopchallenge;

public class Main {

    public static void main(String[] args) {

        System.out.println("0 is " + (isPrime(0) ? "prime" : "not prime"));
        System.out.println("1 is " + (isPrime(1) ? "prime" : "not prime"));
        System.out.println("2 is " + (isPrime(2) ? "prime" : "not prime"));
        System.out.println("3 is " + (isPrime(3) ? "prime" : "not prime"));
        System.out.println("8 is " + (isPrime(8) ? "prime" : "not prime"));
        System.out.println("17 is " + (isPrime(17) ? "prime" : "not prime"));

        int primeCount = 0;

        for (int number = 100; primeCount < 3 && number <= 200; number++) {
            if (isPrime(number)) {
                System.out.println(number + " is prime");
                primeCount++;

            }
        }

    }

    public static boolean isPrime(int wholeNumber) {


        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }

        for (int i = 2; i <= wholeNumber / 2; i++) {
            if (wholeNumber % i == 0) {
                return false;
            }
        }

        return true;
    }
}
