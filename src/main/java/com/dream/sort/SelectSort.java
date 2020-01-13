package com.dream.sort;

public class SelectSort {
    public static void main(String[] args) {
        //选择排序
        int [] array = new int[]{12,44,2,45,366,34};
        for (int i=0;i<array.length;i++){
            int index = i;
            for (int j=i+1;j<array.length;j++){
                if (array[j]<array[index]){
                    index = j;
                }
            }
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
    }
}
