package sort;
import static sort.BubbleSort.swap;

/**
 * 快速排序:
 * 最佳情况：T(n) = O(nlogn)
 * 最差情况：T(n) = O(n2)
 * 平均情况：T(n) = O(nlogn)　
 * @author mao
 * @since 2019-3-4 15:17:17
 */
public class QuickSort {
    public static int[] sort(int[] array, int start, int end) {
        if (array.length < 1 || start < 0 || end >= array.length || start > end) return null;
        int smallIndex = partition(array, start, end);
        if (smallIndex > start)
            sort(array, start, smallIndex - 1);
        if (smallIndex < end)
            sort(array, smallIndex + 1, end);
        return array;
    }
    /**
     * 快速排序算法——partition
     * @param array
     * @param start
     * @param end
     * @return
     */
    public static int partition(int[] array, int start, int end) {
        int pivot = (int) (start + Math.random() * (end - start + 1));
        int smallIndex = start - 1;
        swap(array[pivot], array[end]);
        for (int i = start; i <= end; i++)
            if (array[i] <= array[end]) {
                smallIndex++;
                if (i > smallIndex)
                    swap(array[i], array[smallIndex]);
            }
        return smallIndex;
    }
}
