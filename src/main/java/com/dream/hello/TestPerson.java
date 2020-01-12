package com.dream.hello;

import java.util.Scanner;

public class TestPerson {
    public static void main(String[] args) {
        //1.输入自己的名字，年龄和性别，分别用不同的变量接收，并将输入的信息做输出。
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your name here:");
        String name = scanner.next();
        System.out.println("Please input your age here:");
        int age = scanner.nextInt();
        System.out.println("Please input your gender here");
        String gender = scanner.next();
        System.out.println("The computer recorded that:");
        System.out.println("Your name is:"+name);
        System.out.println("Your age is:"+age);
        System.out.println("Your gender is:"+gender);

    }
}
