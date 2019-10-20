import java.util.Scanner;

public class TopNumber {

    static boolean devisibleByEigth(int num) {

        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum % 8 == 0;
    }

    static boolean oddDigit(int num) {

        int counter = 0;
        while (num > 0) {
            if ((num % 10) % 2 == 1) {
                counter++;
            }
            num /= 10;
        }
        return counter >= 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num ; i++) {
            if (devisibleByEigth(i) && oddDigit(i)) {
                System.out.println(i);
            }
        }
    }

}
