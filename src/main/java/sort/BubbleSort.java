package sort;

/**
 * 冒泡排序: 每次外层循环都能保证一个最大值冒泡(Bubble)到右侧.
 *          第i次循环之前,已经有i个元素在数组右侧有序,i从0开始
 * 最佳情况：T(n) = O(n)  最差情况：T(n) = O(n^2)   平均情况：T(n) = O(n^2)
 *
 * @author mao
 * @since 2019-3-4 15:17:17
 */
public class BubbleSort {

    /**
     * @param array
     * @return
     */
    public static int[] bubbleSort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {    // 第i次循环,右侧i个元素已经有序
                if (array[j + 1] < array[j]) {
                    swap(array[j + 1], array[j]);
                }
            }
        }
        return array;
    }

    /**
     * 交换元素a与b
     * 排序算法中经常用到,需要三步完成,为了便于读者专注于排序逻辑本身,故将其抽象为一个静态泛型方法,使用时静态导入即可
     * @param a
     * @param b
     * @param <T>
     */
    public static<T> void swap(T a, T b){
        T temp = a;
        a = b;
        b = temp;
    }

    /**
     * 改进版本的冒泡排序,参考小灰
     */
}
