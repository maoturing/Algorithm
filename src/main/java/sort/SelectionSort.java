package sort;
import static sort.BubbleSort.swap;
/**
 * 选择排序: 每层外轮循环都能找到(select)未排序数据的最小值
 *           第i次循环,找出右侧乱序数组中最小值,放到第i个位置.数组左侧i+1个元素有序,i从0开始.
 * 最佳情况：T(n) = O(n^2)
 * 最差情况：T(n) = O(n^2)
 * 平均情况：T(n) = O(n^2)
 *
 * @author mao
 * @since 2019-3-4 15:17:17
 */
public class SelectionSort {
    public static int[] sort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) //找到未排序数据中最小的数
                    minIndex = j; //将最小数的索引保存
            }
            swap(array[minIndex], array[i]);
        }
        return array;
    }
}
