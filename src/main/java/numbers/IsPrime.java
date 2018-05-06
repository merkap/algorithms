package numbers;

public class IsPrime {

    //T(n)=O(sqrt(n))
    //M(n)=O(1)
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
