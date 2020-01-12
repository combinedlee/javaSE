package com.dream.hello;

public class TestEncryption2 {
    public static void main(String[] args) {
        //2.利用”异或”运算的性质,对几个字符进行加密并输出密文,然后再解密。加密算法是：密钥是字符’8’，
        // 明文的每个字符和密钥进行异或运算，得到密文。密钥和密文的每个字符再次进行异或运算，重新得到明文。
        char key = '8';
        char a1 = '十';
        char a2 = '点';
        char a3 = '进';
        char a4 = '攻';

        System.out.println("加密前密文："+a1+a2+a3+a4);
        a1 = (char) (a1 ^ key);
        a2 = (char) (a2 ^ key);
        a3 = (char) (a3 ^ key);
        a4 = (char) (a4 ^ key);
        System.out.println("加密后密文："+a1+a2+a3+a4);
        a1 = (char) (a1 ^ key);
        a2 = (char) (a2 ^ key);
        a3 = (char) (a3 ^ key);
        a4 = (char) (a4 ^ key);
        System.out.println("解密后密文："+a1+a2+a3+a4);

    }
}
