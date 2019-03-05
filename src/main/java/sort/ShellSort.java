package sort;
/**
 * 希尔排序:
 * 最佳情况：T(n) = O(nlogn)
 * 最坏情况：T(n) = O(nlogn)
 * 平均情况：T(n) = O(nlogn)　
 *
 * @author mao
 * @since 2019-3-4 15:17:17
 */
public class ShellSort {
    public static int[] sort(int[] array) {
        int len = array.length;
        int temp, gap = len / 2;
        while (gap > 0) {
            for (int i = gap; i < len; i++) {
                temp = array[i];
                int preIndex = i - gap;
                while (preIndex >= 0 && array[preIndex] > temp) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }
                array[preIndex + gap] = temp;
            }
            gap /= 2;
        }
        return array;
    }
}
