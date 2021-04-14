package com.hankun.neil.sort;

/**
 * @author neil
 * @ClassName: HeapSort
 * @Description: TODO
 * @date 2021/3/24 17:35
 */
public class HeapSort {
    public static void MaxHead(int[] arr,int length,int index) {
        int left =2*index+1;//左孩子
        int right =2*index+2;//右孩子
        int maxindex =index;//最大数

        if (left<length && arr[left] < arr[maxindex]) {
            maxindex = left;
        }if (right<length && arr[right] < arr[maxindex]) {
            maxindex = right;
        }if (maxindex!=index) {
            swap(arr,index,maxindex);
            MaxHead(arr,length, maxindex);
        }

    }
    //创建堆
    public static void CreateHead(int[] arr) {
        int parent =arr.length/2-1;//找到最后一个有孩子的节点
        for(int i =parent;i>=0;i--) {
            MaxHead(arr,arr.length,i);//调用交换节点数据的方法，将最大的数移到顶端节点
        }
    }
    public static void HeadSort(int[] arr) {
        //如果数组为空，或数组长度为1 直接退出 不需要在排序了
        if (arr ==null ||arr.length<=1) {
            return;
        }
        CreateHead(arr);
        //遍历选取最后一个值跟根节点交换，并排除最后一个叶子节点，重复堆的数值交换
        for (int i = arr.length-1; i >=1; i--) {
            swap(arr, 0, i);
            MaxHead(arr,i,0);
        }
    }
    //数值交换的方法
    public static void swap(int[] arr,int x,int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    //main 主函数执行操作
    public static void main(String[] args) {
        int a[] = { 6,8,6,2,7,56,50,51,89,65 };
        HeadSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"  ");
        }
    }
}
