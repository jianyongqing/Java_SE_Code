package 数据结构与算法.Algorithm;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        // 只需要修改成对应的方法名就可以了
        heapSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    private static void heapSort(int[] arr){
        if(arr == null || arr.length <= 1){
            return;
        }
        int length = arr.length;

        // 构建大顶堆
        for(int i = length / 2 - 1;i>=0; i--){
            adjustHeap(arr,i,length);
        }

        // 调整堆结构+交换堆顶元素与末尾元素
        for(int j = length - 1; j > 0; j--){
            swap(arr,0,j);
            adjustHeap(arr,0,j);
        }

    }
    // 调整大顶堆
    private static void adjustHeap(int[] array, int i, int length) {
        //先取出当前元素i
        int temp = array[i];
        //从i结点的左子结点开始，也就是2i+1处开始
        for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
            //如果左子结点小于右子结点，k指向右子结点
            if (k + 1 < length && array[k] < array[k + 1]) {
                k++;
            }
            //如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
            if (array[k] > temp) {
                array[i] = array[k];
                i = k;
            } else {
                break;
            }
        }
        //将temp值放到最终的位置
        array[i] = temp;
    }

    private static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] =arr[b];
        arr[b] = temp;

    }
}
