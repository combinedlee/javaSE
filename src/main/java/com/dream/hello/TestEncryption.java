package com.dream.hello;

import java.util.Scanner;

public class TestEncryption {
    public static void main(String[] args) {
        //某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：每位数字都加上5,
        // 然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换
        System.out.print("请输入一个4位的正整数：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = stringSize(num);
        while (count != 4){
            System.out.print("输入长度有误，请重新输入：");
            num = scanner.nextInt();
            count = stringSize(num);
        }
        //个位数
        int ge = num % 10;
        //十位数
        int shi = num % 100 / 10;
        //百位数
        int bai = num % 1000 / 100;
        //千位数
        int qian = num / 1000;
        ge += 5;
        shi += 5;
        bai += 5;
        qian +=5;
        ge %= 10;
        shi %= 10;
        bai %= 10;
        qian %= 10;
        num = 1000 * ge + 100 * shi + 10 * bai + qian;
        System.out.println("加密后的数字为："+num);
    }

    private final static int [] sizeTable = { 9, 99, 999, 9999, 99999, 999999, 9999999,
            99999999, 999999999, Integer.MAX_VALUE };

    // Requires positive x
    private static int stringSize(int x) {
        for (int i=0; ; i++)
            if (x <= sizeTable[i])
                return i+1;
    }
}
