package com.dream.sort;

public class BlobSort {
    //冒泡排序
    public static void main(String[] args) {
        int [] array = new int[]{2,77,23,53,29,6,99,11};
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length-i-1;j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
    }
}
