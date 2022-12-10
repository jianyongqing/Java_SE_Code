package 数据结构与算法.Algorithm;

import java.util.Arrays;

public class SelectionSort {
    // 选择排序
    public static void selectionSort(int[] arr) {
        int minIndex;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    // 记录最小值的下标
                    minIndex = j;
                }
            }
            // 将最小元素交换至首位
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    // 主函数
    public static void main(String[] args) {
        // 静态初始化定义数组
        int arr[] = {2,6,5,1,7};
        SelectionSort bubbleSort = new SelectionSort();
        bubbleSort.selectionSort(arr);
    }

}
