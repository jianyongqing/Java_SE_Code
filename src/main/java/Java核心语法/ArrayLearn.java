package Java核心语法;

import java.util.Arrays;

public class ArrayLearn {

    public static void main(String[] args) {
        // 一维数组

        int[] numbers = {1,2,4,5,8,9};
        // int arr[] = new int[5];
        // int arr[]= new int[5] {}
        System.out.println(Arrays.toString(numbers));

        // 二维数组

        int[][] a1 = {
                {1,2},
                {2,1},
                {5,9}
        };
        // int a[][] = new int[4][3];

        for(int i = 0; i<a1.length;i++){
            for(int j =0; j<a1[i].length; j++){
                System.out.println(a1[i][j]);
            }
        }

        // 数组的基本操作
        arraymanipulation();

    }

    /**
     *  数组的基本操作
     */
    public static void arraymanipulation(){
        // 遍历数组

        // 填充替换数组元素
        int arr[] = new int[5];
        Arrays.fill(arr,8); // fill(int[] a, int value)可将指定的int值分配给int型数组的每个元素;
        System.out.println(Arrays.toString(arr));
        int arr2[] = new int[] {45, 12, 2, 10}; // fill(int[] a, int fromIndex, int toIndex, int value)将指定的int值分配给int型数组指定范围中的某个元素
        Arrays.fill(arr2,1,3,8);
        System.out.println(Arrays.toString(arr2));

        // 对数组进行排序
        int t[] = new int[]{23, 42, 12, 8};
        Arrays.sort(t);
        System.out.println(Arrays.toString(t));

        // 复制数组
        int arrgo[] = new int[]{23, 42, 12};
        int newarrgo[] = Arrays.copyOf(arrgo, 5);
        int arrgo2[] = new int[] {1, 2 , 5, 4, 8, 2};
        int newarrgo2[] = Arrays.copyOfRange(arrgo2, 2, 5); // copyOfRange(arr, int fromIndex, int toIndex)新数组不包括索引是toIndex的元素
        System.out.println(Arrays.toString(newarrgo2));

        // 数组查询
        int ia[] = new int[] {1, 8, 9, 4, 5};
        Arrays.sort(ia); // 如果没有对数组进行排序, 则结果是不确定的. 如果数组包含多个带有指定值的元素, 则无法保证找到的是哪一个
        int index = Arrays.binarySearch(ia, 4);
        System.out.println(index); // 运行结果为"1",是对数组ia进行排序后元素4的索引位置
        String str[] = new String[]{"ab", "cd", "ef", "yz"};
        Arrays.sort(str);
        int index2 = Arrays.binarySearch(str, 0, 2,"cd"); // 在指定范围内索引
        System.out.println(index2);
    }
}
