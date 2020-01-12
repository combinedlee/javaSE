package com.dream.hello;

public class TestDesposit {
    public static void main(String[] args) {
        //3.银行利率表如下表所示，请计算存款10000元，活期1年、活期2年，定期1年，定期2年后的本息合计。
        double money = 10000;
        System.out.println("本金："+money);
        System.out.println("活期1年本金总计："+Math.round(money+money*0.35/100));
        System.out.println("定期1年本金总计："+Math.round(money+money*1.5/100));
        System.out.println("活期2年本金总计："+Math.round(money+money*0.35*2/100));
        System.out.println("定期2年本金总计："+Math.round(money+money*2.1*2/100));
    }
}
