package Demo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen: ");
        long n = scanner.nextInt();

        if (snt(n))
            System.out.println(n + " la so nguyen to.");
        else
            System.out.println(n + " khong la so nguyen to.");
        scanner.close();
    }

    private static boolean snt(long n) {
        for (long i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return n > 1;
    }

    private static boolean scp(long n) {
        double tmp = Math.sqrt((double) n);
        if (Math.floor(tmp) * Math.floor(tmp) == n)
            return true;
        return false;
    }
}
