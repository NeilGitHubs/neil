package com.hankun.neil.sort;

/**
 * @author neil
 * @ClassName: CountSort
 * @Description: TODO
 * @date 2021/3/25 17:12
 */
public class CountSort {
    public static int[] countSort(int[] A) {
        int max = A[0], min = A[0];
        for (int i : A) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }

        //二：有了最大值和最小值能够确定中间数组的长度
        //存储5-0+1 = 6
        int[] pxA = new int[max - min + 1];

        //三.循环遍历旧数组计数排序: 就是统计原始数组值出现的频率到中间数组B中
        for (int i : A) {
            pxA[i - min] += 1;//数的位置 上+1
        }

        //四.遍历输出
        //创建最终数组，就是返回的数组，和原始数组长度相等，但是排序完成的
        int[] result = new int[A.length];
        int index = 0;//记录最终数组的下标

        //先循环每一个元素  在计数排序器的下标中
        for (int i = 0; i < pxA.length; i++) {
            //循环出现的次数
            for (int j = 0; j < pxA[i]; j++) {//pxA[i]:这个数出现的频率
                result[index++] = i + min;//以为原来减少了min现在加上min，值就变成了原来的值
            }
        }
        return result;
    }

}
