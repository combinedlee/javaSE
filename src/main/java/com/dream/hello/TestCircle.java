package com.dream.hello;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        //2.输入圆形半径，求圆形的周长和圆形的面积,并将结果输出。
        System.out.println("请输入圆的半径：");
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        System.out.println("圆的半径为：R="+r);
        System.out.println("圆的周长为：2*3.14*"+r+"="+2*3.14*r);
        System.out.println("圆的面积为：3.14*"+r+"*"+r+"="+3.14*r*r);
    }
}
