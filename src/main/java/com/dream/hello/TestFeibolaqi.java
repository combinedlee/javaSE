package com.dream.hello;

import java.util.Arrays;

public class TestFeibolaqi {
    public static void main(String[] args) {
        //编写递归算法程序：一列数的规则如下: 1、1、2、3、5、8、13、21、34...... 求数列的第40位数是多少。
        int next = getNext(40);
        System.out.println(next);
        int [ ] numbers=new int[ ]{1,2,3};
        System.out.println(Arrays.binarySearch(numbers, 2));
    }

    private static int getNext(int index){
        if (index<=0){
            return 0;
        }else if (index==1 || index ==2){
            return 1;
        }else {
            return getNext(index-1)+getNext(index-2);
        }
    }
}
