package sort;

/**
 * 插入排序: 每次外层循环,都能将第i+1个元素插入(insert)到前面的有序数组中
 * 最佳情况：T(n) = O(n)  最差情况：T(n) = O(n^2)   平均情况：T(n) = O(n^2)
 *
 * @author mao
 * @since 2019-3-4 15:17:17
 */
public class InsertionSort {
    public static int[] sort(int[] array) {
        if (array.length == 0)
            return array;
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) {
                // 从有序数组的右侧开始,右移所有有序元素,直到找到元素current的插入位置(current < array[preIndex])
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            //插入元素
            array[preIndex + 1] = current;
        }
        return array;
    }
}
