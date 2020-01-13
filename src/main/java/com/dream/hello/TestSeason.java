package com.dream.hello;

import java.util.Scanner;

public class TestSeason {
    public static void main(String[] args) {
        //3.根据月份，输出对应的季节，并输出至少两个描述该季节的成语和活动。

        do {
            System.out.println("请输入月份：");
            Scanner scanner = new Scanner(System.in);
            int season = scanner.nextInt();
            if (season>0 && season<=3){
                System.out.println("春天");
            }else if(season>3 && season<=6) {
                System.out.println("夏天");
            }else if (season>6 && season<=9){
                System.out.println("秋天");
            }else if (season>9 && season<=12){
                System.out.println("冬天");
            }else {
                System.out.println("输入错误");
            }
        }while (true);
    }
}
