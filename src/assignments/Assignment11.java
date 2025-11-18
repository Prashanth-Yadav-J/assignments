package assignments;

public class Assignment11 {

    public static void main(String[] args) {

        // Array of numbers to check prime or not
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numbers.length; i++) {

            int num = numbers[i];
            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j * j <= num; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(num + " is a Prime Number");
            } else {
                System.out.println(num + " is NOT a Prime Number");
            }
        }
    }
}