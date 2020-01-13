package com.dream.sort;

import java.util.Arrays;

public class DivSeach {
    public static void main(String[] args) {
        /**
         * 5.二分法查找操作：使用二分法查找有序数组中元素。找到返回索引，不存在输出-1。
         分析：二分法查找的前提是数组有序。
         假如有一组数为3，12，24，36，55，68，75，88要查给定的值24.可设三个变量front，mid，end分别指向数据的上界，
         中间和下界，mid=（front+end）/2.　　
         1)开始令front=0（指向3），end=7（指向88），则mid=3（指向36）。因为mid>x，故应在前半段中查找。
         2)令新的end=mid-1=2，而front=0不变，则新的mid=1。此时x>mid，故确定应在后半段中查找。
         3)令新的front=mid+1=2，而end=2不变，则新mid=2，此时a[mid]=x，查找成功。
         4)如要查找的数不是数列中的数，例如x=25，当第三次判断时，x>a[mid]，按以上规律，令front=mid+1，即front=3，
         出现front>end的情况，表示查找不成功。
         */
        int[] array = {3,12,24,36,55,68,75,88};
        int len = array.length;
        int maxIndex = len-1;
        int minIndex = 0;
        int midIndex = len/2;
        int target = 87;
        int count =0;
        while(minIndex<maxIndex){
            if (target>array[midIndex]){
                minIndex = midIndex+1;
                midIndex= (maxIndex + midIndex) / 2 ;
            }else if (target<array[midIndex]){
                maxIndex = midIndex-1;
                midIndex = (midIndex+minIndex)/2 ;
            }else if (array[midIndex]==target){
                break;
            }
            count++;
        }
        System.out.println(count);
        System.out.println(midIndex);
    }
}
