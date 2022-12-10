package 数据结构与算法.Algorithm;

import java.util.Arrays;

public class InserterSort {
    // 插入排序
    public static void insertSort(int[] arr) {
        // 从第二个数开始，往前插入数字
        for (int i = 1; i < arr.length; i++) {
            int currentNumber = arr[i];
            int j = i - 1;
            // 寻找插入位置的过程中，不断地将比 currentNumber 大的数字向后挪
            while (j >= 0 && currentNumber < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            // 两种情况会跳出循环：1. 遇到一个小于或等于 currentNumber 的数字，跳出循环，currentNumber 就坐到它后面。
            // 2. 已经走到数列头部，仍然没有遇到小于或等于 currentNumber 的数字，也会跳出循环，此时 j 等于 -1，currentNumber 就坐到数列头部。
            arr[j + 1] = currentNumber;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // 静态初始化定义数组
        int arr[] = {2,6,5,1,7};
        InserterSort inserterSort = new InserterSort();
        inserterSort.insertSort(arr);
    }

}
