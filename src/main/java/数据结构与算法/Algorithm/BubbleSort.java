package 数据结构与算法.Algorithm;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr){
        // 初始时 swapped 为 true，否则排序过程无法启动
        boolean swapped = true;
        for (int i = 0; i < arr.length - 1; i++) {
            // 如果没有发生过交换，说明剩余部分已经有序，排序完成
            if (!swapped) break;
            // 设置 swapped 为 false，如果发生交换，则将其置为 true
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 如果左边的数大于右边的数，则交换，保证右边的数字最大
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // 表示发生了交换
                    swapped = true;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // 主函数
    public static void main(String[] args) {
        // 静态初始化定义数组
        int arr[] = {2,6,5,1,7};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr);


    }


}
