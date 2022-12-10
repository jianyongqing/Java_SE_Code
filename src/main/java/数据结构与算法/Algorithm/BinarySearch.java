package 数据结构与算法.Algorithm;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,3,5,6,8,11};
        int key = 5;
        // int result = commoBinarySearch(arr,key);
        int result = recursionBinarySearch(arr,key,0,arr.length-1);
        System.out.println(result);
    }

    /**
     * 递归实现二分查找
     */
    private static int recursionBinarySearch(int[] arr,int key,int low,int high){
        if(key<arr[low]||key>arr[high]||low>high){
            return -1;
        }
        int middle = (low + high) / 2;			//初始中间位置
        if(arr[middle] > key){
            //比关键字大则关键字在左区域
            return recursionBinarySearch(arr, key, low, middle - 1);
        }else if(arr[middle] < key){
            //比关键字小则关键字在右区域
            return recursionBinarySearch(arr, key, middle + 1, high);
        }else {
            return middle;
        }

    }

    /**
     * 循环实现二分查找
     */
    private static int commoBinarySearch(int arr[],int key){
        int low = 0;
        int high = arr.length-1;
        int middle;

        if(key < arr[low]||key>arr[high]||low>high){
            return -1;
        }

        while (low<=high){
            middle = (low+high)/2;
            if (arr[middle]>key)
                high = middle-1;
            else if(arr[middle]<key)
                low = middle+1;
            else
                return middle;
        }

        return -1;
    }



}
