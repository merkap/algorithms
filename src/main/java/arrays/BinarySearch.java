package arrays;

//T(n)=O(log n)

//M(n)=O(1)
public class BinarySearch {
    public static int BinarySearch(int[] array, int element) {
        int first = 0;
        int last = array.length;
        while (first < last) {
            int mid = (first + last) / 2;
            if (element <= array[mid]) {
                last = mid;
            } else {
                first = mid;
            }
        }
        return (first == array.length || array[first] != element) ? -1 : first;
    }

//M(n)=O(log n)
    public static int BinarySearchRecurse(int[] array, int element) {
        int point = FindInsertionPoint(array, 0, array.length, element);
        return (point == array.length || array[point] != element) ? -1 : point;
    }

    public static int FindInsertionPoint(int[] array, int first, int last, int element) {
        if (first == last) {
            return first;
        }
        int mid = (first + last) / 2;
        if (element <= array[mid]) {
            return FindInsertionPoint(array, first, mid, element);
        } else {
            return FindInsertionPoint(array, mid + 1, last, element);
        }
    }
}

