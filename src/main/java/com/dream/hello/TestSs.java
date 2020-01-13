package com.dream.hello;

import java.util.Scanner;

public class TestSs {
    public static void main(String[] args) {
       // 判断一个数是否是素数。
        System.out.println("请输入一个正整数：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count=0;
        for (int i=2;i<num;i++){
            if (num%i == 0){
                break;
            }
            count++;
        }
        if (count==num-2){
            System.out.println("是素数");
        }else{
            System.out.println("不是素数");
        }
    }
}
