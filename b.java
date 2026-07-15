import java.util.*;

public class b {
    public static int sum_of_its_digits(int n) {
        int digit = 0;
        for (int tem = n; tem > 0; tem /= 10) {
            digit = digit + tem % 10;
        }
        return digit;
    }

    public static void primes_in_between_numbers(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i < 2) continue;
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(i);
        }
    }

    public static void main(String args[]) {
        int n = 0, a = 0, b = 0, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers : ");
        c = sc.nextInt();
        sc.nextLine();
        if (c == 1) {
            System.out.println("Enter the number: ");
            n = sc.nextInt();
            sc.nextLine();
        } else if (c == 2) {
            System.out.println("Enter the number a: ");
            a = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the number b: ");
            b = sc.nextInt();
            sc.nextLine();
        } else {
            System.out.println("Invalid input");
            sc.close();
            return;
        }
        System.out.println("what you want to do: ");
        String what = sc.nextLine();
        switch (what) {
            case "sum_of_its_digits":
                System.out.println(sum_of_its_digits(n));
                break;
            case "primes_in_between_numbers":
                primes_in_between_numbers(a, b);
                break;
            default:
                System.out.println("Invalid option");
        }
        sc.close();

    }
}
