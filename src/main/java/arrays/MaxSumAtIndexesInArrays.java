package arrays;

import java.util.Scanner;

//Даны два массива целых чисел одинаковой длины A[0..n−1]и B[0..n−1].
//Необходимо найти первую пару индексов i0 и j0,i0≤j0,
// такую что A[i0]+B[j0]=max{A[i]+B[j],где0≤i<n,0≤j<n, i≤j}.
//Время работы – O(n).
//Ограничения: 1≤n≤100000,0≤A[i]≤100000,0≤B[i]≤100000  для любого i

public class MaxSumAtIndexesInArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] array1 = new int[length];
        int[] array2 = new int[length];

        int maxSum;
        int falseMax1 = 0;
        int max1 = 0;
        int max2 = 0;

        for (int i = 0; i < length; i++) {
            array1[i] = scanner.nextInt();
        }
        array2[0] = scanner.nextInt();
        maxSum = array1[max1] + array2[max2];
        for (int i = 1; i < length; i++) {
            array2[i] = scanner.nextInt();

            if (array1[i] > array1[falseMax1]) {
                falseMax1 = i;
//                System.out.println("zero");
            }

            if (array1[max1] + array2[i] > maxSum) {
                max2 = i;
                maxSum = array1[max1] + array2[i];
//                System.out.printf("first %d\n", maxSum);
            }
            if (array1[falseMax1] + array2[i] > maxSum) {
                max1 = falseMax1;
                max2 = i;
                maxSum = array1[falseMax1] + array2[i];
//                System.out.printf("second %d\n", maxSum);
            }
            if (array1[i] + array2[i] > maxSum) {
                max1 = i;
                max2 = i;
                maxSum = array1[i] + array2[i];
//                System.out.printf("third %d\n", maxSum);
            }
//            System.out.println(maxSum);
        }

        System.out.printf("%d %d", max1, max2);
    }
}
