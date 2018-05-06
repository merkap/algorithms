package numbers;

public class Power {

    //T(n)=O(log n)
    //M(n)=O(1)
    public static double power(double a, int n) {
        double result = 1;
        double aInDegreeOf2 = a;
        while (n > 0) {
            if (n % 2 == 1) {
                result *= aInDegreeOf2;
            }
            aInDegreeOf2 *= aInDegreeOf2;
            n = n >> 1;
        }
        return result;
    }
}
