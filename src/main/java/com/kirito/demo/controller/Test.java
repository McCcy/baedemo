package com.kirito.demo.controller;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Integer[] arr = new Integer[26];
        Random rand = new Random();
        for (int i = 0; i < 26; i++) {
            arr[i] = rand.nextInt(25) + 0;
            System.out.println(arr[i]);
        }
        System.out.println(test1(arr));
    }

    public static int test(int n, int count) {
        int num;
        if (n % 2 == 1) {
            num = (n - 1) / 2;
            count = count + 1;
        } else {
            num = n / 2;
        }
        if (num != 0) {
            return test(num, count);
        }
        return count;

    }

    public static boolean test1(Integer[] arr) {
        boolean flag = true;
        for (int i = 0; i <= 25; i++) {
            if (i == arr[i]) {
                flag = false;
            }
        }
        return flag;
    }
}
