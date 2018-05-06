package numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberToPrimeMembers {

    public static List<Integer> toPrimeMembers(int n) {
        List<Integer> list = new ArrayList<Integer>();
        for (int j = 2; j <= n; j++) {
            if (isPrime(j)) {
                if (n % j == 0) {
                    list.add(j);
                    n = n / j;
                    j--;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n < 2) return;
        List<Integer> list;
        list = toPrimeMembers(n);
        int length = list.size();
        if (length > 0) {
            for (Integer aList : list) {
                System.out.printf("%d ", aList);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}
