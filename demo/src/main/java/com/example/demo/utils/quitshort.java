package com.example.demo.utils;


/**\
 * 找一个基准点
 * 第一趟排序左边最小 右边最大
 */
public class quitshort {
    static int []a ={3,4,5,0,0,0};
    static int []b ={2,3,5};
    public static void quickSort(int [] arr ,int low,int high){
        int i,j,base,temp;
        i= low;
                j=high;
        if(low>high){
            return;
        }
        //temp就是基准位
        base = arr[low];

        while (i<j) {
            //先看右边，依次往左递减
            while (base<=arr[j]&&i<j) {
                j--;
            }
            //再看左边，依次往右递增
            while (base>=arr[i]&&i<j) {
                i++;
            }
            //如果满足条件则交换
            //if (i<j) {
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            //

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[base] = arr[i];
        arr[i] = base;
        //递归调用左半数组
        quickSort(arr, low, j-1);
        //递归调用右半数组
        quickSort(arr, j+1, high);
    }


    public static void main(String[] args){
        int[] arr = {10,7,2,4,7,62,3,4,2,1,8,9,19};
        quickSort(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }







    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //合并后最后一个数的索引为m+n-1
        int i = m-1;int j = n-1;int k = m+n-1;
        while(i >= 0 && j >= 0){
            //将两个数组中从最后一位开始比较，较大的先插入
            //当j先等于0时，说明nums2的数字已经全部复制到nums1中，此时合并完成(说明nums1中最小的元素比nums2小)
            //当i先等于0时，说明nums1中原来的所有数字已经复制完毕，此时进入下面的循环(说明nums1中最小的元素比nums2大)
            nums1[k--] = nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
        }
        while(j >= 0){
            nums1[k--] = nums2[j--];
        }
    }
}
