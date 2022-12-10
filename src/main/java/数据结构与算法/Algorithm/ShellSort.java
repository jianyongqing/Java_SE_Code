package 数据结构与算法.Algorithm;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int[] array = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        shellSort(array);

        System.out.println(Arrays.toString(array));
    }

    public static void shellSort(int[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        int length = array.length;

        // temp为临时变量，gap增量默认是长度的一半，每次变为之前的一半，直到最终数组有序
        int temp, gap = length / 2;

        while (gap > 0) {
            for (int i = gap; i < length; i++) {
                // 将当前的数与减去增量之后位置的数进行比较，如果大于当前数，将它后移
                temp = array[i];
                int preIndex = i - gap;

                while (preIndex >= 0 && array[preIndex] > temp) {
                    array[preIndex + gap] = array[preIndex];
                    preIndex -= gap;
                }

                // 将当前数放到空出来的位置
                array[preIndex + gap] = temp;

            }
            gap /= 2;
        }
    }

}
