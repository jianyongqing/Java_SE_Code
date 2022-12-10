package 数据结构与算法.Algorithm;

import java.util.Arrays;

/**
 * Radix Sort 基数排序
 */
public class RadixSort {
    public static void main(String[] args) {
        int[] array = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        // 只需要修改成对应的方法名就可以了
        radixSort(array);

        System.out.println(Arrays.toString(array));
    }

    public static void radixSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int length = array.length;

        // 每位数字范围0~9，基为10
        int radix = 10;
        int[] aux = new int[length];
        int[] count = new int[radix + 1];
        // 以关键字来排序的轮数，由位数最多的数字决定，其余位数少的数字在比较高位时，自动用0进行比较
        // 将数字转换成字符串，字符串的长度就是数字的位数，字符串最长的那个数字也拥有最多的位数
        int x = Arrays.stream(array).map(s -> String.valueOf(s).length()).max().getAsInt();

        // 共需要d轮计数排序, 从d = 0开始，说明是从个位开始比较，符合从右到左的顺序
        for (int d = 0; d < x; d++) {
            // 1. 计算频率，在需要的数组长度上额外加1
            for (int i = 0; i < length; i++) {
                // 使用加1后的索引，有重复的该位置就自增
                count[digitAt(array[i], d) + 1]++;
            }
            // 2. 频率 -> 元素的开始索引
            for (int i = 0; i < radix; i++) {
                count[i + 1] += count[i];
            }

            // 3. 元素按照开始索引分类，用到一个和待排数组一样大临时数组存放数据
            for (int i = 0; i < length; i++) {
                // 填充一个数据后，自增，以便相同的数据可以填到下一个空位
                aux[count[digitAt(array[i], d)]++] = array[i];
            }
            // 4. 数据回写
            for (int i = 0; i < length; i++) {
                array[i] = aux[i];
            }
            // 重置count[]，以便下一轮统计使用
            for (int i = 0; i < count.length; i++) {
                count[i] = 0;
            }

        }
    }

    private static int digitAt(int value, int d) {
        return (value / (int) Math.pow(10, d)) % 10;
    }

}
