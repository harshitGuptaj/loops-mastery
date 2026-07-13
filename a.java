import java.util.*;

public class a {
    public static void multiplication_table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d*%d=%d%n", n, i, n * i);
        }
    }

    public static int sum_naturaln(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int sum_natural_oddn(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int sum_natural_evenn(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int factorial(int n) {
        int factorail = 1;
        for (int i = n; i >= 1; i--) {
            factorail *= i;
        }
        return factorail;
    }

    public static int product_of_its_digits(int n) {
        int digit = 1;
        for (int i = n; i > 1; i /= 10) {
            digit *= i%10;
        }
        return digit;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, i = 1;
        System.out.print("enter the number: ");
        n = sc.nextInt();
        sc.nextLine();
        System.out.println("enter what you want to do: ");
        String what = sc.nextLine();
        switch (what) {
            case "multiplication_table":
                multiplication_table(n);

                break;
            case "sum_naturaln":
                System.out.print(sum_naturaln(n));
                break;
            case "sum_natural_oddn":
                System.out.print(sum_natural_oddn(n));
                break;
            case "sum_natural_evenn":
                System.out.print(sum_natural_evenn(n));
                break;
            case "factorial":
                System.out.print(factorial(n));
                break;
            case "product_of_its_digit":
                System.out.println(product_of_its_digits(n));
                break;
        }

    }

}
