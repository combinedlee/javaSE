package com.dream.hello;

import java.util.Scanner;

public class TestTen2Two {
    public static void main(String[] args) {
        //从键盘输入某个十进制整数数，转换成对应的二进制整数并输出。
        System.out.println("请输入一个十进制数:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String string = "";
        do {
            string =  num%2 + string;
            num = num / 2;
        }while (num!=0);
        System.out.println("对应的二进制数为："+string);
    }
}
