package com.ngu.runnable.demo1;

/**
 * @Author: 李良超
 * @Date: Created in 2019/4/25 22:59
 * @Description:
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        int count = 1000;
        for (int i = 0; i < count; i++) {
            System.out.println(i + " $$$");
        }
    }
}
