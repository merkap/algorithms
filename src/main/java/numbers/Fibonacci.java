package numbers;

public class Fibonacci {

    // T(n)=Ω(a^n)
    // M(n)=O(n)
    public static long fibonacciRecurse(long n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacciRecurse(n - 1) + fibonacciRecurse(n - 2);
    }

    // T(n)=O(n)
    // M(n)=O(1)
    public static long fibonacciBine(int n) {
        return (long) (
                (5.0 - 3.0 * Math.sqrt(5.0)) *
                        Math.pow(((3.0 - Math.sqrt(5.0)) / 2.0), n - 1) +
                        (5.0 + 3.0 * Math.sqrt(5.0)) *
                                Math.pow(((3.0 + Math.sqrt(5.0)) / 2.0), n - 1)
        ) / 10;

    }

    public static long fibonacciArray(int n) {
        long lookup[] = {1L, 3L, 8L, 21L, 55L, 144L, 377L, 987L, 2584L, 6765L,
                17711L, 46368L, 121393L, 317811L, 832040L, 2178309L, 5702887L,
                14930352L, 39088169L, 102334155L, 267914296L, 701408733L,
                1836311903L, 4807526976L, 12586269025L, 32951280099L, 86267571272L,
                225851433717L, 591286729879L, 1548008755920L, 4052739537881L,
                10610209857723L, 27777890035288L, 72723460248141L, 190392490709135L,
                498454011879264L, 1304969544928657L, 3416454622906707L,
                8944394323791464L, 23416728348467685L, 61305790721611591L,
                160500643816367088L, 420196140727489673L, 1100087778366101931L,
                2880067194370816120L, 7540113804746346429L};
        if ((n < 1) || (n > lookup.length)) return -1L;
        return lookup[n - 1];
    }

}
